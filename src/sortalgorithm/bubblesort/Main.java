package sortalgorithm.bubblesort;

public class Main {
    public static void printArray(int i, int[] array){
        System.out.printf("Step " + i + ": ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] array){
        int n = array.length;

        for(int i = 0; i < n; i++){
            boolean check = false; // kiem tra xem mang da tang dan chua
            for(int j = 0; j < n-i-1; j++){
                // Hai phan tu ke nhau khong thoa man thi doi cho
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    check = true;
                }
            }
            if(check == false) break;
            // in ra tung buoc
            printArray(i+1, array);
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 8, 7, 9, 3};
        bubbleSort(array);
    }
}
