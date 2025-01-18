package src.Ch14;

public class Calculator {
    private int money;

    private int getMoney(){
        return money;
    }

    public synchronized void setMoney1(int money){
        this.money=money;

        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
        System.out.println(Thread.currentThread().getName()+ this.money);
    }

    public void setMoney2(int money){
        synchronized (this){
            this.money=money;

            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            System.out.println(Thread.currentThread().getName()+this.money);
        }
    }

}
