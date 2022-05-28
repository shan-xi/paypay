public class FindLargestThreeNumber {
    static void find(int a[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else if (j > third) {
                third = j;
            }
        }
        System.out.println(first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int a[] = {12, 13, 1, 10, 34, 1};
        find(a);
    }
}
