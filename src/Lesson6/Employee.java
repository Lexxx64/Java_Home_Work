package Lesson6;

public class Employee {
    int id;
    int age;
    String firstName;
    String lastName;
    double salary;

    public Employee(int id, int age, String firstName, String lastName, double salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 50;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return e.firstName == firstName && e.lastName == lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d лет, зарплата - $%.2f", firstName, lastName, age, salary);
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public boolean olderThan(Employee e) {
        return (age > e.age);
    }

    public void upgrade() {
        salary += 20;
    }
}
