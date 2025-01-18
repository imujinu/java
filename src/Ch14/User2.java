package src.Ch14;

public class User2 extends Thread {
    private Calculator calculator;

    public User2(){
        setName("User2");
    }

    public void setCalculator(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public void run(){
        calculator.setMoney2(50);
    }
}
