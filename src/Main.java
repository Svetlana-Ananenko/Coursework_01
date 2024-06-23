import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        System.out.println("Список всех сотрудников со всеми имеющимися полями: ");
        employees[0] = new Employee(1, "Иванов", "Иван", "Иванович", 1, 35_000);
        employees[1] = new Employee(2, "Еремин", "Сергей", "Васильевич", 1, 50_000);
        employees[2] = new Employee(3, "Кривобоков", "Роман", "Юрьевич", 2, 15_000);
        employees[3] = new Employee(4, "Шевякова", "Елена", "Андреевна", 2, 10_000);
        employees[4] = new Employee(5, "Камратов", "Андрей", "Валерьевич", 3, 120_000);
        employees[5] = new Employee(6, "Евченко", "Евгений", "Вячеславович", 3, 20_000);
        employees[6] = new Employee(7, "Кестнер", "Алексей", "Васильевич", 4, 25_000);
        employees[7] = new Employee(8, "Бушмакина", "Ирина", "Александровна", 4, 40_000);
        employees[8] = new Employee(9, "Иванова", "Наталья", "Викторовна", 5, 5_000);
        employees[9] = new Employee(10, "Халявин", "Виктор", "Иванович", 5, 1_000);

        //печатаю список всех сотрудников со всеми полями
        Employee.printAll(employees);

        //печатаю cумму затрат в месяц на ЗП всех сотрудников
        Employee.summaAllOnMonth(employees);

        //Нахожу самую Максимальную ЗП
        Employee.maxSummaOnMonthForEmployee(employees);

        //Нахожу самую минимальную ЗП
        Employee.minSummaOnMonthForEmployee(employees);

        //Нахожу среднюю ЗП
        Employee.averageSalary(employees);

        //Печатаю ФИО всех сотрудников компании
        Employee.printName(employees);

        //Печатаем для каждого объекта Хэш код
        Employee.checkHash(employees);

        //Сравнение через иквэлс
        Employee.equalsEmployee(employees);

    }
}