import java.util.Arrays;

/**
 * A class that contains generic methods to reverse an array and sum the elements of an array.
 * @author Lukas Schrenk
 * @version 2024-03-02
 */
public class GenericUtils {

    /**
     * Reverses the elements of the given array.
     * @param array the array to reverse
     * @param <T> declares that the method is generic and can take any type of array
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Sums the elements of the given array.
     * @param array the array to sum
     * @param <T> declares that the method is generic and can take any type of array
     * @return the sum of the elements in the array
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Testing reverse method
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Integer Array: " + Arrays.toString(intArray));

        String[] strArray = {"apple", "banana", "orange"};
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        GenericUtils.reverse(strArray);
        System.out.println("Reversed String Array: " + Arrays.toString(strArray));

        // Testing sum method
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));

        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(intArray2));
    }
}
