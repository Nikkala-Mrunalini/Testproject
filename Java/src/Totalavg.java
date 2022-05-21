import java.util.*;
public class Totalavg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of student 1:");
		System.out.println("A");
		int A1=sc.nextInt();
		System.out.println("B");
		int B1=sc.nextInt();
		System.out.println("C");
		int C1=sc.nextInt();
		System.out.println("Enter the marks of students 2:");
		System.out.println("A:");
		int A2=sc.nextInt();
		System.out.println("B");
		int B2=sc.nextInt();
		System.out.println("C");
		int C2=sc.nextInt();
		System.out.println("Enter the marks of student 3:");
		System.out.println("A:");
		int A3=sc.nextInt();
		System.out.println("B");
		int B3=sc.nextInt();
		System.out.println("C");
		int C3=sc.nextInt();
		int sum1=A1+B1+C1;
		int sum2=A2+B2+C2;
		int sum3=A3+B3+C3;
		int avg1=sum1/3;
		int avg2=sum2/3;
		int avg3=sum3/3;
		int A_Subtotal=A1+A2+A3;
		int B_Subtotal=B1+B2+B3;
		int C_Subtotal=C1+C2+C3;
		int A_avg=A_Subtotal/3;
		int B_avg=B_Subtotal/3;
		int C_avg=C_Subtotal/3;
		System.out.println("Student 1 total "+sum1+" and average marks " +avg1);
	}

}
