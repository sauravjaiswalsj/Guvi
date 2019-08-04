import java.util.*;
import java.lang.*;
    public class HourSub{
        public static void main(String[] args){
            Scanner cin = new Scanner(System.in);
            int hour1 = cin.nextInt();
            int min1 = cin.nextInt();
	    int hour2 = cin.nextInt();
	    int min2 = cin.nextInt();
            System.out.println(Math.abs(hour1-hour2)+" " +Math.abs(min1-min2));
        }
    }
        
