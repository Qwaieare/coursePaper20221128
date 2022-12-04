package CoursePaper20221128;
import com.sun.tools.javac.Main;
import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class CoursePaper20221128 {

    public static void main(String[] args) {

        Employee[] employeeAccounting = new Employee[] {
        new Employee("Абакумов", "Александр", "Владимирович", 40_000, 1),
        new Employee("Бондарь", "Яна", "Сергеевна", 20_000, 1),
        new Employee("Гречанин", "Виктор", "Иванович", 38_000, 2),
        new Employee("Дронова", "Ирина", "Николаевна", 35_000, 2),
        new Employee("Залин", "Яков", "Васильевич", 36_000, 3),
        new Employee("Красикова", "Мария", "Ивановна", 19_000, 3),
        new Employee("Лемутов", "Алексей", "Валерьевич", 41_000, 4),
        new Employee("Мамонова", "Анна", "Михайловна", 25_000, 4),
        new Employee("Никулин", "Михаил", "Юрьевич", 37_000, 5),
        new Employee("Орлова", "Ольга", "Петровна", 28_000, 5),
        };

        Staffer.credentialsPrint(employeeAccounting);
        System.out.println();
        Staffer.findSumWithoutUsingStreamPrint(employeeAccounting);
        System.out.println();
        Staffer.findAverageWithoutUsingStreamPrint(employeeAccounting);
        System.out.println();
        Staffer.getMaxPrint(employeeAccounting);
        System.out.println();
        Staffer.getMinPrint(employeeAccounting);
        System.out.println();
        Staffer.listOfEmployees(employeeAccounting);
        System.out.println();
        System.out.println("Учетные данные с индексацией зарплаты:");
        Staffer.salaryChange(employeeAccounting);

    }

}