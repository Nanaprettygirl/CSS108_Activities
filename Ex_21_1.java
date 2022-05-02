package Activity_11;

import java.util.LinkedHashSet;

public class Ex_21_1 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("George");
        linkedHashSet1.add("Jim");
        linkedHashSet1.add("John");
        linkedHashSet1.add("Blake");
        linkedHashSet1.add("Kevin");
        linkedHashSet1.add("Michael");

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("George");
        linkedHashSet2.add("Katie");
        linkedHashSet2.add("Kevin");
        linkedHashSet2.add("Michelle");
        linkedHashSet2.add("Ryan");

        LinkedHashSet<String> union = new LinkedHashSet<>();
        union.addAll(linkedHashSet1);
        union.addAll(linkedHashSet2);

        System.out.println("Union: " + union);


        LinkedHashSet<String> intersection = new LinkedHashSet<>();
        for (String a1: linkedHashSet1) {
            for (String a2 : linkedHashSet2) {
                if (a1.equals(a2))
                    intersection.add(a1);
            }
        }
        System.out.println("Intersection: " + intersection);


        LinkedHashSet<String> difference = (LinkedHashSet<String>) linkedHashSet1.clone();
        difference.removeAll(linkedHashSet2);
        System.out.println("Difference: " + difference);
    }
}
