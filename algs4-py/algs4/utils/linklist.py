class Node:

    def __init__(self, item, next_node):
        self.item = item
        self.next = next_node


class LinkIterator:

    def __init__(self, current):
        self.current = current

    def __iter__(self):
        # PEP 234: an iterator must return itself. Comprehensions call
        # GET_ITER (iter()) on the object returned by `Bag.__iter__` as
        # well as on the Bag itself: Python 3.12+ does this twice for
        # inlined list comprehensions (PEP 709), and generator
        # expressions have always done it. Without `__iter__` here,
        # `[x for x in bag]` and `" ".join(str(x) for x in bag)` raise
        # TypeError. A plain `for` loop and `list(bag)` work either way.
        return self

    def __next__(self):
        if self.current is None:
            raise StopIteration()
        else:
            item = self.current.item
            self.current = self.current.next
            return item
