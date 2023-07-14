import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int a = Integer.parseInt(br.readLine());
    	
    	for(int i=1;i<=a;i++) {
    		for(int j=i;j<a;j++) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<i*2-1;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}