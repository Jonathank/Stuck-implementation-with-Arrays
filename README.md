# Stack-implementation-with-Arrays

As our first implementation of the stack ADT, we store elements in an array, named data, with capacity N for some fixed N. We oriented the stack so that the bottom element of the stack is always stored in cell data[0], and the top element of the stack in cell data[t] for index t that is equal to one less than the current size of the
stack.

#Array reverse using stack include as wel
As a consequence of the LIFO protocol, a stack can be used as a general toll to reverse a data sequence. For example, if the values 1, 2, and 3 are pushed onto a stack in that order, they will be popped from the stack in the order 3, 2, and then 1.
We demonstrate this concept by revisiting the problem of reversing the elements of an array. We create an empty stack for auxiliary storage, push all of the array elements onto the stack, and then pop those elements off of the stack while overwriting the cells of the array from beginning to end