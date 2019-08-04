import java.util.*;
    public class HourMin{
        public static void main(String[] args){
            Scanner cin = new Scanner(System.in);
            int sec = cin.nextInt();
            int hour= sec/60;
            int remMin=sec%60;
            System.out.println(hour+" " +remMin);
        }
    }

