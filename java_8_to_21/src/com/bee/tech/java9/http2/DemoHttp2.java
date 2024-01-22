package com.bee.tech.java9.http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DemoHttp2 {
	public static void main(String[] args) {
		
		try {
			
			HttpClient client = HttpClient.newHttpClient();
			String url = "https://openjdk.org/jeps/110";
			
			
			HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
			
			HttpResponse<?> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("Status code is: " + httpResponse.statusCode());
			
			httpResponse.headers().map().forEach((key, value) -> System.out.println("key is: " + key + " :: " + value));
			
			System.out.println(httpResponse.body());
			
			client.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
		    .thenApply(HttpResponse::body)
		     .thenAccept(System.out::println)
		     .join();
			
		} catch (URISyntaxException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
