package tdd;

public class Television {
    private  boolean isOn;
    private int volume;
    private int channel;

    public void setOn(boolean set) {
        isOn = set;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume >= 10) volume = 10;
        else volume += 1;
    }

    public void decreaseVolume() {
        if (volume <= 0) volume = 0;
        else volume -= 1;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        if (channel >= 10) channel = 10;
        else channel += 1;
    }

    public void previousChannel() {
        if (channel <= 1) channel = 1;
        else channel -= 1;
    }
}
