package OOP_lessons.Seminar3.Study_group;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", Name = '" + name + '\'' +
                ", Age = " + age +
                '}';
    }
}
