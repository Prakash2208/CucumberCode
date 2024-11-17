package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact extends PropertyClass {
	
	WebDriver drive;
	
	WebElement email;
	
	WebElement name;
	
	WebElement message;
	
	@Given("Launch the Browser and open the Url")
	public void launch_the_browser_and_open_the_url() throws IOException {
	   
		WebDriverManager.chromedriver().setup();
		
		 drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		
		 String propetyfetch = propetyfetch();
		 
		 drive.get(propetyfetch);
	}

	@When("Need to Locate Contact Menu, Name with number and message fields to send")
	public void need_to_get_locate_name_with_number_and_message_fields_to_send() {
		
		
	 drive.findElement(By.xpath("//a[text()='Contact']")).click();
	 
	 
		 email = drive.findElement(By.cssSelector("#recipient-email"));
		
		 name = drive.findElement(By.cssSelector("#recipient-name"));
		
		 message = drive.findElement(By.cssSelector("#message-text"));
	   
		
	}

	@When("In the Contact Mail Field  type {string}")
	public void in_the_contact_mail_field_type(String string) throws InterruptedException {
		
		Thread.sleep(1000);
	    
		email.sendKeys(string);
	}

	@When("In the Contact Number Field  type {string}")
	public void in_the_contact_number_field_type(String string) throws InterruptedException {
		
		
		name.sendKeys(string);
	}

	@When("In the Message Filed type the message to send")
	public void in_the_message_filed_type_the_message_to_send() {
	   
		message.sendKeys("Thanks for the Feedback");
	}

	@When("Click the Send Message Button to send the message")
	public void click_the_send_message_button_to_send_the_message() {
	    
		drive.findElement(By.xpath("//button[@onclick='send()']")).click();
	}

	@Then("Message is sent successfully and the alert is closed")
	public void message_is_sent_successfully_and_the_alert_is_closed() throws InterruptedException {
	    
       Thread.sleep(1000);
	    
	    Alert alert= drive.switchTo().alert();
	    
	    alert.accept();
	    
	    drive.close();
	}
	
	

}
