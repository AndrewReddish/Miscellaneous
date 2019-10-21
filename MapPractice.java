import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MapPractice {

        public static void main(String[] args) throws IOException {

            int[] arr = createArray();
            System.out.println("Enter array elements:");
            fillArray(arr);
            System.out.println("\nThe average of " + Arrays.toString(arr) + " equals " + findAverage(arr));
        }

        private static int[] createArray() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Define the length of array:");
            int len = scan.nextInt();
            return new int[len];
        }
        
        private static void fillArray(int [] array) throws IOException {

            Scanner scan = new Scanner(System.in);
            //for (int i = array[0]; i <= array.length-1; i++){
            int arrayIndex = 0;
                while (arrayIndex < array.length){
                    for (arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
                        array [arrayIndex] = scan.nextInt();
                        System.out.println("Elements: " + Arrays.toString(array));
                    }
                }
        }
        private static double findAverage(int[] list) {
            double sum = 0;
            if (list.length != 0){
                for (int value : list) {
                    sum += value;
                }
                return sum/list.length;
            } else if (list.length == 1){
                return list [0];
            }
            else return 0;
        }
}
