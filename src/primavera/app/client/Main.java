package primavera.app.client;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		ApiServiceClient asc = new ApiServiceClient();
		
		System.out.println(asc.createUser("Pablo", "Natal/RN").getBody());
		
		System.out.println(asc.getUser("-8350938452394660412").getBody());
	}
}
