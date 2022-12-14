package HeapifyandExtract.ExtractHeapify;

public class ExtractH {
    public static class Extract {
        int size;
        int capacity;
        int arr[];

        public Extract(int c) {
            arr = new int[c];
            size = 0;
            capacity = c;
        }

        // rigth side of heap is 2 * i + 1
        public int right(int i) {
            return 2 * i + 1;
        }

        // left side of heap is 2 * i + 2
        public int left(int i) {
            return 2 * i + 2;
        }

        // Parten side of heap is (i - 1) / 2
        public int parten(int i) {
            return (i - 1) / 2;
        }

        // insert element in to heap
        public void insert(int element) {
            if (size == capacity)
                return;
            size++;
            arr[size - 1] = element;
            for (int i = size - 1; i != 0 && arr[parten(i)] > arr[i];) {
                int temp = arr[i];
                arr[i] = arr[parten(i)];
                arr[parten(i)] = temp;
                i = parten(i);
            }
        }

        public void MinHeap(int i) {
            int rightside = right(i);
            int leftside = left(i);
            int smallnumber = i;
            if (rightside < size && arr[rightside] < arr[smallnumber])
                smallnumber = rightside;
            if (leftside < size && arr[leftside] < arr[i])
                smallnumber = leftside;
            if (smallnumber != i) {
                int temp = arr[i];
                arr[i] = arr[smallnumber];
                arr[smallnumber] = temp;
                MinHeap(smallnumber);
            }
        }

        public int extractMin() {
            if (size <= 0)
                return Integer.MAX_VALUE;
            if (size == 1) {
                size--;
                return arr[0];
            }
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
            size--;
            MinHeap(0);
            return arr[size];
        }
    }

    public static void main(String[] args) {

    }
}
