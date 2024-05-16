import java.util.Scanner;

public class Main {
    // Scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int[] myIntegers = getIntegers(5);
        System.out.println("***************** Unsorted ***********************");
        printArray(myIntegers);
        System.out.println("***************** Sorted in descending order ***********************");
        int[] sortedArray = sortIntegers(myIntegers);

        printArray(sortedArray);
        System.out.println("****************************************");
    }
    public static int[] getIntegers(int size){
        //array holds the integer values entered by the user
        int[] array = new int[size];
        //ask the user to enter any value from the keyboard
        System.out.println("Enter " + size + " integer values:\r");
        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        //return an array with values
        return array;
    }

    //Print function, we use it to display an array of integers
    public static void printArray(int[] arrayValues){
        for (int i=0; i<arrayValues.length; i++){
            System.out.println("Element " + (i+1) + " contents " + arrayValues[i]);
        }
    }

    //the method sort integer values and return sorted integer values
    public static int[] sortIntegers(int[] unsortedArrays){
        //create a new array of the same size that has been passed to the function
        int[] sortedArray = new int[unsortedArrays.length];

        //create a copy by moving the contents in unsortedArray to a new array
        for(int i = 0; i<unsortedArrays.length; i++)
        {
            sortedArray[i] = unsortedArrays[i];
        }
        //Next: sort the values
        boolean done = true;
        int temp;
         while (done){
             done=false;
             for (int i=0; i<sortedArray.length - 1; i++){
                 // i+1 leads to use of sortedArray.length - 1
                 if(sortedArray[i] < sortedArray[i+1])
                 {
                     temp = sortedArray[i];
                     sortedArray[i] = sortedArray[i+1];
                     sortedArray[i+1] = temp;
                     done = true;
                 }
             }
         }
         return sortedArray;
    }
}