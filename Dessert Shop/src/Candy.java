
public class Candy extends DessertItem{
	int quantity;
	public Candy(int q) 
        {
		quantity=q;
	}
     public float getCost() 
       {
    	 float cost=quantity*5f*60f;

    	 float tax=(5f/100f)*cost;
    	 
    	 float total_cost=cost+tax;
    	 return total_cost;
       }
     
}