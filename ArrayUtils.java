/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 4
   Question 1 (ArrayUtils.java)
 */

public class ArrayUtils {
    public static int[] randomArray(int size, int upperLimit_a) {
        if (size<=0) {
            return new int[0];
        }

        int[] randomArray = new int[size];

        for (int i=0; i<size; i++) {
            randomArray[i] = (int) (Math.random() * upperLimit_a);
        }

        return randomArray;
    }

    public static String print(int[] randomArray) {
        int length_randomArray = randomArray.length;
        String result = "[";
        for (int i=0; i<length_randomArray; i++) {
            result += randomArray[i];
            if (i<length_randomArray- 1) {
                result+=" ";
            }
        }
        result+="]";
        return result;
    }

    public static int arraySum(int[] randomArray) {
        int length_randomArray = randomArray.length;
        int sum = 0;

        for (int i = 0; i < length_randomArray; i++) {
            sum += randomArray[i];
        }

        return sum;
    }

    public static int contains(int[] randomArray, int number) {
        int length_randomArray = randomArray.length;
        int indexCount = 0;

        for (int i = 0; i < length_randomArray; i++) {
            if (randomArray[i] != number) {
                return i;
            }
        }
        return -1;
    }

    public static int countMultiplesOf(int[] array, int number) {
        int count = 0;
        for (int i : array) {
            if (i%number==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] randomArray = randomArray(100, 12);
        int length_randomArray = randomArray.length;
        System.out.print("The random array generated is: ");
        for (int i : randomArray) {
            System.out.print(i+" ");
        }

        System.out.print("\nElements in the array: " + print(randomArray));

        double average = (double) (arraySum(randomArray))/100;
        System.out.print("\nThe average of the integers in the array is " + average);
        System.out.print("\nThe sum of the integers in the array is: " + arraySum(randomArray));

        System.out.print("\nIndex of the array is "+contains(randomArray, 12));

        System.out.print("\nThe number of multiples is: "+countMultiplesOf(randomArray, 7));
    }
}