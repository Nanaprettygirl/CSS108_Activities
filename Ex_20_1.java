package Activity_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_20_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        Scanner scanner = null;
        try {
            File file = new File(fileName);
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }catch (NullPointerException e) {
            System.out.println("null pointer exception");
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
                if (Character.isLetter(s.charAt(0))){
                    list.add(s);
                }
                else
                    System.out.println("incorrect input");
        }
        Collections.sort(list);
        for (String a: list) {
            System.out.println(a);
        }
    }
}
