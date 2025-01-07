package study.quiz.quiz13;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz13 {
	
	public static String orderInfo() {
		
		String str = "{"
	            + "\"id\": 1,"
	            + "\"name\": \"John Doe\","
	            + "\"contacts\": ["
	            + "{"
	            + "\"type\": \"email\","
	            + "\"value\": \"john.doe@example.com\""
	            + "},"
	            + "{"
	            + "\"type\": \"phone\","
	            + "\"value\": \"01023456789\""
	            + "}"
	            + "],"
	            + "\"address\": {"
	            + "\"street\": \"123 Main Street\","
	            + "\"city\": \"Seoul\","
	            + "\"zipcode\": \"12345\""
	            + "},"
	            + "\"orders\": ["
	            + "{"
	            + "\"orderId\": \"ORD-001\","
	            + "\"date\": \"2024-07-09\","
	            + "\"items\": ["
	            + "{"
	            + "\"id\": 1,"
	            + "\"name\": \"Smartphone\","
	            + "\"quantity\": 2"
	            + "},"
	            + "{"
	            + "\"id\": 2,"
	            + "\"name\": \"Laptop\","
	            + "\"quantity\": 1"
	            + "}"
	            + "]"
	            + "},"
	            + "{"
	            + "\"orderId\": \"ORD-002\","
	            + "\"date\": \"2024-07-10\","
	            + "\"items\": ["
	            + "{"
	            + "\"id\": 3,"
	            + "\"name\": \"Headphones\","
	            + "\"quantity\": 1"
	            + "}"
	            + "]"
	            + "}"
	            + "]"
	            + "}";
		
		return str;
	}
	
	
	
	public static void jtc() throws ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonText = (JSONObject)jsonParser.parse(orderInfo());
		System.out.println(jsonText);
		JSONArray contacts = (JSONArray)jsonText.get("contacts");
		System.out.println(contacts);
		JSONObject contact = (JSONObject)contacts.get(0);
		System.out.println(contact);
		JSONObject address = (JSONObject)jsonText.get("address");
		System.out.println(address);
		JSONArray orders = (JSONArray)jsonText.get("orders");
		System.out.println(orders);
//		JSONObject order = (JSONObject)orders.get(0);
//		System.out.println(order);
		
		System.out.println();
		
		for(int i=0; i<orders.size(); i++) {
			JSONObject order = (JSONObject)orders.get(i);
			System.out.println(order.get("orderId"));
			System.out.println(order.get("date"));
			JSONArray items = (JSONArray)order.get("items");
			for(int j=0; j<items.size(); j++) {
				JSONObject item = (JSONObject)items.get(j);
				System.out.println(item.get("id"));
				System.out.println(item.get("name"));
				System.out.println(item.get("quantity"));
			}
			System.out.println();
		}
	}
	
}
