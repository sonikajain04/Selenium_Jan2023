public class Day3_Assign1 {
	
	public Day3_Assign1() {//Default
		this(1,2,3);
		System.out.println("Default constructor");		
	}
	public Day3_Assign1(int a) { //one
		this();
		System.out.println("One parameterized constructor");		
	}
	public Day3_Assign1(int a,int b) {//two
		this(1,2,3,4);
		System.out.println("Two parameterized constructor");		
	}	
	public Day3_Assign1(int a,int b,int c) {//Three
			System.out.println("Three parameterized constructor");		
	}
	public Day3_Assign1(int a,int b,int c,int d) {//Four
		this(1);
		System.out.println("Four parameterized constructor");		
	}
	
	public static void main(String[] args) {
		Day3_Assign1 obj=new Day3_Assign1(1,2);
		
	}
}
