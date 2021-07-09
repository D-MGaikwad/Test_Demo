
public class IceCream extends DessertItem{
	int quantity;
	public IceCream(int q) 
        {
		quantity=q;
	}
     public float getCost() 
    {
    	 float cost=quantity*20f;
    	 
    	 float tax=(3f/100f)*cost;
    	 
    	 float total_cost=cost+tax;
    	 return total_cost;
     }

}
