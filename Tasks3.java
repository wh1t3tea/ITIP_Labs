import java.util.Arrays;

public class Tasks3 {
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println("==================");

        String [][] arrs = {{"Laptop", "124200"}, {"Phone", "51450"}, {"Headphones", "13800"}};
        System.out.println(Arrays.deepToString(sale(arrs, 25)));

        System.out.println("==================");

        System.err.println(sucsessShoot(0, 0, 5, 2, 2));
        System.err.println(sucsessShoot(-2, -3, 4, 5, -6));

        System.out.println("==================");

        System.err.println(parityAnalysis(243));
        System.err.println(parityAnalysis(12));
        System.err.println(parityAnalysis(3));

        System.out.println("==================");

        System.err.println(rps("rock", "paper"));
        System.err.println(rps("paper", "rock"));
        System.err.println(rps("paper", "scissors"));
        System.err.println(rps("scissors", "scissors"));
        System.err.println(rps("scissors", "paper"));

        System.out.println("==================");

        System.err.println(bugger(39));
        System.err.println(bugger(999));
        System.err.println(bugger(4));

        System.out.println("==================");

        String [][] arrs2 = {{"Скакалка", "550", "8"}, {"Шлем", "3750", "4"}, {"Мяч", "2900", "10"}};
        System.err.println(mostExpensive(arrs2));

        System.out.println("==================");

        System.out.println(longestUnique("abcba"));
        System.out.println(longestUnique("bbb"));

        System.out.println("==================");

        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));

        System.out.println("==================");

        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));



    }

    public static boolean isStrangePair(String a, String b) {
        if (a.length() == 0 & b.length() == 0) {
            return true;
        }
        if (a.length() == 0 || b.length() == 0){
            return false;
        }
        return (a.charAt(a.length() - 1) == b.charAt(0) & a.charAt(0) == b.charAt(b.length() - 1));
    }

    public static String[][] sale(String[][] goods, int disocunt) {
        for (String[] good: goods){
            int price = Integer.parseInt(good[1]);
            int priceWithDiscount = (int) Math.max(Math.round(price * (1 - disocunt / 100.0)), 1);
            good[1] = String.valueOf(priceWithDiscount);
        }
        return goods;
    }

    public static boolean sucsessShoot(int x, int y, int r, int x2, int y2) {
        int minX = x - r;
        int maxX = x + r;
        int minY = y - r;
        int maxY = y + r;
        return minX < x2 && maxX > x2 && minY < y2 && maxY > y2;
    }

    public static boolean parityAnalysis(int num){
        int sumDigits = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sum();
        return num % 2 == sumDigits % 2;
    }

    public static String rps(String aValue, String bValue) {
        if (aValue.equals(bValue)) {
            return "Tie";
        }
        if ((aValue.equals("rock") && bValue.equals("paper")) || (
            aValue.equals("scissors") && bValue.equals("rock")) || (
                aValue.equals("paper") && bValue.equals("scissors"))) {
                return "Player 2 wins";
            }
        return "Player 1 wins";
    }

    public static int bugger(int num) {
        int cnt = 0;
        while (num >= 10){
            num = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).reduce(1, (a, b) -> a * b);
            cnt ++;
        }
        return cnt;
    }

    public static String mostExpensive(String[][] equipments) {
        String name = "";
        double price = Double.NEGATIVE_INFINITY;
        for (String[] equipment: equipments){
            int curPrice = Integer.parseInt(equipment[1]);
            int curCount = Integer.parseInt(equipment[2]);
            if (curPrice * curCount > price) {
                name = equipment[0];
                price = curPrice * curCount;
            }
        }
        return "Наиб. общ. стоимость у предмета " + name + " - "+ String.valueOf((int) price);
    }

    public static String longestUnique(String str) {
        String longest = "";
        String current = "";
        for (char c : str.toCharArray()) {
            if (current.contains(String.valueOf(c))) {
                current = current.substring(current.indexOf(c) + 1);
            }
            current += c;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }

    public static boolean isPrefix(String value, String prefix){
        return (value.substring(0, prefix.length() - 1).equals(prefix.substring(0, prefix.length() - 1)));
    }

    public static boolean isSuffix(String value, String suffix){
        return (value.substring(value.length() - suffix.length() + 1, value.length()).equals(suffix.substring(1, suffix.length())));
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (a <= w && b <= h) || (a <= h && b <= w) ||
                (a <= w && c <= h) || (a <= h && c <= w) ||
                (b <= w && c <= h) || (b <= h && c <= w);
    }
}
