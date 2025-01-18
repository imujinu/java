package src.Ch14;

public class User1 extends Thread{
    private Calculator calculator;

    public User1(){
        setName("User1");
    }

    public void setCalculator(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public void run(){
        calculator.setMoney1(100);
    }
}
