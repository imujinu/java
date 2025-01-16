package src.Ch13;

public class Course {
    public static void register1 ( Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
    public static void register2 ( Applicant<? extends Student> applicant)
    {
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
    public static void register3 ( Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());

    }
}
