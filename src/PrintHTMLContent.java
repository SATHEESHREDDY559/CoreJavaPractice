import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Satheesh
 
 * PrintHTMLContent.java
 *
 */
public class PrintHTMLContent {

	// to print the content of HTML Tag
	void printContentOfHtmlTag(String input) {		
		int LastTagIndex = -1;		
		String LastTag = null;
		// A Regular expression pattern matching to recognize valid tag
		String regex = "(<[^>]*>)";

		// A regular expression converted into instance of a Pattern class
		Pattern regexPattern = Pattern.compile(regex);

		// returns new sequeMatchObj if the sequence char matched
		Matcher sequeMatchObj = regexPattern.matcher(input);
		boolean isFind = false;
		while (sequeMatchObj.find()) {// find subsequence of the html tag that matches the pattern. 
			String htmlTag = input.substring(sequeMatchObj.start(), sequeMatchObj.end());// finds start tag and end tag
			
			if (htmlTag.charAt(1) != '/') {
				LastTag = htmlTag;
				LastTagIndex = sequeMatchObj.end();
			} 
			else if (htmlTag.charAt(1) == '/' && LastTag != null) {
				
				if (LastTag.substring(1).equals(htmlTag.substring(2)) && LastTag.length() > 2
						&& sequeMatchObj.start() > LastTagIndex + 1) {
					String content=input.substring(LastTagIndex, sequeMatchObj.start());
					System.out.println(""+content);
					isFind = true;
				}
				
				LastTag = null;
			}
		}

		if (isFind)
			System.out.print("");
		else
			System.out.println("invalid input");

	}

	public static void main(String[] args) {
		System.out.println("Enter input Tags with content \n");
		// it connect to console
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		PrintHTMLContent printHTMLContent = new PrintHTMLContent();// PrintHTMLContent Object creation
		printHTMLContent.printContentOfHtmlTag(input);// calls printContentOfHtmlTag
		scanner.close();
	}
}