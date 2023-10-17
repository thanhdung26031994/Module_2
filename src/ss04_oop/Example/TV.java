package ss04_oop.Example;

public class TV {
    int channel = 1;
    int volmeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= -1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    public void setVolme(int newVolmeLevel){
        if (on && newVolmeLevel >= 1 && newVolmeLevel <= 7){
            volmeLevel =newVolmeLevel;
        }
    }
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
        if (on && volmeLevel < 7){
            volmeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volmeLevel > 1){
            volmeLevel--;
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.channelDown();
        tv1.channelUp();
        tv1.channelUp();
        tv1.setVolme(8);

        TV tv2 = new TV();
        tv2.turnOff();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel
        + " and volume level is " + tv1.volmeLevel);
        System.out.println("tv2's channel is " + tv2.channel
        + " and volume level is " + tv2.volmeLevel);
    }
}
