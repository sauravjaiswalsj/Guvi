import java.util.*;
/*@author:sauravjaiswalsj
 */
public class spaceLine{
       public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
 		int count=0;
		String word=cin.nextLine();
		for(int i=0;i<word.length();i++){
			if(Character.isWhitespace(word.charAt(i))==true){
				count++;
			}
		}
		System.out.println(count);
       }
}       
