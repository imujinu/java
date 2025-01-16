package src.Ch13;

public class CourseExample {
    public static void main(String[] args) {
        Course.register1(new Applicant<Person>( new Person()));


        Course.register2(new Applicant<Student>(new Student()));

        Course.register3(new Applicant<Worker>(new Worker()));
    }
}
