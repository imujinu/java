package src.Ch14;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName());


        for(int i =0; i<4 ; i++){
            Thread thread = new Thread(){
                @Override
                public void run(){
                    System.out.println(getName());

                }
            };
            thread.start();
        }

        Thread thread3 = new Thread() {
            @Override
            public void run(){
                System.out.println(getName());
            }

        };
        thread3.setName("thread3333");
        thread3.start();


    }
}
