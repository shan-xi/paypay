import java.util.*;

public class Solution2 {
    int[] solution(int[] a) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[10];
        int maxValue = Integer.MIN_VALUE;
        for (int value : a) {
            String temp = String.valueOf(value);
            int len = temp.length();
            int j = 0;
            int k = 1;
            while (k <= len) {
                String v = temp.substring(j, k);
                j++;
                k++;
                count[Integer.parseInt(v)]++;
                if (count[Integer.parseInt(v)] > maxValue) {
                    maxValue = count[Integer.parseInt(v)];
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxValue) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] a = {25, 2, 3, 57, 38, 41};
        System.out.println(Arrays.toString(s.solution(a)));
        int[] a1 = {1, 100, 11, 99, 88, 77};
        System.out.println(Arrays.toString(s.solution(a1)));
    }
}
