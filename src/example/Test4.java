package example;
import java.io.*;
public class Test4 {

	public static void main(String[] args) throws IOException 
	{
		
//	      	final int A=22;
			int s;
			File f= new File("D:\\Lc.text");
			if(f.createNewFile()) {
				System.out.println("creadted file");
			}
			else {System.out.println("file already exist");}
			FileReader r = new FileReader(f);
			try 
			{
				s= r.read();
				while (s!=-1) {
					System.out.print((char)s);
					s=r.read();
					
				}
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}	
			finally {
				r.close();
			}
			}
			
}
		
	


