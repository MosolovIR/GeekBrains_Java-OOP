package OOP_lessons.Seminar3.Study_group;

import java.util.Iterator;
import java.util.List;

class StudentIterator implements Iterator<Student> {
    private int currentIndex;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > currentIndex;
    }

    @Override
    public Student next() {
        return students.get(currentIndex++);
    }
}
