package sk.it;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Student.studentInterface log = (a) -> a;
        Student.studentInterface change = (a) -> a.toUpperCase();
        Student.studentInterface replace = (a) -> a.replace("A", "x");

        System.out.println(student.operateStudent("hallo", log));
        System.out.println(student.operateStudent("hallo", change));
        System.out.println(student.operateStudent("hAllo", replace));
    }
}
