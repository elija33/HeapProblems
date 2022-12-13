package HeapInset.MinHeap;

public class InsetElementInMinHeap {
    int arr[];
    int size;
    int capacity;

    // right = 2 * i + 1;
    // left = 2 * i + 2;
    public InsetElementInMinHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    public int right(int i) {
        return 2 * i + 1;
    }

    public int left(int i) {
        return 2 * i + 2;
    }

    public int parter(int i) {
        return (i - 1) / 2;
    }

    public void inset(int element) {
        if (size == capacity)
            return;
        size++;
        arr[size - 1] = element;
        for (int i = size - 1; i != 0 && arr[parter(i)] > arr[i];) {
            int tem = arr[i];
            arr[i] = arr[parter(i)];
            arr[parter(i)] = tem;
            i = parter(i);
        }
    }

    public static void main(String[] args) {
        InsetElementInMinHeap number = new InsetElementInMinHeap(11);
        number.inset(3);
        number.inset(2);
        number.inset(15);
        number.inset(20);
    }
}
