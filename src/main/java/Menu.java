import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Menu {

	Map<String, BigDecimal> items = new HashMap<String, BigDecimal>();

	public void addItem(String name, String price) {
		items.put(name, new BigDecimal(price));
	}
	public void removeItem(String name, String price) {
	items.remove(name, new BigDecimal(price));
	
	System.out.println(items);
}
}
