package example;

abstract class parent11{
	public parent11(){
		System.out.println("created construcror");
	}
	abstract public  void doing();
	abstract public void doing2();

}
class child11 extends parent11{	
	public void doing() {
		System.out.println("walikg");
	}
	public void doing2 () {
		System.out.println("runninng");
	}
}
 class child2 extends parent11{
	public void doing(){
		System.out.println("crawling");
	}
	public void doing2() {
		System.out.println("sneaking");
	}
} 
public  class ex_abstract {
	public static void main(String[] args) {
		child11 obj = new child11();
		child2 obj1 = new child2();
		obj.doing();
		obj.doing2();
		obj1.doing();
		obj.doing2();
		
				
				
				
				
				
				
				
				
				90
		}

}
