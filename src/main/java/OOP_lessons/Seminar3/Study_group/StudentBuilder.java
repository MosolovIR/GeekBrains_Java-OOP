package OOP_lessons.Seminar3.Study_group;

public class StudentBuilder {
    private int generateId;
    private Student student;
    private int studentAge;
    private String studentName;

    public StudentBuilder() {
        createStudent();
    }

    public StudentBuilder setStudentAge(int studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    private void createStudent(){
        student = new Student();
    }

    private void nextId(){
        student.setId(generateId++);
    }

    private void createName(){
        student.setName(studentName);
    }

    private void createAge(){
        student.setAge(studentAge);
    }

    public Student build() {
        createStudent();
        createName();
        createAge();
        nextId();
        return student;
    }
}
