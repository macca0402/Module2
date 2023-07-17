package SS10.demo.MVC.respository;

import SS10.demo.MVC.model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static final List<Student> students=new LinkedList<>();
    static {
        students.add(new Student(1,"Nhi xinh dep","1/2/1233",9));
        students.add(new Student(2,"Nhi xinh dep","1/2/1233",9));
        students.add(new Student(3,"Nhi xinh dep","1/2/1233",9));
        students.get(1);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }


    @Override
    public void remove(Student student) {

    }

    @Override
    public void add(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return students;
    }

}
