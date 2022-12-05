package CoursePaper20221128;

public class Staffer {

    public static void credentialsPrint(Employee[] employeeAccounting) {
        System.out.println("Учетные данные: ");
        for (Employee employee : employeeAccounting) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // Вычисляем сумму затрат на зарплаты за месяц
    public static int findSumWithoutUsingStream(Employee[] employeeAccounting) {
        int sum = 0;
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static void findSumWithoutUsingStreamPrint(Employee[] employeeAccounting) {
        System.out.println("Всего затраты на зарплату за месяц: " + Staffer.findSumWithoutUsingStream(employeeAccounting) + " рублей");
    }

    // Вычисляем среднюю сумму затрат на зарплаты за месяц
    public static double findAverageWithoutUsingStream(Employee[] employeeAccounting) {
        int sum = findSumWithoutUsingStream(employeeAccounting);
        int counterSalary = 0;
        for (Employee employee : employeeAccounting) {
            if (employee != null) {
                counterSalary++;
            }
        }
        return (double) sum / counterSalary;
    }

    public static void findAverageWithoutUsingStreamPrint(Employee[] employeeAccounting) {
        System.out.println("Среднее значение затрат на зарплаты за месяц " + findAverageWithoutUsingStream(employeeAccounting) + " рублей");
    }

    // Вычисляем максимальную зарплату сотрудника
    public static int getMax(Employee[] employeeAccounting) {
        int max = Integer.MIN_VALUE;
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
                max = Math.max(max, employee.getSalary());
            }
        }
        return max;
    }

    public static void getMaxPrint(Employee[] employeeAccounting) {
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
                if (employee.getSalary() == getMax(employeeAccounting)) {
                    System.out.println("Максимальная зарплата сотрудника: " + employee);
                }
            }
        }
    }

    // Вычисляем минимальную зарплату сотрудника
    public static int getMin(Employee[] employeeAccounting) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
                min = Math.min(min, employee.getSalary());
            }
        }
        return min;
    }

    public static void getMinPrint(Employee[] employeeAccounting) {
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
                if (employee.getSalary() == getMin(employeeAccounting)) {
                    System.out.println("Минимальная зарплата сотрудника: " + employee);
                }
            }
        }
    }

    // формируем список сотрудников
    public static void listOfEmployees(Employee[] employeeAccounting) {
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {
            }
            System.out.println(employee.getSuname() + " " + employee.getFirstName() + " " + employee.getPatronymic());
        }
    }

    // индексация зарплат
    public static void salaryChange(Employee[] employeeAccounting) {
        double riceRate = 1.07;
        double salaryChanges = 0;
        for (Employee employee : employeeAccounting) {
            if (employeeAccounting != null) {

                salaryChanges = employee.getSalary() * riceRate;
                System.out.println(employee.getSuname() + " " + employee.getFirstName() + " " + employee.getPatronymic() + " " + salaryChanges);
            }
        }
    }

    }




























