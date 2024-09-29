
import java.util.Arrays;



public class Tasks2 {
    public static void main(String[] args){
        System.out.println(duplicateChars("Barack", "Obama"));

        System.out.println("--------------");

        int[] numbers1 = {3, 12, 7, 81, 52};
        System.out.println(dividedByThree(numbers1));

        System.out.println("--------------");

        System.out.println(getInitials("simonov sergei evgenievich"));
        System.out.println(getInitials("kozhevnikova tatiana vitalevna"));

        System.out.println("--------------");

        double[] numbers2 = {3.5, 7.0, 1.5, 9.0, 5.5};
        double[] numbers3 = {10.0, 10.0, 10.0, 10.0};
        System.out.println(Arrays.toString(normalizator(numbers2)));
        System.out.println(Arrays.toString(normalizator(numbers3)));

        System.out.println("--------------");

        double[] numbers4 = {1.6, 0, 212.3, 34.8, 0, 27.5}; 
        System.out.println(Arrays.toString(compressedNums(numbers4)));

        System.out.println("--------------");

        System.out.println(camelToSnake("helloWorld"));

        System.out.println("--------------");

        int[] numbers5 = {3, 5, 8, 1, 2, 4};
        System.out.println(secondBiggest(numbers5));

        System.out.println("--------------");

        System.out.println(localReverse("baobab", 'b'));
        System.out.println(localReverse("Hello, I'm under the water, please help me", 'e'));

        System.out.println("--------------");

        System.out.println(equal(8, 1, 8));
        System.out.println(equal(5, 5, 5));
        System.out.println(equal(4, 9, 6));

        System.out.println("--------------");

        System.out.println(isAnagram("LISTEN", "silent"));
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
        System.out.println(isAnagram("hello", "world"));
    }

    public static String duplicateChars(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        String newStr = "";
        for (int i = 0; i < a.length(); i++) {
            String curChar = String.valueOf(a.charAt(i));

            if (!(b.contains(curChar) && !(newStr.contains(curChar)))) {
                newStr += a.charAt(i);
            }
        }
        return newStr;
    }

    public static int dividedByThree(int[] aNums) {
        int k = 0;
        for (int num: aNums) {
            if (num % 3 == 0 && num % 2 != 0) {
                k ++;
            }
        }
        return k;
    }

    public static String getInitials(String name) {
        String[] splitedName = name.split(" ");

        String initials = splitedName[1].substring(0, 1).toUpperCase() +
         "." + splitedName[2].substring(0, 1).toUpperCase() + ". " +
          splitedName[0].substring(0, 1).toUpperCase() + splitedName[0].substring(1);
        return initials;
    }

    public static double[] normalizator(double[] values) {
        double minValue = Double.POSITIVE_INFINITY;
        double maxValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < values.length; i++) {
            minValue = minValue < values[i] ? minValue : values[i];
            maxValue = maxValue > values[i] ? maxValue: values[i];

        }

        for (int i = 0; i < values.length; i++) {
            if (minValue != maxValue){
                values[i] = (values[i] - minValue) / (maxValue - minValue);
            }else{
                values[i] = 0.0;
            }
        }
        return values;
    }

    public static int[] compressedNums(double[] values) {
        int nValues = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 1){
                nValues ++;
            }
        }
        int[] result = new int[nValues];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 1) {
                result[index] = (int) values[i];
                index ++;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public static String camelToSnake(String value) {
        String newStr = "";
        for (int i = 0; i < value.length(); i++) {
            if (Character.isUpperCase(value.charAt(i))) {
                newStr += "_" + value.substring(i, i+1).toLowerCase();
            }else{
                newStr += value.charAt(i);
            }
        }
        return newStr;
    }

    public static int secondBiggest(int[] nums) {
        int preMax = 0;
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maxNum) {
                preMax = maxNum;
                maxNum = nums[i];
            }
        }
        return preMax;
    }
    public static String localReversed(String initialText, char delimiter){
        String result = "";
        String[] middleStrings = initialText.split(new String(new char[]{delimiter}));
        for (int i = 0; i < middleStrings.length; i++){
            String reversed = "";
            for (int j = middleStrings[i].length() - 1; j >= 0; j--){
                reversed += middleStrings[i].charAt(j);
            }
            middleStrings[i] = reversed;
            
        }
        result = String.join(new String(new char[]{delimiter}), middleStrings);
        if (initialText.charAt(initialText.length() - 1) == delimiter){
            result += delimiter;
        }
        return result;
    }
    public static String localReverse(String initialText, char delimiter){
        String ans;
        String[] middleStrings = initialText.split(new String(new char[]{delimiter}));
        for (int i = 0; i < middleStrings.length; i++){
            middleStrings[i] = reverse(middleStrings[i]);
        }
        ans = String.join(new String(new char[]{delimiter}), middleStrings);
        if (initialText.charAt(initialText.length() - 1) == delimiter){
            ans += delimiter;
        }
        return ans;
    }

    public static String reverse(String toReverse){
        String reversed = "";
        for(int i = toReverse.length() - 1; i >= 0; i--){
            reversed += toReverse.charAt(i);
        }
        return reversed;
    }

    public static int equal(int a, int b, int c) {
        if (a == b && a == c) {
            return 3;
        }
        if (a != b && a != c && b != c) {
            return 0;
        }
        return 2;
    }
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase().replaceAll("[^a-z]", "");
        b = b.toLowerCase().replaceAll("[^a-z]", "");

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(bArray, aArray);
    }
}