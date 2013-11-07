package demoingproject;

import java.util.Arrays;

/**
 *
 * @author jbass
 */
public class DemoingProject {
    private static int MAX_RANDOM = 100;
    private static int MIN_RANDOM = 0;
    private static int MAX_MIN_DIFF = MAX_RANDOM - MIN_RANDOM;
    private static int SIZE = 10000;

    /**
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
    
    private static void printArray(int[] array){
        System.out.print("{");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("}");
    }
    
    private static int[] createRandomArray(int size){
        int[] retVal = new int[size];
        for(int i=0; i<size;i++){
            retVal[i] =(int)( MIN_RANDOM+(Math.random()*MAX_MIN_DIFF));
        }
        return retVal;
    }
    
    public static int[] sort1(int[] unsortedList){
        return new int[0];
    }
    
    public static int[] sort2(int[] unsortedList){
        return new int[0];
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
