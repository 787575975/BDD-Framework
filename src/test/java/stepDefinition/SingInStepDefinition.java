package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SingInStepDefinition {
    WebDriver driver;


    @Given("^user is already on the signin page$")
    public void user_is_already_on_the_signin_page (){
        System.setProperty("webdriver.chrome.driver","/Users/dola/IdeaProjects/BDDFRAMEWORK/Path/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://shop.lululemon.com/");
    }



    @When("^title of signin page is Lulu$")
    public void title_of_signin_page_is_Lulu(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Yoga clothes + running gear | lululemon athletica", title);

    }
    @Then ("^user clicks on signIn$")
    public void user_clicks_on_signIn(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[2]/ul/li[1]/a/p")).click();
    }

    @Then ("^user enters email and password$")
    public void user_enters_email_and_password(){
        driver.findElement(By.name("email")).sendKeys("zekyotumlu@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("Hotmail12345");

    }

    @Then("^user clicks signin button$")
    public void user_clicks_signin_button(){
        driver.findElement(By.cssSelector("#signin-submit")).click();
    }
    @Then("^user is in My account page$")
    public void user_is_in_My_account_page() {
        String myAccountTitile = driver.getTitle();
        System.out.println("My account | lululemon athletica"+       myAccountTitile);
        Assert.assertEquals("My account | lululemon athletica", myAccountTitile);
    }



    }



