public class TimPhanTu1Mang {
    public static void findConsecutive() {
        int[] array = {1, 2, 1, 5, 6, 7, 9, 10};

        int counter = 1;
        int i = 1;
        for (i = 1; i < array.length; i++) {
            if (array[i] == (array[i - 1] + 1)) {
                counter++;
                if (counter == 3) {
                    System.out.println("Consecutive elements are at array index: " + (i - 2) + " to " + i);
                    break;
                }
            } else {
                counter = 1;
            }
        }
    }

    public static void main(String[] args) {
        findConsecutive();
    }
}