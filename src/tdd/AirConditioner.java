package tdd;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void setOn(boolean set) {
        isOn = set;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature >= 30) temperature = 30;
        else ++temperature;
    }

    public void decreaseTemperature() {
        if(temperature <= 16) temperature = 16;
        else --temperature;
    }
}
