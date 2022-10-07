

public class test {

	public static void main(String args[]) 
	{
		String simpleJson = "{\n" + "	\"name\":\"Person1\"," + "	\"available\":\"13:00\" " + "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(simpleJson.getBytes());

		String name = jsonNode.get("name").textValue();

		System.out.println("Name: " + name);
		System.out.println("Available: " + jsonNode.get("available").textValue());
	}
}
