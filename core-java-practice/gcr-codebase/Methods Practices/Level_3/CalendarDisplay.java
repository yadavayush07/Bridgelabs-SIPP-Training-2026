import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        Calendar c = new GregorianCalendar(year, month - 1, 1);

        String[] m = {"January","February","March","April","May","June",
                      "July","August","September","October","November","December"};

        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int start = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(m[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < start; i++)
            System.out.print("    ");

        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + start - 1) % 7 == 0)
                System.out.println();
        }
    }
}