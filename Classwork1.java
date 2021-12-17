package Lection52;

import java.io.File;
import java.util.Arrays;

public class Classwork1 {
    public static void main(String[] args) {
        File dir = new File("/home/user/SPO/TestFiles");

        String[] files = dir.list();
        if (files != null) {
            Arrays.sort(files);
        }

        System.out.println(Arrays.toString(files));
        System.out.println();

        String path = "/home/user/SPO/TestFiles/yPTest.txt";
        File f = new File(path);

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        files = dir.list();
        if (files != null) {
            Arrays.sort(files);
        }

        System.out.println(Arrays.toString(files));
    }
}
