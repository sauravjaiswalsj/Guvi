import java.util.*;
class CheckVowel{
	public boolean Check(char c){
		return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' );
	}
	public void check_vowel(char c){
		//char c=name.charAt();
		if(Check(c)){
			System.out.println("Vowel");
		}
		else if((int)c<65 || (int)c>122){
			System.out.println("invalid");
		}
		else{
			System.out.println("Consonant");
		}
	}
}
class vowel{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		char name=cin.next().charAt(0);
		CheckVowel ob=new CheckVowel();
		ob.check_vowel(name);
	}
}
