package workSpace;

import java.time.LocalTime;

public class ShowCurrentTime {

    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinute = totalSeconds / 60;

        long currentMinute = totalMinute % 60;

        long totalHours = totalMinute / 60;

        long currentHour = totalHours % 24 ;
        long hour = currentHour + 1;
//display results
        System.out.println("current time is " +hour + ":"
         + currentMinute + ":" + currentSecond + " GMT");
        System.out.println(totalMilliseconds);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }
}
