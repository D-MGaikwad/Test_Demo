
public class Cookie extends DessertItem{
	int quantity;
	public Cookie(int q) 
        {
		quantity=q;
	}
     public float getCost() 
    {
    	 float cost=quantity*15f*70f;
    	 
    	 float tax=(2f/100f)*cost;
    	 
    	 float total_cost=cost+tax;
    	 return total_cost;
     }

}
