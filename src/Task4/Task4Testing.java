package Task4;

public class Task4Testing {
    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        FireFoxDriver firefox = new FireFoxDriver();
        SafariDriver safari = new SafariDriver();

        chrome.open();
        chrome.close();
        chrome.getTitle();
        chrome.navigate();

        firefox.open();
        firefox.close();
        firefox.getTitle();
        firefox.navigate();

        safari.open();
        safari.close();
        safari.getTitle();
        safari.navigate();
    }
}
