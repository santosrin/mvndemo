//package stepDefinitions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class DealsStepDefinitions {
//
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
//        Thread.sleep(2000);
//
//    }
//
//    @Then("^user enters username and password$")
//    public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        List<List<String>> data = credentials.raw();
//        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
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
//        Thread.sleep(2000);
//
//    }
//
//    @Then("^user moves to new deal page$")
//    public void user_moves_to_new_deal_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//       //driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//        driver.findElement(By.cssSelector("div:nth-child(1) div.ui.fluid.container div.ui.left.fixed.vertical.icon.menu.sidebar-dark.expanded.left-to-right:nth-child(1) a.item:nth-child(5) > span.item-text")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//        Thread.sleep(5000);
//    }
//
//    @Then("^user enters deal details$")
//    public void user_enters_deal_details(DataTable dealData) throws Throwable {
//
//        List<List<String>> data = dealData.raw();
//        driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get(0).get(1));
//        driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data.get(0).get(2));
//        driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data.get(0).get(3));
//        driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//        Thread.sleep(5000);
//
//    }
//
//    @Then("^close the browswer$")
//    public void close_the_browswer() {
//        driver.quit();
//    }
//}
