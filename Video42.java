package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video42 {
	public static void main(String[] args) {
		System.out.println("Run video 42");
		Pattern pattern = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
	    Matcher matcher = pattern.matcher("chauunhatduyyit@gmail.com");
	    System.out.println("Input String matches regex - "+matcher.matches());
	}
}
