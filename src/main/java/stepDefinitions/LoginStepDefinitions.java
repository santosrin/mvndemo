//package stepDefinitions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LoginStepDefinitions {
//    WebDriver driver;
//
//    @Given("^user is already on Login Page$")
//    public void user_is_already_on_Login_Page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.freecrm.com");
//
//    }
//
//    @When("^title of login page is free CRM$")
//    public void title_of_login_page_is_free_CRM() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title);
//
//    }
//
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//    }
//
//    @Then("^user clicks on login button$")
//    public void user_clicks_on_login_button() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//    }
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        String homeTitle = driver.getTitle();
//        Assert.assertEquals("Cogmento CRM",homeTitle);
//
//    }
//
//    @Then("^user moves to new contact page$")
//    public void user_moves_to_new_contact_page()  {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//    }
//
//    @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//    public void user_enters_contact_details(String firstname, String lastname, String position) {
//        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(position);
//    }
//
//    @Then("^close the browswer$")
//    public void close_the_browswer() {
//        driver.quit();
//    }
//}
