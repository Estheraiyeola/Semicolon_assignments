package tdd;

public class Mp3Player {
    private boolean isOn;
    private int volume;
    private int song;
    private boolean isPlay;


    public void setOn(boolean set) {
        isOn = set;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setVolume(int volume) {
        if (isOn && volume >= 0 && volume <= 10){
            this.volume = volume;
        }

    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        volume += 1;
    }

    public void decrease() {
        volume -= 1;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public int getSong() {
        return song;
    }

    public void nextSong() {
        song += 1;
    }

    public void previousSong() {
        song -= 1;
    }

    public void setPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }

    public boolean IsPlay() {
        return isPlay;
    }
}
