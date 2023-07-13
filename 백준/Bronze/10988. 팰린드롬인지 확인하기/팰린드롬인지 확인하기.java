import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = (a.length()/2);
		int c = 1;
		
		for(int i=0;i<b;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
				c=0;
			}
		}
		System.out.println(c);
	}

}