import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue <String> ds= new PriorityQueue<String>(new CustomComparator());
        ds.offer("Chau Thi");
        ds.offer("Hong Thanh");
        ds.offer("Hong Thao");
        ds.offer("Bao Trong");
        ds.offer("Bao Tram");

        while (!ds.isEmpty()){
            System.out.println(ds.poll());
        }

        Deque <Integer> d= new ArrayDeque<Integer>();
        d.offerLast(12);
        d.offerFirst(1379);
        d.offerFirst(102);
        d.offerLast(199);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d.pollFirst());
        System.out.println(d.peekFirst());

    }
}

class CustomComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        if (s1.compareTo(s2) > 1) return -1;
        else return 1;
    }
}
