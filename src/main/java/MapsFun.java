import java.util.HashMap;
import java.util.Map;

public class MapsFun {

	public static void main(String[] args) {

		Map<String,String>studentIds = new HashMap<String, String>();
		
		studentIds.put("123-45-6789", "J. Jones");
		String studentName = studentIds.get("123-45-6789");
		boolean ssnRegistered = studentIds.containsKey("123-45-6789");// checks using key
		boolean nameRegistered = studentIds.containsValue("J.Jones"); //checks using value
		studentIds.remove("123-45-6789"); //removes an entry
        boolean empty = studentIds.isEmpty(); //checks to see if the list is empty
        studentIds.clear();  // removes all entries
	}
	
	
}
