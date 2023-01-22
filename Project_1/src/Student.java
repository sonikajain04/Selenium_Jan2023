
public class Student {

	
	int age=3, roll_no=1;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.display1();
		st.display2();
		
		System.out.println("Values of the variable : age : "+st.age);
		System.out.println("Values of the variable : age : "+st.roll_no);
	}

}
