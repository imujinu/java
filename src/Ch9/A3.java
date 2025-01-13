package src.Ch9;

public class A3 {
    public void method1(int arg){
        int var = 1;

        class B{
            void method2(){
                System.out.println("arg"+ arg);
                System.out.println("var" + var);

//                arg=2;
//                var=1;
            }
        }

        B b = new B();
        b.method2();
    }
}
