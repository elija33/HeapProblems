package HeapifyandExtract.Heapify;

import java.security.DrbgParameters.Capability;

public class Heap {
    public static class HeapifyWork {
        int size;
        int capacity;
        int arr[];

        public HeapifyWork(int c) {
            arr = new int[c];
            size = 0;
            capacity = c;
        }

        public int parter(int i) {
            return (i - 1) / 2;
        }

        public int right(int i) {
            return 2 * i + 2;
        }

        public int left(int i) {
            return 2 * i + 1;
        }

        public void insertelement(int element) {
            if (size == capacity)
                return;
            size++;
            arr[size - 1] = element;
            for (int i = size - 1; i != 0 && arr[parter(i)] > arr[i];) {
                int temp = arr[i];
                arr[i] = arr[parter(i)];
                arr[parter(i)] = temp;
                i = parter(i);
            }

        }

        public void minHeapify(int i) {
            int rightside = right(i);
            int leftside = left(i);
            int smallnumber = i;
            // checking if both right and left side of the heap exist
            if (leftside < size && arr[leftside] < arr[i])
                smallnumber = leftside;
            if (rightside < size && arr[rightside] < arr[smallnumber])
                smallnumber = rightside;
            if (smallnumber != i) {
                int temp = arr[i];
                arr[i] = arr[smallnumber];
                arr[smallnumber] = temp;

            }
        }
    }

    public static void main(String[] args) {

    }
}
