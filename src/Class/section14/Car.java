package src.Class.section14;

public class Car {
    private int speed;
    private boolean stop;
    public int getSpeed(){
        return speed;
    };

    public int setSpeed(int speed){
        if(speed<0){
            this.speed=0;

        }else{
            this.speed=speed;
        }
        return speed;
    }

    public boolean isStop(){
        return stop;
    }

    public void setStop(boolean stop){
        this.stop=stop;
        if( stop ){
            this.speed = 0;
        }
    }

}
