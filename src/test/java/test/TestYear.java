package test;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/23 18:40
 */
public class TestYear {
    @Test
    public void testMain() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int year = Integer.parseInt(string.substring(0, 4));
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("润");
        } else {
            System.out.println("平");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int year = Integer.parseInt(string.substring(0, 4));
        //1.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("润年");
        } else {
            System.out.println("非闰年");
        }
        //2.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.parse(string, formatter);
        int dateDayOfYear = date.getDayOfYear();
        System.out.println(string + "是" + year + "年的第" + dateDayOfYear + "天");
    }

//    public static void main(String[] args) {
//        String dateString = "20220817";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        LocalDate date = LocalDate.parse(dateString, formatter);
//        int dayOfYear = date.getDayOfYear();
//        int year = date.getYear();
//        if (year == 2022 && dayOfYear == 76) {
//            System.out.println("Yes, it is the 76th day of 2022.");
//        } else {
//            System.out.println("No, it is not the 76th day of 2022.");
//        }
//    }
}
