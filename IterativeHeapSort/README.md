# HeapProblems
                                                    Heap Sort
Is a comparison based sorting technique where we first build Max Heap and then swaps the root element with last element size times and maintains the heap properly each time to finally make it sorted.

Example 1:

Input: 10 20 15 17 9 21

            10                        10                    9
          /    \                    /   \                 /   \
        20      15  ==>            9     15  ==>        10    15
      /    \   /                 /   \   /            /  \    /
    17      9  21              17    20  21         17   20  21

output: [9 10 15 17 20 21]

Example 2:

Input : [12, 11, 13, 5, 6, 7, 15, 5, 9]
Output:

            12                           12                                 5
          /    \                       /    \          ==>               /    \
        11      13      ==>           5       7                         5      6 
       /  \    /   \                /   \    /  \                     /  \    /  \
      5    6  7     15             5     6  13    15                 7   11  12   13
    /   \                        /   \                             /  \  
   5     9                     11     9                          15    19