package sk.it;

public class Student {

    interface studentInterface {
        String operation(String string);
    }

    public String operateStudent(String string, studentInterface op) {
        return op.operation(string);
    }
}
