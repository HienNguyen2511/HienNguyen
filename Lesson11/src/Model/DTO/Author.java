package Model.DTO;

public class Author {

    int id;
    String name;
    int age;

    public Author() {

    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Author(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

}