import java.util.*;

public class Change {

    Map<Double, String> coins = new LinkedHashMap<>();

    {
        coins.put(100.00, "ONE HUNDRED");
        coins.put(50.00, "FIFTY");
        coins.put(20.00, "TWENTY");
        coins.put(10.00, "TEN");
        coins.put(5.00, "FIVE");
        coins.put(2.00, "TWO");
        coins.put(1.00, "ONE");
        coins.put(.25, "QUARTER");
        coins.put(.10, "DIME");
        coins.put(.05, "NICKEL");
        coins.put(.01, "PENNY");
    }

    String solution(double a, double b) {
        if (b < a) {
            return "ERROR";
        } else if (b == a) {
            return "ZERO";
        }

        Set<String> changes = new LinkedHashSet<>();
        double remains = b - a;

        for (Double coin : coins.keySet()) {
            System.out.println(remains);
            if (remains >= coin) {
                remains -= coin;
                changes.add(coins.get(coin));
            }
        }
        return String.join(",", changes);

    }

    public static void main(String[] args) {
        Change a = new Change();
        System.out.println(a.solution(100, 204));
    }
}
