import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        isLeapYear(2000);
        isItLiteVersion(2023, 1);
        System.out.println("Потребуется дней: " + deliveryDays(19));
    }

    public static void isLeapYear(int year) {
        if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void isItLiteVersion(int year, int oc) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            if (oc == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (oc == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (oc == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (oc == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }

    public static int deliveryDays (int distance) {
        int counter = 0;
        if (distance < 20) {
            counter++;
        } else {
            counter += 2;
            if (distance >= 60) {
                counter++;
            }
        }
        return counter;
    }
}