//https://www.techiedelight.com/check-duplicates-array-java/

import java.util.Arrays;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {
        String a[] = {"1", "2", "3", "4", "5", "6", "6"};
        System.out.println(hasDuplicatesByStream(a));
        System.out.println(hasDuplicatesBySort(a));

    }

    // time complexity: O(nlogn), auxiliary complexity: O(1)
    private static <T> boolean hasDuplicatesBySort(T[] array) {
        Arrays.sort(array);
        T prev = null;
        for (T e : array) {
            if (e != null && e.equals(prev)) {
                return true;
            }
            prev = e;
        }
        return false;
    }

    // suitable for large amount data
    // time complexity: O(n), auxiliary complexity: O(1)
    private static <T> boolean hasDuplicatesByStream(T[] array) {
        long distinctCount = Stream.of(array).distinct().count();
        return array.length != distinctCount;
    }
}
