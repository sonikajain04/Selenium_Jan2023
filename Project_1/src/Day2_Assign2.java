public class Day2_Assign2 {
	
	//((((10/2)-2)+2)-2)*2) =6

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
		int multi=a*b;
		System.out.println("Result of multiplication "+multi);
		System.out.println("Result of ((((10/2)-2)+2)-2)*2) = "+multi);		
	return multi;
	}
	public int div(int a, int b) {
		int div=a/b;
		System.out.println("Result of Div "+div);
	return div;
	}
	public static void main(String[] args) {
		
		Day2_Assign2 ar=new Day2_Assign2();
		int divResult1=ar.div(10,2);
		int subResult=ar.sub(divResult1, 2);
		int sumResult=ar.sum(subResult, 2);
		int subResult1=ar.sub(sumResult, 2);
		int mulResult=ar.multi(subResult1, 2);
		}

}
