package example;

class MyClass{
		private int emp;
		private String name;
		private double height;
		public static void have(){
			System.out.println("print somthong");
		}
		
		MyClass (int emp , String name , double height ){
			this.emp= emp;
			this.height= height;
			this.name= name;
			
			
		}
		public int getEmp() {return emp;}		//getters
		public String getName() {return name;}
		public double getHeight() {return height;}
		
		public void setEmp(int newemp) {this.emp = newemp;}//setter
		public void setName(String newname) {this.name=newname;}
		public void setHeight(double newheight) {this.height = newheight;}
}	
		
	
public class Queue {
	public static void main(String s[]) {
		MyClass c1= new MyClass(14415, "Sahilnawab", 5.11);
		MyClass c2 = new MyClass(20897, "hiren", 5.5);
		System.out.println(c1.getEmp() +"\t"+ c1.getHeight() +"\t"+ c1.getName());
		System.err.println(c2.getEmp() +"\t"+ c2.getHeight() +"\t"+ c2.getName());
		MyClass.have();
	}
}
