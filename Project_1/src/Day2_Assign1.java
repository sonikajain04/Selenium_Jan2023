public class Day2_Assign1 {
	//(((((10+2)+2)-2)*2)/2) = 12
	
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
		
	return multi;
	}
	public int div(int a, int b) {
		int div=a/b;
		//System.out.println("Result of Div "+div);
		System.out.println("Result of (((((10+2)+2)-2)*2)/2) - "+div);
		
	return div;
	}
	public static void main(String[] args) {
		
		Day2_Assign1 ar=new Day2_Assign1();
		int sumResult1=ar.sum(10,2);
		int sumResult2=ar.sum(sumResult1, 2);
		int subResult=ar.sub(sumResult2, 2);
		int mulResult=ar.multi(subResult, 2);
		int div=ar.div(mulResult, 2);
		}

}
