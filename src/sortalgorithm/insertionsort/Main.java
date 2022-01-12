package sortalgorithm.insertionsort;
/*
Nguyen Ly:
    Chay tu dau den cuoi mang;
    Tai vong lap i, coi nhu day [0, i-1] da duoc sap xep, chen phan tu a[i] vao vi tri thich hop;
    Sau vong lap thu i thi day [0, i] da duoc sap xep.
*/

public class Main {
    public static void printArray(int i, int[] array){
        System.out.printf("Step " + i + ": ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
            printArray(i, arr);
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 8, 7, 9, 3};
        insertionSort(array);
    }
}
/*
        Step 1: 2 5 4 8 7 9 3
        Step 2: 2 4 5 8 7 9 3
        Step 3: 2 4 5 8 7 9 3
        Step 4: 2 4 5 7 8 9 3
        Step 5: 2 4 5 7 8 9 3
        Step 6: 2 3 4 5 7 8 9
 */
