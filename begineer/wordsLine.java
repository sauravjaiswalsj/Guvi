/* 
 * @author : sauravjaiswalsj
 * @platform: guvi
 */
import java.util.*;
public class wordsLine{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String word=cin.nextLine();
		int count=0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' ' || word.charAt(i)=='\n'){
				count++;
			}
		}
		System.out.println(count+1);
	}
}
