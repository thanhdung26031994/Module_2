package ss04_oop.Exercise.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date starTime;
    private Date endTime;
    public void getStarTime(){
        Date starTime = new Date();
    }
    public void getEndTime(){
        Date endTime = new Date();
    }
    public double getElapsedTime(){
        return this.starTime.getTime() - this.endTime.getTime();
    }
}
