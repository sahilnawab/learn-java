package example;
import java.io.*;
public class Java_io {

	public static void main(String[] args) throws IOException {
	int a,b;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
		a = Integer.parseInt(br.readLine());
		b= Integer.parseInt(br.readLine());
		System.out.println(a);
		System.out.println(b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

} 
