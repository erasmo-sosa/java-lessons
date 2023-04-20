package InterviewQuestions;

public class reverseString {

	private reverseString (String str) {
		
		String revStr = "";
		for(int i = str.length(); i >= 0 ; i -- )
			revStr = revStr + str.charAt(i);
		
	}
	public static void main(String[] args) {

	}
	
	/*String cnnURL = "cnn.com";
	String xpathstr = "//span[text()='Log In']";
	
	WebDriver chrBrowser = new chromeDriver();
	WebElement loginbtn = new WebElement();
	
	chrBrowser.navigate(cnnURL);
	loginbtn.findElement(FindBy.xpath(xpathstr));
	
	*/
}
