package CoursePaper20221128;

import java.util.Objects;

public class Employee {

    // поля - это данные, которые являются локальными для класса, или экземпляры (объекты) этого класса

   private static int counter = 1;
    private final int id;
    private final String suname; // фамилия сотрудника
    private final String firstName; // имя сотрудника
    private final String patronymic; // отчество сотрудника
    private int salary; // зарплата в рублях
    private int department; // отделы
    // Конструкторы нужны для создания нового объекта данного класса,
    // еще выполняют начальную инициализацию объекта
    public Employee(String suname, String firstName, String patronymic, int salary, int department) {
        // ключевое слово this, которое представляет ссылку на текущий экземпляр класса
        this.suname = suname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        id = counter;
        counter++;
         }


    // метод доступа, обратиться к полям можно через геттеры
    public String getSuname() {
        return suname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getSalary() {
        return salary;
    }
    public int getDepartment() {
         return department;
    }
    public int getId() {
        return id;
      }
    public static int getCounter() {
        return counter;
    }

    // получить новое значение поля или обновить можно через сеттеры
    public void setSalary( int salary) {
        if (checkDepartment(salary)) {
            this.salary = salary;
        }
    }
    private boolean checkDepartment(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не отрицательная");
        }
        return true;
    }
    public void setDepartment( int department) {
        this.department = department;
         }

    // переопределяем метод equals, сравнение объектов двух одинаковых классов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || obj.getClass() != getClass()) { return false;}
        Employee employee = (Employee) obj;
        if (salary != employee.salary) { return false; }
        if (id != employee.id) { return false; }
        return Objects.equals(suname, employee.suname) &&
               Objects.equals(firstName, employee.firstName) &&
               Objects.equals(patronymic, employee.patronymic) &&
               Objects.equals(department, employee.department);
    }
    // переопределяем метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(suname, firstName, patronymic, salary, department, id);
    }
    @Override
    public String toString()
    {
        return ("№" + id + " " + suname + " " + firstName + " " + patronymic + " ежемесячный оклад " + salary + " отдел " + department);
    }
}
