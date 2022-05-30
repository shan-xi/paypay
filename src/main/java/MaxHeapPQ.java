import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeapPQ {
    PriorityQueue<Integer> pq;

    public MaxHeapPQ() {
        pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public void insert(int[] x) {
        for (int j : x) {
            pq.offer(j);
        }
    }

    public Integer extractMax() {
        return pq.poll();
    }

    public void display() {
        System.out.println(pq);
    }

    public int getSize() {
        return pq.size();
    }

    public Integer findDuplicate() {
        int prev = extractMax();
        while (!pq.isEmpty()) {
            int temp = extractMax();
            if (prev == temp) {
                return prev;
            } else {
                prev = temp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {1, 6, 2, 9, 4, 3, 8, 8};
        MaxHeapPQ pq = new MaxHeapPQ();
        pq.insert(a);
        pq.display();
        System.out.println(pq.findDuplicate());
    }
}
