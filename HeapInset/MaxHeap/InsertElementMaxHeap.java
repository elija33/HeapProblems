package HeapInset.MaxHeap;

public class InsertElementMaxHeap {
    int size;
    int capacity;
    int arr[];

    public InsertElementMaxHeap(int c) {
        size = 0;
        capacity = c;
        arr = new int[c];
    }

    // pater = (i + 1) / 2;
    public int parter(int i) {
        return (i + 1) / 2;
    }

    // right = 2 * i + 1;
    public int right(int i) {
        return 2 * i + 1;
    }

    // left = 2 * i + 2;
    public int left(int i) {
        return 2 * i + 2;
    }

    // inserting element in max heap
    public void insert(int element) {
        if (size == capacity)
            return;
        size++;
        arr[size - 1] = element;
        for (int i = size - 1; i != 0 && arr[parter(i)] < arr[i];) {
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
            i = parter(i);
        }
    }

    public static void main(String[] args) {

    }
}
