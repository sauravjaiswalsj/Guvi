import java.util.Scanner;
class LeapYear{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		int yr=cin.nextInt();
		if(yearChecker(yr)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}	
	}
	public static boolean yearChecker(int yr){
		if(yr%400==0)
			return true;
		else if((yr%100==0) && (yr%400!=0))
			return false;
		else if((yr%4==0) && ((yr%400!=0)||(yr%100!=0)))
			return true;
		else{
			return false;
		}

	}
}
