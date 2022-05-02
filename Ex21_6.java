package Activity_11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex21_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while(true){
            int number = scanner.nextInt();
            if(number != 0)
                break;
            set.add(number);
        }

        int count = 0;
        int[][] element = new int[set.size()][2];
        int index = 0;
        for (int a : set){
            set.remove(a);
            for (int i : set) {
                if(a == i)
                    count++;
            }
            element[index][0] = a;
            element[index][1] = count;
            index++;

        }
    }
}
