/* @author:sauravjaiswalsj*/
import java.util.*;
class CountLetters{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++){
			if(Character.isWhitespace(s.charAt(i))==false){
				count++;
			}
		}
		System.out.println(count);

	}
}
