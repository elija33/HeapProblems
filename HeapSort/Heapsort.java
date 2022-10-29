package HeapSort;

public class Heapsort {
    public void buildheap(int number[], int n) {
        for (int i = number.length / 2 - 1; i >= 0; i--) {
            heapify(number, n, i);
        }
    }

    public void sort(int number[]) {
        buildheap(number, 0);

        for (int i = number.length - 1; i > 0; i--) {
            int temp = number[0];
            number[0] = number[i];
            number[i] = temp;

            heapify(number, i, 0);
        }
    }

    public void heapify(int number[], int n, int i) {
        int largestNumber = i;
        int left = 2 * i + 2;
        int right = 2 * i + 1;

        if (left < number.length && number[left] > number[largestNumber])
            largestNumber = left;

        if (right < number.length && number[right] > number[largestNumber])
            largestNumber = right;

        if (largestNumber != i) {
            int swaping = number[i];
            number[i] = number[largestNumber];
            number[largestNumber] = swaping;

            heapify(number, n, largestNumber);
        }
    }

    public static void printArray(int number[]) {
        for (int i = 0; i < number.length - 1; ++i) {
            System.out.print(number[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 12, 11, 13, 5, 6, 7 };
        Heapsort name = new Heapsort();
        name.sort(number);

        System.out.println("Sorted array is");
        printArray(number);
    }
}