package bai_4.bai_tap.stop_watch;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[] numbers = new int[100000000];
        for (int a:numbers
             ) {
            a = (int) (Math.random()*100000000);
        }
        StopWatch stopWatch = new StopWatch();
        Arrays.sort(numbers);
        stopWatch.end();
        System.out.println("milisecond: " + stopWatch.getElapsedTime());
    }
}
