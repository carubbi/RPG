"""Indexed min-priority queue (port of the algs4 `IndexMinPQ` in Java).

Same logic as the original: binary min-heap plus the inverse vector `qp`,
with `qp[pq[i]] == pq[qp[i]] == i`. The only adaptation is a 0-based heap
(the Java version is 1-based) so that `pq.pq` stays as the list that the
trace and the panel consume. Operations follow the Java order: `change` is
swim then sink; `delete`/`del_min` swap with the last element and restore the heap.
"""


class IndexMinPQ:

    def __init__(self, max_n):
        if max_n < 0:
            raise ValueError("maxN must be non-negative")
        self.max_n = max_n
        self.pq = []                    # heap: pq[k] = vertex index
        self.qp = [-1] * max_n          # inverse: qp[i] = position of i in the heap
        self.keys = [None] * max_n      # keys[i] = vertex i priority

    def is_empty(self):
        return not self.pq

    def size(self):
        return len(self.pq)

    def _validate_index(self, i):
        if i < 0 or i >= self.max_n:
            raise IndexError(f"index out of range: {i}")

    def contains(self, i):
        self._validate_index(i)
        return self.qp[i] != -1

    def insert(self, i, item):
        if self.contains(i):
            raise ValueError("index is already in the priority queue")
        self.pq.append(i)
        k = len(self.pq) - 1
        self.qp[i] = k
        self.keys[i] = item
        self.swim(k)

    def min_index(self):
        if not self.pq:
            raise IndexError("priority queue underflow")
        return self.pq[0]

    def min(self):
        return self.keys[self.min_index()]

    def key_of(self, i):
        if not self.contains(i):
            raise KeyError("index is not in the priority queue")
        return self.keys[i]

    def change(self, i, item):
        if not self.contains(i):
            raise KeyError("index is not in the priority queue")
        self.keys[i] = item
        self.swim(self.qp[i])
        self.sink(self.qp[i])

    def decrease_key(self, i, key):
        if not self.contains(i):
            raise KeyError("index is not in the priority queue")
        if self.keys[i] <= key:
            raise ValueError("calling decrease_key with a value not smaller than the current key")
        self.keys[i] = key
        self.swim(self.qp[i])

    def increase_key(self, i, key):
        if not self.contains(i):
            raise KeyError("index is not in the priority queue")
        if self.keys[i] >= key:
            raise ValueError("calling increase_key with a value not greater than the current key")
        self.keys[i] = key
        self.sink(self.qp[i])

    def del_min(self):
        if not self.pq:
            raise IndexError("priority queue underflow")
        m = self.pq[0]
        self._exchange(0, len(self.pq) - 1)
        self.pq.pop()
        self.sink(0)
        self.qp[m] = -1
        self.keys[m] = None
        return m

    def delete(self, i):
        if not self.contains(i):
            raise KeyError("index is not in the priority queue")
        index = self.qp[i]
        self._exchange(index, len(self.pq) - 1)
        self.pq.pop()
        # In Java, `exch(index, n--)` leaves `index == n+1` when removing the
        # last item; there `swim`/`sink` do nothing (the heap value at that
        # position is already valid and `sink` stops at `2*k <= n`). With a
        # list, the extra slot does not exist: skipping both calls is the same.
        if index < len(self.pq):
            self.swim(index)
            self.sink(index)
        self.keys[i] = None
        self.qp[i] = -1

    def greater(self, i, j):
        return self.keys[self.pq[i]] > self.keys[self.pq[j]]

    def _exchange(self, i, j):
        self.pq[i], self.pq[j] = self.pq[j], self.pq[i]
        self.qp[self.pq[i]] = i
        self.qp[self.pq[j]] = j

    def swim(self, k):
        while k > 0 and self.greater((k - 1) // 2, k):
            self._exchange(k, (k - 1) // 2)
            k = (k - 1) // 2

    def sink(self, k):
        N = len(self.pq)

        while 2 * k + 1 <= N - 1:
            j = 2 * k + 1
            if j < N - 1 and self.greater(j, j + 1):
                j += 1

            if not self.greater(k, j):
                break

            self._exchange(k, j)
            k = j
