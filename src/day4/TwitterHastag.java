package day4;

public class TwitterHastag {

	public static void main(String[] args) {

		String tweet = "You dont have to be #crazy to #work here we will #train you";
		
		String[] arr = tweet.split(" ");
		for(String c : arr)
		{
		    if(c.startsWith("#"))
		          System.out.print(c.substring(1)+", ");
		}
		
	}

}
