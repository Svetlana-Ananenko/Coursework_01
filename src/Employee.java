public class Employee {

    public double summSalary;
    private String lastName;
    private String name;
    private String patronymic;
    private int department;
    private double salary;




    public Employee(String lastName, String name, String patronymic, int department, double salary) {

        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;

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



    //Для печати всех полей метода Employee
    public String toString () {

            System.out.print("ФИО: " + this.lastName + " " + this.name + " " + this.patronymic + " " + ". Номер отдела: " + this.department + ". Зарплата: " + this.salary);
        return " ";
    }


    //Для печати только поля Salary из всех полей метода Employee
    public double salary () {
       return this.salary;
    }

//Для печати только полей ФИО из всех полей метода Employee
    public String printName() {
        System.out.print("ФИО: " + this.lastName + " " + this.name + " " + this.patronymic);
        return "";
    }


    public int hashCode() {
        return java.util.Objects.hash(lastName, name, patronymic, department, salary);
    }


    @Override
    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()) {
            return false;
        }
        Employee firstEmployees = (Employee) other;
        boolean employeesComparison = ((lastName.equals(firstEmployees.lastName)) && (name.equals(firstEmployees.name)) && (patronymic == firstEmployees.patronymic));
        return employeesComparison;
    }




}
