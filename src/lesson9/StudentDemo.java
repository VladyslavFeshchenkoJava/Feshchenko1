package lesson9;

public class StudentDemo {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("AAAA", "BBBB", "C-42", 5);
        students[1] = new Aspirant("CCCC", "DDDD", "C-41", 5, "Sc1");
        students[2] = new Aspirant("EEEE", "FFFF", "C-41", 4.1, "Sc2");

        System.out.println(students[0].firstName + " " + students[0].lastName);
        System.out.println(students[1].firstName + " " + students[1].lastName);

        for (Student student : students) {

            System.out.println(student.firstName + " scholarship: " + student.getScholarship(student.averageMark));
        }
    }
}
