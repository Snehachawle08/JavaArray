package Lab3;

import java.time.LocalDate;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// create a method to accept date and print the duration in days,
	// months and years with regards to current system date.
		
		Scanner sc=new Scanner(System.in);
		LocalDate now=LocalDate,now();
		
	System.out.println("Enter date(dd/MM/yyyy) : ");
	String date=sc.nextLine();
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date1=LocalDate.parse(date,formatter);
	System.out.println("User Date is : "+date1);
	System.out.println("System Date is :"+now);
	
	Period diff=Period.between(date1, now);
System.out.println("The Duration is :"+ diff getYears()+"Years"+diff.getMonths()+"Months"+diff.getDays()+"Days");

	}

}
