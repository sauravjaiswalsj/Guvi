import java.util.*;

class positive{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if(n>0){
			System.out.println("Positive");
		}
		else if(n==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative");
		}
	}
}
