import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2001));
        System.out.println(isItLiteVersion(2000, "Android"));
        System.out.println(deliveryDays(19));
    }

    public static String isLeapYear(int year) {
        if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    public static String isItLiteVersion(int year, String oc) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            return "Вам нужно установить lite версию для " + oc;
        } else {
            return "Вам нужно установить обычную версию для " + oc;
        }
    }

    public static String deliveryDays (int distance) {
        int counter = 0;
        if (distance < 20) {
            counter++;
        } else {
            counter += 2;
            if (distance >= 60) {
                counter++;
            }
        }
        return "Потребуется дней: " + counter;
    }
}