import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("students.txt"));
            FileWriter fw = new FileWriter("report.txt", true);

            while (sc.hasNext())
                fw.write(sc.next() + " Avg=" +
                    (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3.0 + "\n");

            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {}
    }
}