import java.util.Scanner;

public class CountCharLineWord{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String str=sc.nextLine();
		int lineL=str.split("\\.").length;
		int wordL=str.split(" ").length+lineL-1;
		int charC=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' '&&str.charAt(i)!='.' ) {
				charC++;
			}
			System.out.println("no. of line : "+lineL);
			System.out.println("no. of word : "+wordL);
			System.out.println("no. of character : "+charC);
		}
		
	}
}