"""
Execution:    python -m algs4.flow_edge

% python -m algs4.flow_edge
12->23 0.0/4.56

Capacitated edge with a flow in a flow network (port of FlowEdge.java from algs4).

Directed edge v->w with real-valued capacity and flow. The same edge appears in
the adjacency lists of BOTH endpoints (`FlowNetwork.add_edge`), and the
direction of the flow is given by `residual_capacity_to` /
`add_residual_flow_to`: going "to the tail" (`v`) returns the flow (backward
edge of the residual network); going "to the head" (`w`) returns capacity
minus flow (forward edge).

Package convention: `v`, `w`, `capacity` and `flow` are attributes (like
`Edge.weight`); there are no `capacity()`/`flow()` accessors as in Java.
"""


class FlowEdge:
    # to deal with floating-point roundoff errors
    FLOATING_POINT_EPSILON = 1.0E-10

    def __init__(self, v, w=None, capacity=None, flow=None):
        # copy constructor: FlowEdge(e)
        if isinstance(v, FlowEdge):
            e = v
            self.v = e.v
            self.w = e.w
            self.capacity = e.capacity
            self.flow = e.flow
            return
        if v < 0:
            raise ValueError("vertex index must be a non-negative integer")
        if w < 0:
            raise ValueError("vertex index must be a non-negative integer")
        if not (capacity >= 0.0):
            raise ValueError("Edge capacity must be non-negative")
        if flow is not None:
            if not (flow <= capacity):
                raise ValueError("flow exceeds capacity")
            if not (flow >= 0.0):
                raise ValueError("flow must be non-negative")
        self.v = int(v)
        self.w = int(w)
        self.capacity = float(capacity)
        self.flow = 0.0 if flow is None else float(flow)

    def from_(self):
        return self.v

    def to(self):
        return self.w

    def other(self, vertex):
        if vertex == self.v:
            return self.w
        elif vertex == self.w:
            return self.v
        else:
            raise ValueError("invalid endpoint")

    def residual_capacity_to(self, vertex):
        if vertex == self.v:
            return self.flow                 # backward edge
        elif vertex == self.w:
            return self.capacity - self.flow  # forward edge
        else:
            raise ValueError("invalid endpoint")

    def add_residual_flow_to(self, vertex, delta):
        if not (delta >= 0.0):
            raise ValueError("Delta must be non-negative")
        if vertex == self.v:
            self.flow -= delta                # backward edge
        elif vertex == self.w:
            self.flow += delta                # forward edge
        else:
            raise ValueError("invalid endpoint")
        # round flow to 0 or capacity if within floating-point precision
        if abs(self.flow) <= FlowEdge.FLOATING_POINT_EPSILON:
            self.flow = 0.0
        if abs(self.flow - self.capacity) <= FlowEdge.FLOATING_POINT_EPSILON:
            self.flow = self.capacity
        if not (self.flow >= 0.0):
            raise ValueError("Flow is negative")
        if not (self.flow <= self.capacity):
            raise ValueError("Flow exceeds capacity")

    def __str__(self):
        return "%d->%d %s/%s" % (self.v, self.w, self.flow, self.capacity)


if __name__ == '__main__':
    e = FlowEdge(12, 23, 4.56)
    print(e)
