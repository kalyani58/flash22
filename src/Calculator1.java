import java.util.Scanner;

class calculation{
	int firstno,secondno,add,sub,mul,div;
	
   Scanner s=new Scanner(System.in);
  
	
	void Addition() {
		 System.out.println("Enter two number:");
		 firstno=s.nextInt();
		 secondno=s.nextInt();
		 add=firstno+secondno;
		 System.out.println("Addition of number id:"+add);
	}
	void Sub() {
		 System.out.println("Enter two number:");
		 firstno=s.nextInt();
		 secondno=s.nextInt();
		 sub=firstno-secondno;
		 System.out.println("subtraction of number is:"+sub);
	}
	void Multipliction() {
		 System.out.println("Enter two number:");
		 firstno=s.nextInt();
		 secondno=s.nextInt();
		 mul=firstno*secondno;
		 System.out.println("multipliction of number is:"+mul);
	}
	void Division() {
		 System.out.println("Enter two number:");
		 firstno=s.nextInt();
		 secondno=s.nextInt();
		 div=firstno/secondno;
		 System.out.println("division of number is:"+div);
	}
}

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation cal=new calculation();
		cal.Addition();
		cal.Sub();
		cal.Division();
		cal.Multipliction();
	}

}
