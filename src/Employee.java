import java.util.Objects;
import static java.util.Objects.hash;

public class Employee {
    private final String lastName;
    private final String name;
    private final String patronymic;
    private int department;
    private double salary;
    private int id;

    public Employee(int id, String lastName, String name, String patronymic, int department, double salary) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getName() {
        return this.name;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public int getDepartment() {
        return this.department;
    }
    public void setDepartment(int numberDepartment) {
        department = numberDepartment;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salaryOfWorker) {
        salary = salaryOfWorker;
    }


    public String toString() {

        System.out.print("id-" + this.id + " . ФИО: " + this.lastName + " " + this.name + " " + this.patronymic + " " + ". Номер отдела: " + this.department + ". Зарплата: " + this.salary);
        return " ";
    }

    //печатаю список всех сотрудников со всеми полями
    public static void printAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double summaAllOnMonth(Employee[] employees) {
        double summa = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > 0) {
                summa += employees[i].getSalary();
            }
        }
        System.out.println("\nСумма затрат на ЗП всех сотрудников в месяц составляет: " + summa);
        return summa;
    }
    //Нахожу сотрудника с самой большой ЗП
    public static void maxSummaOnMonthForEmployee(Employee[] employees) {
        double summa = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > summa) {
                summa = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == summa) {
                System.out.print("В нашей компании, сотрудник с самой большой ЗП, является: ");
                System.out.println((employees[i]));
            }
        }
    }
    //Нахожу сотрудника с самой низкой ЗП
    public static void minSummaOnMonthForEmployee(Employee[] employees) {
        double summa = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < summa) {
                summa = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == summa) {
                System.out.print("В нашей компании, сотрудник с самой низкой ЗП, является: ");
                System.out.println((employees[i]));
            }
        }
    }

    //считаем количество сотрдуников в компании
    public static double numberOfEmployeesInTheCompany(Employee[] employees) {
        double k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                k++;
            }
        }
        return k;
    }

    public static double averageSalary(Employee[] employees) {
        double summa = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > 0) {
                summa += employees[i].getSalary();
            }
        }
        double k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                k++;
            }
        }
        double averageSalary = summa / k;
        System.out.println("Средняя ЗП по компании составляет: " + averageSalary);
        return averageSalary;
    }

    //Для печати только полей ФИО из всех полей метода Employee
    public static void printName(Employee[] employees) {
        System.out.println("\nСписок всех сотрудников компании: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО: " + employees[i].lastName + " " + employees[i].name + " " + employees[i].patronymic);
        }
    }

    @Override
    public int hashCode() {
        return hash(lastName, name, patronymic, department, salary);
    }

    //Печатаем для каждого объекта Хэш код
    public static void checkHash(Employee[] employees) {
        System.out.print("\n Метод ХЭШ код: \n");
        int id = 1;
        for (int i = 0; i < employees.length; i++) {
            System.out.print("id-" + id + ": ");
            System.out.println(employees[i].hashCode());
            id++;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Employee firstEmployees = (Employee) other;
        boolean employeesComparison = ((lastName.equals(firstEmployees.lastName)) && (name.equals(firstEmployees.name)) && (patronymic == firstEmployees.patronymic));
        return employeesComparison;
    }

    public static void equalsEmployee(Employee[] employees) {
        System.out.print("\nCравним сотрудника id-1 со всеми остальными, через метод иквэлс, результат: \n");
        int index = 0;
        if (index >= 0 && index <= employees.length) {
            for (int i = 0; i < employees.length; i++) {
                if ((index != i) && (employees[index].equals(employees[i]) == true)) {
                    System.out.println("\n_____Схожи сотрудники, смотри id: " + (index + 1) + " и смотри id: " + (i + 1));
                    System.out.println(employees[index] + "_____\n");

                } else if ((index != i) && (employees[index].equals(employees[i]) == false)) {
                    System.out.print("Не найдено схожего сотрудника в id: ");
                    System.out.println((i + 1));
                }

            }

        } else {
            throw new IllegalArgumentException("Индекс не может быть больше чем размер массива, и не может быть меньше 0");
        }
    }
}


