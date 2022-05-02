package Activity_10;


import java.util.LinkedList;
import java.util.ListIterator;

public class Ex_20_6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList  = new LinkedList<>();
        for (int i = 0; i < 50000; i++) {
            linkedList.add(i);
        }
        long getTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedList.get(i);
        }

        long getTimeEnd = System.currentTimeMillis();
        long time1 = getTimeEnd - getTimeStart;
        System.out.println("Using get(i): " + time1);


        long itTimeStart = System.currentTimeMillis();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        long itTimeEnd = System.currentTimeMillis();
        long time2 = itTimeEnd - itTimeStart;
        System.out.println("Using iterator: " + time2);
    }
}
