public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {8, 9, 4, 0, 6, 5, 3, 7, 2, 1};

        insertionSort sapXepChen = new insertionSort();
        System.out.println("Mang da nhap vao la: ");
        sapXepChen.display(arr);
        sapXepChen.insertionSort(arr);
        System.out.println("\nMang sau khi duoc sap xep: ");
        sapXepChen.display(arr);
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;
        for (i = 1; i < arr.length; i++) {
            valueToInsert = arr[i];
            holePosition = i;
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyen phan tu: " + arr[holePosition]);
            }
            if (holePosition != i) {
                System.out.println(" Chen phan tu: " + valueToInsert
                        + ", tai vi tri: " + holePosition);
                arr[holePosition] = valueToInsert;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }
}
