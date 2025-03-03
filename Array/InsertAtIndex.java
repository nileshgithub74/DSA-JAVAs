import java.util.Arrays;
import java.util.Scanner;

public class InsertAtIndex {


    public static  int[]  InsertNewElement(int[] arr, int index, int element){

    int[] newArr   = new int[arr.length + 1];


    for(int i=0; i< index; i++){
        newArr[i]  =  arr[i];

    }

    newArr[index] =  element;

    for(int  i = index  ; i< arr.length; i++){
        newArr[i+1] = arr[i];
    }

    return  newArr;







    }
    public static void main(String[] args) {

        
       int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter index to insert at: ");
        int index = scanner.nextInt();
        scanner.close();

        int[] newArr = InsertNewElement(arr, index, element);
        System.out.println("Updated Array: " + Arrays.toString(newArr));







        




    }}
