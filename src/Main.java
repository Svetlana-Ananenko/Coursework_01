import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Employee[] employees = new Employee[10];
        System.out.println("Список всех сотрудников со всеми имеющимися полями: ");
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 35_000);
        employees[1] = new Employee("Еремин", "Сергей", "Васильевич", 1, 50_000);
        employees[2] = new Employee("Кривобоков", "Роман", "Юрьевич", 2, 15_000);
        employees[3] = new Employee("Шевякова", "Елена", "Андреевна", 2, 10_000);
        employees[4] = new Employee("Камратов", "Андрей", "Валерьевич", 3, 120_000);
        employees[5] = new Employee("Евченко", "Евгений", "Вячеславович", 3, 20_000);
        employees[6] = new Employee("Кестнер", "Алексей", "Васильевич", 4, 25_000);
        employees[7] = new Employee("Бушмакина", "Ирина", "Александровна", 4, 40_000);
        employees[8] = new Employee("Петров", "Иван", "Петрович", 5, 5_000);
        employees[9] = new Employee("Халявин", "Виктор", "Иванович", 5, 1_000);


        //печатаю список всех сотрудников со всеми полями
        for (int i = 0; i < employees.length; i++) {
            System.out.print("id-" + (i+1)+" ");
            System.out.println(employees[i]);

        }





        double summ = 0;
        for (int i = 0; i < employees.length; i++) {

            if ( employees[i].salary() > 0 ) {
                summ = summ + employees[i].salary();
            }
        }
        System.out.println(  "\nСумма затрат на ЗП всех сотрудников в месяц составляет: " + summ);

        System.out.println("_______________________");

//Нахожу самую Максимальную ЗП

        double summ2 = 0;
        for (int i = 0; i < employees.length; i++) {

            if ( employees[i].salary() > summ2 ) {
                summ2 = employees[i].salary();
            }

        }
        System.out.println(  "\n Максимальная зарплата сотрудника составляет: " + summ2);

        for (int i = 0; i < employees.length; i++) {

            if ( employees[i].salary() == summ2 ) {
                System.out.print("В нашей компании, сотрудник с самой большой ЗП, является: " );
                System.out.println((employees[i]));

            }
        }


        System.out.println("_______________________");


//Нахожу самую низкую ЗП
        for (int i = 0; i < employees.length; i++) {

            if ( employees[i].salary() < summ2 ) {
                summ2 = employees[i].salary();
            }
        }
        System.out.println(  "\n Минимальная зарплата сотрудника составляет: " + summ2);


        for (int i = 0; i < employees.length; i++) {
            if ( employees[i].salary() == summ2 ) {
                System.out.print("В нашей компании, сотрудник с самой низкой ЗП, является: " );
                System.out.println((employees[i]));

            }
        }

        System.out.println("_______________________");


//Нахожу среднюю ЗП
        summ =  summ / (employees.length);
        System.out.println("\nСредняя значение зарплат составляет: " + summ + "\n");


        System.out.println("_______________________");


//Печатаю ФИО всех сотрудников компании
        System.out.println("Список всех сотрудников компании: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println((employees[i].printName()));

        }




    }



}