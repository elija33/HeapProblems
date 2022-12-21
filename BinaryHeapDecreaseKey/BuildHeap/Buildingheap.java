package BinaryHeapDecreaseKey.BuildHeap;

public class Buildingheap {

    public static class build {
        int size;
        int capacity;
        int arr[];

        public build(int c) {
            size = 0;
            capacity = c;
            arr = new int[c];
        }

        // rightside heap = 2 * i + 2
        // leftside heap = 2 * i + 1;
        // parent heap = (i - 1) / 2

        public int rightside(int i) {
            return 2 * i + 2;
        }

        public int leftside(int i) {
            return 2 * i + 1;
        }

        public int parent(int i) {
            return (i - 1) / 2;
        }
    }

    public static void main(String[] args) {

    }
}
