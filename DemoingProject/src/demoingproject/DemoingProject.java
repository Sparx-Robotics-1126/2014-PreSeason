package demoingproject;

import java.util.Arrays;

/**
 * This project is for testing different sort methods.
 * @author jbass
 */
public class DemoingProject {
    
    /**
     * The largest random we are going to generate.
     */
    private static int MAX_RANDOM = 100;
    
    /**
     * The smallest radom we are going to generate.
     */
    private static int MIN_RANDOM = 0;
    
    /**
     * The number range of numbers.
     */
    private static int MAX_MIN_DIFF = MAX_RANDOM - MIN_RANDOM;
    
    /**
     * The number of elements we are going to sort.
     */
    private static int SIZE = 10000;

    /**
     * This is the entry to the sorting test framework.  This will test the
     * different sorting methods.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] unsorted1 = createRandomArray(SIZE);
        int[] unsorted2 = createRandomArray(SIZE);
        int[] unsorted3 = createRandomArray(SIZE);
        int[] unsorted4 = createRandomArray(SIZE);
        long sort1Time, sort2Time, sort3Time, sort4Time;
        
        long startTime = System.nanoTime();
        int[] sort1 = sort1(unsorted1);
        long endTime = System.nanoTime();
        sort1Time = endTime - startTime;
        
        startTime = System.nanoTime();
        int[] sort2 = sort2(unsorted2);
        endTime = System.nanoTime();
        sort2Time = endTime - startTime;
        
        startTime = System.nanoTime();
        int[] sort3 = sort3(unsorted3);
        endTime = System.nanoTime();
        sort3Time = endTime - startTime;
        
        startTime = System.nanoTime();
        int[] sort4 = sort4(unsorted4);
        endTime = System.nanoTime();
        sort4Time = endTime - startTime;
        
        System.out.println("Sort 1:");
        printArray(unsorted1);
        printArray(sort1);
        System.out.println("This sort took "+sort1Time+" ns.\n");
        
        System.out.println("Sort 1:");
        printArray(unsorted1);
        printArray(sort1);
        System.out.println("This sort took "+sort1Time+" ns.\n");
        
        System.out.println("Sort 2:");
        printArray(unsorted2);
        printArray(sort2);
        System.out.println("This sort took "+sort2Time+" ns.\n");
        
        System.out.println("Sort 3:");
        printArray(unsorted3);
        printArray(sort3);
        System.out.println("This sort took "+sort3Time+" ns.\n");
        
        System.out.println("Sort 4:");
        printArray(unsorted4);
        printArray(sort4);
        System.out.println("This sort took "+sort4Time+" ns.\n");
    }
    
    /**
     * Prints the array on a single line.
     * @param array The array to print.
     */
    private static void printArray(int[] array){
        System.out.print("{");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("}");
    }
    
    /**
     * Creates a random array with the given size.
     * @param size The size of the array to create.
     * @return The created array.
     */
    private static int[] createRandomArray(int size){
        int[] retVal = new int[size];
        for(int i=0; i<size;i++){
            retVal[i] =(int)( MIN_RANDOM+(Math.random()*MAX_MIN_DIFF));
        }
        return retVal;
    }
    /**
     * Sorts the array from smallest to largest using a temporary array that has
     * the smallest value placed in a return array and then sets the value in 
     * the temp array to Integer.MAX_VALUE.
     * @pre: none
     * @return: a sorted list from smallest to largest
     */
    public static int[] sort1(int[] unsortedList){
        int[] sorted = new int[unsortedList.length];
        int[] temp = Arrays.copyOf(unsortedList, unsortedList.length);
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < unsortedList.length; i++){
           for(int j = 0; j < unsortedList.length; j++){
               if(temp[j] < min){
                   min = temp[j];
                   minIndex = j;
               }
           }
           min = Integer.MAX_VALUE;
           sorted[i] = temp[minIndex];
           temp[minIndex] = Integer.MAX_VALUE;
        }
        return sorted;
    }
 
    
     /**
     * Sorts a 2D array from smallest to largest. and then return the sorted array.
     * The method first finds the smallest number and then adds that to the last array place value.
     * The lower value in the unsorted array is then set to Integer.Max_Value and then 
     * the loop is continued until the end of the array length
     * @param unsortedList a 2D array
     * @return: a sorted list from smallest to largest
     */
    public static int[] sort2(int[] unsortedList){
        int [] localUnsortedArray = unsortedList;
        int [] sortedArray = localUnsortedArray;
        int smallestNumber = 0;
        int smallestNumberPosition = 0;
        for (int i = 0; i < localUnsortedArray.length; i++){
            smallestNumber = Integer.MAX_VALUE;
            for (int x = 0; x < localUnsortedArray.length; x++){
                if(localUnsortedArray[x] < smallestNumber){
                    smallestNumber = unsortedList[x];
                    smallestNumberPosition = x;
            }
                    sortedArray[i] = localUnsortedArray[smallestNumberPosition];
                    localUnsortedArray[smallestNumberPosition] = Integer.MAX_VALUE;
            } 
        }
        return sortedArray;
    }
    
    public static int[] sort3(int[] unsortedList){
        return new int[0];
    }
    public static int[] sort4(int[] unsortedList){
        int[] retVal = Arrays.copyOf(unsortedList, unsortedList.length);
        Arrays.sort(retVal);
        return retVal;
    }
}
