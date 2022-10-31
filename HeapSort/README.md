# HeapProblems
                                                Heap Sort

                                            What is Heap Sort
Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. Repeat the same process for the remaining elements.


                                                    Advantages of heapsort
Efficiency –  The time required to perform Heap sort increases logarithmically while other algorithms may grow exponentially slower as the number of items to sort increases. This sorting algorithm is very efficient.

Memory Usage – Memory usage is minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work.

Simplicity –  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion.

                                                What is meant by Heapify? 
Heapify is the process of creating a heap data structure from a binary tree represented using an array. It is used to create Min-Heap or Max-heap. Start from the first index of the non-leaf node whose index is given by n/2 – 1. Heapify uses recursion

                                            Algorithm for Heapify:
The root use : i - 1 / 2
The right use : 2 * i + 2
The left use : 2 * i + 1

            index   0 1 2 3 4  5  6 7 8  9 10
Given any array of [1,3,5,4,6,13,10,9,8,15,17]

root ==> 0 - 1 / 2 = 

right use => 2 * 0 + 2 = 2 ==> 5
right use => 2 * 1 + 2 = 4 ==> 6
right use => 2 * 2 + 2 = 6 ==> 10
             2 * 3 + 2 = 8 ==> 8 
             2 * 4 + 2 = 10 ==> 17

left use => 2 * 0 + 1 = 1 ==> 3
left use => 2 * 1 + 1 = 3 ==> 4
left use => 2 * 2 + 1 = 5 ==> 13
left use => 2 * 3 + 1 = 7 ==> 9
left use => 2 * 4 + 1 = 9 ==> 15

                                1                   1                 1                             17
                              /   \                /  \     ==>      /  \                        /     \
                            3      5    ==>       3    5           17      13   ==>            15      13 
                          /   \   /  \          /  \   / \        /  \    /  \               /   \     /  \
                        4     6   13   10      4    17  13  10   9   15   5   10            9      6   5   10
                      /  \   /  \            /  \   / \        /  \  / \                  /  \    /  \ 
                    9    8  15  17          9    8 15  6      4    8 3  6                4   8   3    1

                                                

                                                
                                                Implementation of Heap Sort
Build complete Binary Tree  
Make it a max heap  
    - The big element will be at the top root of the tree and the small element will be the node. {4,10,3,5,1}.
                                
                                Example of Max Heap
                                         4                          10
                                     /      \                    /      \
                                   10        3       ===>       5         3            
                                /     \                      /     \
                              5         1                   4       1

Make it a min heap
    - The smallest element will be at the top of the root, and the biggest elememt will be the node. {4,10,3,5,1}.

                                    Example of Min Heap
                                            4                  1
                                        /     \   ==>        /    \
                                      10       3           4        3
                                   /     \               /   \
                                 5         1            5      10

Sort the array
Heapify the elements in the array
