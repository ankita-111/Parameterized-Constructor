
public class CustomerTest {

	public static void main(String[] args) {
	
		
		Customer[] c=new Customer[3]; //create array of customer object
		
		c[0]= new Customer(01 ,"Ankita", 895698088 , "Kolkata");
		c[1]= new Customer(02,"Ria", 898685689 ,"Mysore");
		c[2]= new Customer(03, "Bhoomi" , 878974758, "Raipur");
		
		for (int i=0;i<3;i++)
		{
			System.out.println("ID : "+c[i].getCid());
			System.out.println("NAME : " +c[i].getCname());
			System.out.println("NUMBER : "+c[i].getCnum());
			System.out.println("LOCATION : "+c[i].getCloc());
			System.out.println();
			
		}
		

	}

}
