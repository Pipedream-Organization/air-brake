package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MemeStepDef {
    @Given("I load the Meme Page")
    public void i_load_the_meme_page() {
        WebDriver driver;
        System.setProperty("webdrive.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://imgflip.com/memegenerator");
        driver.findElement(By.xpath("//*[@id=\"mm-settings\"]")).sendKeys("");
    }
    @When("I Enter the text field1")
    public void i_load_the_meme_page() {

    }
    }

