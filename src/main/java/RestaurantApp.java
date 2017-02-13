
import java.util.Maps;
import java.util.Set;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashMaps;
import java.util.Map;

public class RestaurantApp {

	public static void main(String[] args) {
		double bill = 79.35;
		double tax = bill * .07;
		cashRegister register = new cashRegister(23.00);
		register.addMoney(bill + tax);
		register.removeMoney(12.75);
		double balance = register.getBalance();
		System.out.println(balance);
		//String[]options = new String [3];
		/* options[0] = "filet";
		options[1] = "escargot";
		options[2] = "tacos";
	
		for(int i = 0; i < options.length; i++)
		{
			System.out.println(options[i]);
		}
        List <String> options1 = new ArrayList<String>();
        options1.add("Filet");
        options1.add("Escargot");
        options1.add("Tacos");
        //for(String menuOptions : options1){
	    //System.out.println(menuOptions);
	    for(int index = 0; index < options1.size(); index++) {
		System.out.println(options1.get(index));  */
	  
	Map<String,BigDecimal>prices = new HashMap<String, BigDecimal>();
	prices.put("Spaghetti", new BigDecimal("8.97"));
	prices.put("Lasagna", new BigDecimal("10.98"));
	prices.put( "Pizza", new BigDecimal("15.50"));
	prices.put("Ceasar Salad", new BigDecimal("7.00"));
	prices.put("Kale Salad", new  BigDecimal("7.00"));
	Set<String> entries = prices.keySet();
	System.out.println(prices.keySet());
	
	//prices.clear();
	//boolean empty = prices.isEmpty();
	//int entries = prices.size();
	//System.out.println(empty);
	BigDecimal menuItems = prices.get("Spaghetti");

   //System.out.println("Spaghetti price is " + menuItems );	printing out price of spaghetti
	//int entries = prices.size();
	//System.out.println(entries); number of menu items
	
	prices.put("Champagne", new BigDecimal("200.00"));
	prices.put("Vintage Wine", new BigDecimal("175.00"));
	//boolean findChampagne = prices.containsKey("Champagne");
	//if(findChampagne) {
		System.out.println("Yes, we have champagne!");
	//} 
	//boolean findPrice = prices.containsValue("15.50");
	//if(findPrice) { 
		//System.out.println("The item is $15.50");
	//}
	
	prices.remove("Kale Salad");
	boolean onMenu = prices.containsKey("Kale Salad");
	System.out.println(onMenu);
	

}
}