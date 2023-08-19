import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) {
			String str[] = br.readLine().split(" ");
			
			String s = str[1];
			int b = Integer.parseInt(str[0]);
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<b;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
