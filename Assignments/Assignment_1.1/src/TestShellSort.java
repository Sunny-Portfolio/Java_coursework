import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestShellSort {

    public static void main(String[] args)
    {
        // Initialize Integer arrays
        Integer[] list1 = {9,6,8,12,3,1,7};
        Integer[] list2;
        Integer[] list3;

        int upperLimit = 50;

        list2 = genRandom(10, upperLimit);
        list3 = genRandom(20, upperLimit);

        // Sort random arrays by shell sort
        Sorting.shellSort(list1);
        Sorting.shellSort(list2);
        Sorting.shellSort(list3);

        list2 = genRandom(10, upperLimit);
        list3 = Arrays.copyOf(list2,10);

        // Sort random arrays by bubble sort
        Sorting.bubbleSort(list2);
        Sorting.bubbleSort2(list3);

        // Sort sorted arrays by bubble sort
        Sorting.bubbleSort(list2);
        Sorting.bubbleSort2(list3);


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
