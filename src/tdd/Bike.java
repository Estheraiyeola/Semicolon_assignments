package tdd;

public class Bike {

    private boolean isOn;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean set) {
        isOn = set;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed >= 0){
            if (speed <= 20){
                speed += 1;
            }
        }
        if (speed >= 21){
            if (speed <= 30){
                speed += 2;
            }
        }
        if (speed >= 31){
            if (speed <= 40){
                speed += 3;
            }
        }
        if (speed >= 41){
            speed += 4;
        }
    }

    public void decelerate() {
        if (speed >= 0){
            if (speed <= 20){
                speed -= 1;
            }
        }
        if (speed >= 21){
            if (speed <= 30){
                speed -= 2;
            }
        }
        if (speed >= 31){
            if (speed <= 40){
                speed -= 3;
            }
        }
        if (speed >= 41){
            speed -= 4;
        }
    }
}
