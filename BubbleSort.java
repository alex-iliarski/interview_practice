import java.util.Arrays;

//Bubble Sorter
public class BubbleSort{

    //default constructor
    public BubbleSort(){}

    //swaps the values in an int array at the given indices
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //function to sort an array of integers using the bubble sort method
    public int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    //helper function to print an array
    public static void printlist(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();

        int[] arr = sorter.bubbleSort(new int[] {1,3,2,1,7,9,4,5});
        printlist(arr); //expects [1,1,2,3,4,5,7,9]

        int[] arr2 = sorter.bubbleSort(new int[] {9,8,7,5,6,3});
        printlist(arr2); //expects [3,5,6,7,8,9]

    }

}