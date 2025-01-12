package src.Section7;

public class InstanceofExample {
    public static void personInfo(Person person){
        System.out.println("name: " + person.name);
        person.walk();

        // instanceof 사용 위치 수정
        if(person instanceof Student student){
            System.out.println("Student no: " + student.studentNo);
            student.study();
        }
    }


    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);
        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }



}
