import java.util.Scanner;

public class Shop {
	public static void main(String args[]) 
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Role:- Customer or Owner?");
		String role=sc.nextLine();
		
		if(role.equalsIgnoreCase("Customer"))
		{
			System.out.println("Enter the item you want to buy : Cookies or Candy or IceCream? ");
			String item=sc.nextLine();
			System.out.println("Enter the quantity of the item you want to buy : ");
			int quantity=sc.nextInt();
			
			if(item.equalsIgnoreCase("Candy"))
			{
				Candy cd=new Candy(quantity);
				System.out.println("Your bill is : " +cd.getCost());
			}
			else if(item.equalsIgnoreCase("Cookies"))
			{
				Cookie ck=new Cookie(quantity);
				System.out.println("Your bill is : " +ck.getCost());
			}
			else if(item.equalsIgnoreCase("IceCream"))
			{
				IceCream ic=new IceCream(quantity);
				System.out.println("Your bill is : " +ic.getCost());
			}
		}
		if(role.equalsIgnoreCase("Owner"))
		{   
			System.out.println("Enter the quantity of the following items you want to store : ");
		       System.out.println("Cookies= ");
			   int quan1=sc.nextInt();
		       System.out.println("Candy= ");
			   int quan2=sc.nextInt();
		       System.out.println("IceCream= ");
			   int quan3=sc.nextInt();
			   
			   sc.close();
		       int Total_quantity = quan1+ quan2 + quan3;
			   System.out.println("The total items you stored in shop =" +Total_quantity );
			
		}
		}
}
