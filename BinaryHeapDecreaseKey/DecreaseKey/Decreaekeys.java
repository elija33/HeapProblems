package BinaryHeapDecreaseKey.DecreaseKey;

public class Decreaekeys {
    public static class DecreaekeyHeap {
        int size;
        int arr[];
        int capacity;

        public DecreaekeyHeap(int c) {
            size = 0;
            arr = new int[c];
            capacity = c;
        }

        // right = 2 * i + 2.
        public int right(int i) {
            return 2 * i + 2;
        }

        // left = 2 * i + 1.
        public int left(int i) {
            return 2 * i + 1;
        }

        // parter = (i - 1) / 2
        public int parent(int i) {
            return (i - 1) / 2;
        }

        // Inserting an element in the heap
        public void insert(int element) {
            if (size == capacity)
                return;
            size++;
            arr[size - 1] = element;
            for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }

        public void MinHeap(int i) {
            int rightside = right(i);
            int leftside = left(i);
            int smallnumber = (i);
            if (leftside < size && arr[leftside] < arr[i])
                smallnumber = leftside;
            if (rightside < size && arr[rightside] < arr[smallnumber])
                smallnumber = rightside;
            if (smallnumber != i) {
                int temp = arr[i];
                arr[i] = arr[smallnumber];
                arr[smallnumber] = temp;
                MinHeap(smallnumber);

            }
        }

        public int ExtractHeap() {
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

        public void decreaseKey(int i, int x) {
            arr[i] = x;
            while (i != 0 && arr[parent(i)] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }

        public void deleteKey(int i) {
            decreaseKey(i, Integer.MIN_VALUE);
            ExtractHeap();
        }
    }

    public static void main(String[] args) {
        DecreaekeyHeap number = new DecreaekeyHeap(11);
        number.insert(3);
        number.insert(2);
        number.deleteKey(0);
        number.insert(15);
        number.insert(20);
        System.out.println(number.ExtractHeap());
        number.decreaseKey(2, 1);
        System.out.println(number.ExtractHeap());
    }
}
