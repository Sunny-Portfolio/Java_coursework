import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Assignment 1
 * Name: Wai Hei Chan (Sunny)
 * ID: T-00700671
 */
public class TestShellSort {

    public static void main(String[] args)
    {
        // Initialize Integer arrays
        Integer[] list1 = {9,6,8,12,3,1,7};
        Integer[] list2;
        Integer[] list3;
        Integer[] listRandom10A, listRandom10B, listRandom20A, listRandom20B;


        int upperLimit = 50;

        /**
         * Assignment 1 part 1
         */
        System.out.println("\n===============Part 1===============");


        listRandom10A = genRandom(10, upperLimit);
        listRandom10B = genRandom(10, upperLimit);

        listRandom20A = genRandom(20, upperLimit);
        listRandom20B = genRandom(20, upperLimit);


        // Sort random arrays by shell sort, initializer list
        Sorting.shellSort(list1);
        // Sort random arrays by shell sort, two random size 10 list
        Sorting.shellSort(listRandom10A);
        Sorting.shellSort(listRandom10B);
        // Sort random arrays by shell sort, two random size 20 list
        Sorting.shellSort(listRandom20A);
        Sorting.shellSort(listRandom20B);


        /**
         * Assignment 1 part 2
         */
        System.out.println("\n===============Part 2===============");

        list2 = genRandom(10, upperLimit);
        list3 = Arrays.copyOf(list2,10);

        // Sort random arrays by bubble sort, Size 10
        Sorting.bubbleSort(list2);
        Sorting.bubbleSort2(list3);

        // Sort sorted arrays by bubble sort, Size 10
        Sorting.bubbleSort(list2);
        Sorting.bubbleSort2(list3);

        /**
         * Assignment 1 part 3
         */
//        System.out.println("\n===============Part 3===============");
//
//        Instant start;
//        Instant stop;
//
//        // Sort array with length 10
//        list1 = genRandom(10, upperLimit);
//        list2 = Arrays.copyOf(list1,10);
//        list3 = Arrays.copyOf(list1,10);
//
//        start = Instant.now();
//        Sorting.bubbleSort(list1);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.bubbleSort2(list2);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.shellSort(list3);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        System.out.println("----------------------------");
//
//
//        // Sort array with length 100
//        list1 = genRandom(100, upperLimit);
//        list2 = Arrays.copyOf(list1,100);
//        list3 = Arrays.copyOf(list1,100);
//
//        start = Instant.now();
//        Sorting.bubbleSort(list1);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.bubbleSort2(list2);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.shellSort(list3);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        System.out.println("----------------------------");
//
//
//        // Sort array with length 1000
//        list1 = genRandom(1000, upperLimit);
//        list2 = Arrays.copyOf(list1,1000);
//        list3 = Arrays.copyOf(list1,1000);
//
//        start = Instant.now();
//        Sorting.bubbleSort(list1);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.bubbleSort2(list2);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());
//        start = Instant.now();
//        Sorting.shellSort(list3);
//        stop = Instant.now();
//        System.out.println("Execution Time = " + Duration.between(start, stop).toNanos());


    }


    /**
     * Method to generate random array of Integer
     * @param length length of the new array
     * @param limit upper limit of the random integer
     * @return Integer array of random numbers
     */
    private static <T> Integer[] genRandom(int length, int limit) {
        Integer[] list = new Integer[length];
        Random rand = new Random();

        for (int n=0; n<length; n++) {
            list[n] = rand.nextInt(limit);
        }
        return list;
    }
}
