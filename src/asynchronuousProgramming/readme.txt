/*
* Asynchronous programming provides a non-blocking, event-driven programming model.
* parallel programming in which a unit of work runs separately from the main application thread
* and notifies the calling thread of its completion, failure or progress.
*/

1. Concurrency: Multiple Tasks makes progress at the same time.
2. Parallelism: Each tasks broken into sub tasks which can be processed in parallel
3. A process runs independently and isolated of other processes. It cannot directly access shared data in other processes.
4. A thread is a so called lightweight process. It has its own call stack, but can access shared data of other threads in the same process.

/*
* A Java application runs by default in one process.
* Within a Java application you work with several threads to achieve parallel processing or asynchronous behavior.
*/

Concurrency issues:
Threads have their own call stack, but can also access shared data. Therefore you have two basic problems, visibility and access problems.

    > Liveness failure: The program does not react anymore due to problems in the concurrent access of data, e.g. deadlocks.
    > Safety failure: The program creates incorrect data.

The synchronized keyword in Java ensures: A thread pool can be described as a collection of Runnable objects.

    > that only a single thread can execute a block of code at the same time
    > that each thread entering a synchronized block of code sees the effects of all previous modifications that were guarded by the same lock

volatile:  keyword it is guaranteed that any thread that reads the field will see the most recently written value
An atomic operation: is an operation which is performed as a single unit of work without the possibility of interference from other operations.
    > i++ (increment) operation

Immutability
The simplest way to avoid problems with concurrency is to share only immutable data between threads.
Immutable data is data which cannot changed.
        //An object is considered immutable if its state cannot change after it is constructed. Maximum reliance on immutable objects is widely accepted as a sound strategy for creating simple, reliable code.


