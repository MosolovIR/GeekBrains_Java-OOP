package OOP_lessons.Seminar3.Study_group;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent("Саша", 18);
        service.addStudent("Маша", 19);
        service.addStudent("Даша", 18);
        service.addStudent("Паша", 17);

        System.out.println(service.getStudentListInfo());
        service.sortByName();
        System.out.println(service.getStudentListInfo());
        service.sortByAge();
        System.out.println(service.getStudentListInfo());
    }
}
