package labs.firstLab;

import java.util.Date;

public class Kitten {

    public static void main(String[] args) {
        String firstName = "Александр";
        String middleName = "Сергеевич";
        String lastName = "Леонтьев";
        String tFirstName = "Елена";
        String tMiddleName = "Сергеевна";
        String tLastName = "Владимирова";
        String groupCode = "ИВТ/б 11-о";
        int numberOfVariant = 10;
        int value = 58;
        int numberOfSeats = 36;
        String fullName = firstName +" "+  middleName + " " + lastName;
        int profit = value * numberOfSeats;
        System.out.println("Программу выполнил: " + fullName);
        System.out.println("Группа: " + groupCode);
        System.out.println("Дата: " + new Date());
        System.out.println("Вариант: " + numberOfVariant);
        System.out.println("Стоимость билета: " + value);
        System.out.println("Число мест в автобусе:" + numberOfSeats);
        System.out.println("Выручка за рейс: " + profit);
        System.out.println("Проверил(а):" + tFirstName + " "+ tMiddleName+ " " + tLastName);
    }
}
