package exception;
import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            arr = new int[size];
            System.out.print("Enter " + size + " elements: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();

            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
            System.out.println("Program finished.");
        }
    }
}
