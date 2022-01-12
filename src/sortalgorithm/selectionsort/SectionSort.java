package sortalgorithm.selectionsort;
/*
    Chay tu dau den cuoi mang;
    Tai vong lap thu i, tim phan tu nho nhat tu [i+1, n-1], neu nho hon a[i] thi doi cho cho a[i];
    Sau vong lap thu i, thi day [0, i] da duoc sap xep.
 */
public class SectionSort {
    public static void printArray(int i, int[] array){
        System.out.printf("Step " + i + ": ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            printArray(i+1, arr);
        }

    }
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 8, 7, 9, 3};
        selectionSort(array);
    }
}
/*
        Step 1: 2 5 4 8 7 9 3
        Step 2: 2 3 4 8 7 9 5
        Step 3: 2 3 4 8 7 9 5
        Step 4: 2 3 4 5 7 9 8
        Step 5: 2 3 4 5 7 9 8
        Step 6: 2 3 4 5 7 8 9
        Step 7: 2 3 4 5 7 8 9

 */
