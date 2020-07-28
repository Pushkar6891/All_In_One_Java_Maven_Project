package eg01015;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StringToJson {

	public static void main(String[] args) {

		StringToJson obj = new StringToJson();
		obj.convertStringToJsonUsingJsonParser();
		obj.convertStringToJsonUsingFromJson();
	}

	public void convertStringToJsonUsingJsonParser() {
		String json = "{ \"name\": \"Baeldung\", \"java\": true }";
		JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
		System.out.println(jsonObject instanceof JsonObject);
	}

	public void convertStringToJsonUsingFromJson() {
		String json = "{ \"name\": \"Baeldung\", \"java\": true }";
		JsonObject convertedObject = new Gson().fromJson(json, JsonObject.class);
		System.out.println(convertedObject instanceof JsonObject);
	}

}
