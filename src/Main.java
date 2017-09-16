import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat; 
public class Main1 {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit

	int l, choice;
	System.out.println("Enter number of Students:");
	Scanner in=new Scanner(System.in);
	l=in.nextInt();
	

	StudentGroup SG = new StudentGroup(l);//student array is created
	//should take ip from user and add student details

	Student s = new Student();
	
	System.out.println("Enter Id:");
	s.setId(in.nextInt());
	
	System.out.println("Enter Name:");
	s.setFullName(in.next());

	System.out.println("Enter Date of Birth:");
	String d = in.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	
	Date date2=null;
	try {
   	 //Parsing the String
    	date2 = dateFormat.parse(d);
	} catch (Exception e) {
   	 // TODO Auto-generated catch block
    	e.printStackTrace();
	}
	
	s.setBirthDate(date2);

	s.setAvgMark(70.6);
	

	System.out.println("1. AddFirst()");
	System.out.println("2. AddLast()");
	System.out.println("3. Add()");

	System.out.println("Enter Your choice:");
	choice=in.nextInt();
	switch(choice)
	{	case 1:	
			SG.addFirst(s);
			break;
		case 2:
			SG.addLast(s);
			break;

		case 3:
			System.out.println("Enter index as zero:");
			SG.setStudent(s,0);
			break;

		

	}
	s = SG.getStudent(0);
	System.out.println(s.getId() + s.getFullName() + s.getBirthDate() + s.getAvgMark());
	SG.getStudent(0);

}	
}
