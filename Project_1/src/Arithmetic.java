
public class Arithmetic {
	public int sum(int a, int b) {
		int result=a+b;
		System.out.println("Result of sum : "+result);
	return result;
	}
	
	public int sub(int a1, int a2) {
		int c=a1-a2;
		System.out.println("Result of substraction : "+c);
	return c;
	}
	
	public int multi(int a, int b) {
		int result=a*b;
		System.out.println("Result of multiplication "+result);
	return result;
	}
	
	public static void main(String[] args) {
		Arithmetic ar=new Arithmetic();
		int sumResult=ar.sum(12,2);
		int subResult=ar.sub(10, 2);
		int mul=ar.multi(sumResult,subResult);
	//	System.out.println("Result of multiplication "+mul);
	}
}
