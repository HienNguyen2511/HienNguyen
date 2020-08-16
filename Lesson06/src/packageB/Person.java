package packageB;

public class Person {
    public String name; // write read
    private long salary = 1000;

    public Person(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}