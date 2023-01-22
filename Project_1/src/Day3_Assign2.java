public class Day3_Assign2 {
	
	public void m() {//Default
		this.m4(1, 2, 3,4);
		System.out.println("Default constructor");		
	}
	public void m1(int a) { //one
		this.m();
		System.out.println("One parameterized constructor");		
	}
	public void m2(int a,int b) {//two
		this.m3(1, 2, 3);
		System.out.println("Two parameterized constructor");		
	}	
	public void m3(int a,int b,int c) {//Three
			this.m1(1);
			System.out.println("Three parameterized constructor");		
	}
	public void m4(int a,int b,int c,int d) {//Four
		System.out.println("Four parameterized constructor");		
	}
	
	public static void main(String[] args) {
		Day3_Assign2 obj=new Day3_Assign2();
		obj.m2(1,2);
	}
}
