public class BinaryAdd {
    String solution(String a, String b) {
        int lv = Integer.valueOf(a, 2);
        int rv = Integer.valueOf(b, 2);
        return Integer.toBinaryString(lv + rv);
    }

    public static void main(String[] args) {
        BinaryAdd a = new BinaryAdd();
        System.out.println(a.solution("10010", "1101001"));
    }
}
