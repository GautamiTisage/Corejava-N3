package multilevelinheritance;
import java.util.Scanner;
public class multilevelinheritancedemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter model no,version, slottype");
		int modelno=s.nextInt();
		s.nextLine();
		String version=s.nextLine();
		String slottype=s.nextLine();
		
		iphone i=new iphone();
		
		iphone i1=new iphone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
		i1.slotetype();
		i1.accept();
		i1.display();
		System.out.println(i1);
	}

}