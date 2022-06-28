public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swati\\Downloads\\Collect_Bingo\\Collect_Bingo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);

//        Eyes eyes = new Eyes();
//        eyes.setApiKey("JFaPIqxEGizqlPZOKazkCEpKGGHMbjCb234YWEorics110");
//        eyes.open(driver,"Dummy Site","Test case1");
//        eyes.checkWindow();
//        eyes.close();
    }
}
