public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 9, 4, 0, 6, 5, 3, 7, 2, 1};

        bubbleSort sapXepBongBong = new bubbleSort();
        System.out.println("Mang da nhap vao la: ");
        sapXepBongBong.display(arr);
        sapXepBongBong.bubbleSort(arr);
        System.out.println("\nMang sau khi duoc sap xep: ");
        sapXepBongBong.display(arr);
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public void bubbleSort(int arr[]) {
        int temp;
        int i, j;

        boolean swapped = false;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("So sanh cac phan tu: [" + arr[j] + ", " + arr[j + 1] + "]");
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                    System.out.println(" => trao doi [" + arr[j] + ", " + arr[j + 1] + "]");
                } else {
                    System.out.println(" => khong can trao doi.");
                }
            }
            if (!swapped) {
                break;
            }

            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }
}
