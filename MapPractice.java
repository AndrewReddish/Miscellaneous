import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MapPractice {
    public static void main(String args[]) throws IOException {
        System.out.println("Please enter array elements:");
        int[] arr = createArray(2);
        fillArray(arr);
        System.out.println("the average of " + Arrays.toString(arr) + " equals " + findAverage(arr));
    }

    private static int[] createArray(int len) {
        return new int[len];
    }

    private static void fillArray(int [] array) throws IOException {

        Scanner scan = new Scanner(System.in);
        int value = 0;
        for (int i = array[0]; i < array.length; i++){
            for (int len = array[0]; len < array.length; value++){
                array [value] = scan.nextInt();
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

/*    private static Map<String, String> ModifyMap(Map <String, String> map1) {
        map1.remove("c");
        if (map1.containsKey("a")){
            map1.replace("b", map1.get("a"));

            if (!map1.containsKey("b")) {
                map1.put("b", map1.get("a"));
            }
            System.out.println(map1.values());
        } else {
            System.out.println("hello");
        }
        return map1;
    }
    private static Map<String, String> ModifyMap2(Map <String, String> map1) {
        //String a = map1.get("a");
        if (map1.containsKey("a") && map1.containsKey("b")){
            map1.put("ab", map1.get("a") + map1.get("b"));
            System.out.println(map1.values());
        } else {
            System.out.println("hello");
        }
        return map1;
    }*/
/*    private static Map<String, String> CreateMap() {
        Map <String, String> countries = new HashMap<String, String>();
        countries.put("US", "United States");
        countries.put("GB", "Great Britain");
        countries.put("UA", "Ukraine");
        countries.put("ES", "Spain");

        System.out.println(countries.get("US"));
        return countries;
    }

    private static void ReturnValue(Map<String, String> countries) {
        String key = "BB";
        if (countries.containsKey(key)){
            System.out.println(countries.get("UA")); ;
        } else {
            System.out.println(countries.values());
        }

    }*/
