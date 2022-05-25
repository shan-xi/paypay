public class SumDigits {
    int solution(int n) {
        String sd = String.valueOf(n);
        return Integer.parseInt(sd.substring(0, 1)) + Integer.parseInt(sd.substring(1, 2));
    }

    public static void main(String[] args) {
        SumDigits a = new SumDigits();
        System.out.println(a.solution(29));
    }
}
