package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps {
	static WebDriver driver;

	@Given("user should be in the telecom home page to add tariff")
	public void user_should_be_in_the_telecom_home_page_to_add_tariff() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\javaprogs\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click on add customer button to enter the datas")
	public void user_click_on_add_customer_button_to_enter_the_datas() {
		
		driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();
	}

	@When("user enters all the fields with valid data to click submit.")
	public void user_enters_all_the_fields_with_valid_data_to_click_submit() {
		
		driver.findElement(By.id("rental1")).sendKeys("3000");
		driver.findElement(By.id("local_minutes")).sendKeys("1000");
		driver.findElement(By.id("inter_minutes")).sendKeys("500");
		driver.findElement(By.id("sms_pack")).sendKeys("200");
		driver.findElement(By.id("minutes_charges")).sendKeys("10");
		driver.findElement(By.id("inter_charges")).sendKeys("20");
		driver.findElement(By.id("sms_charges")).sendKeys("20");

	}

	@When("user enters all the fields with valid data to click submit")
	public void user_enters_all_the_fields_with_valid_data_to_click_submit(DataTable tariff) {
		
		List<String> datas = tariff.asList(String.class);

		driver.findElement(By.id("rental1")).sendKeys(datas.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));

	}

	@When("user enter all the fields with valid data to click submit")
	public void user_enter_all_the_fields_with_valid_data_to_click_submit(DataTable tariff2) {
		
		Map<String, String> datas = tariff2.asMap(String.class, String.class);

		driver.findElement(By.id("rental1")).sendKeys(datas.get("field1"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get("field2"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get("field3"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get("field4"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get("field5"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get("field6"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get("field7"));

	}

	@When("user clicks on submit button to get successful message")
	public void user_clicks_on_submit_button_to_get_successful_message() {
		
		driver.findElement(By.name("submit")).click();
	}

	@Then("user should be displayed successful message")
	public void user_should_be_displayed_successful_message() {
		
		WebElement success = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));

		Assert.assertTrue(success.isDisplayed());

	}



}
