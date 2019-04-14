import java.util.Scanner;
class Alphabet{
	public static void main(String[] args){
		Scanner cin= new Scanner(System.in);
		char a=cin.next().charAt(0);
		//int result=Integer.parseInt(a);
		if(((int)a>=(int)'A' && (int)a<='Z')||((int)a>=(int)'a' && (int)a<=(int)'z')){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}
	}
}
