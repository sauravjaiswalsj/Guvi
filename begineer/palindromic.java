import java.util.*;
public class palindromic{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String n=cin.nextLine();
		StringBuffer b=new StringBuffer(n);
		String t=b.reverse().toString();
		System.out.println(n);
		if(t.equals(n)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}




