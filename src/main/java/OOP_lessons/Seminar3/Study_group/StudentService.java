package OOP_lessons.Seminar3.Study_group;

public class StudentService {
    private StudentGroup studyGroup;
    private StudentBuilder builder;

    public StudentService() {
        studyGroup = new StudentGroup();
        builder = new StudentBuilder();
    }

    public void addStudent(String studentName, int studentAge) {
        Student student = builder
                .setStudentName(studentName)
                .setStudentAge(studentAge)
                .build();
        studyGroup.addStudent(student);
    }

    public void sortByName() {
        studyGroup.sortByName();
    }

    public void sortByAge() {
        studyGroup.sortByAge();
    }

    public String getStudentListInfo() {
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("Список студентов:\n");

        for (Student student: studyGroup){
            stringBuild.append(student);
            stringBuild.append("\n");
        }
        return stringBuild.toString();
    }
}
