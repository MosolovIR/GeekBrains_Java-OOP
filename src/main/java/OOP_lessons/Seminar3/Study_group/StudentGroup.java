package OOP_lessons.Seminar3.Study_group;

import java.util.*;

public class StudentGroup implements Iterable<Student> {
    private int generateId;
    private List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortByName() {
        Collections.sort(students);
    }

    public void sortByAge() {
        Collections.sort(students, new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
