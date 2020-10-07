import model.Student;

public class Manalch {
    public static void main(String args[]) {
        Student manalchStudent = new Student();
        manalchStudent.setName("Christian");
        manalchStudent.setAge(21);
        manalchStudent.setGender("Male");
        manalchStudent.setIdNo(120321);
        System.out.println(manalchStudent.getName());
        System.out.println(manalchStudent.getAge());
        System.out.println(manalchStudent.getGender());
        System.out.println(manalchStudent.getIdNo());
    }
}
