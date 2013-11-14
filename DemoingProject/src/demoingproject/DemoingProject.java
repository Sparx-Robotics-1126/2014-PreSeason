/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        int[] sort1 = sort1(unsorted1);
        int[] sort2 = sort2(unsorted2);
        int[] sort3 = sort3(unsorted3);
        
        printArray(unsorted1);
        printArray(sort1);
        printArray(unsorted2);
        printArray(sort2);
        printArray(unsorted3);
        printArray(sort3);
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
    /**
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
    
    public static int[] sort2(int[] unsortedList){
        return new int[0];
    }
    
    public static int[] sort3(int[] unsortedList){
        return new int[0];
    }
}
