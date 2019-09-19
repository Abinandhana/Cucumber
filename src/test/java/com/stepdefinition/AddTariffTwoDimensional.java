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

public class AddTariffTwoDimensional {

	static WebDriver driver;

	@Given("Uuser should be in the telecom home page to add tariff")
	public void Uuser_should_be_in_the_telecom_home_page_to_add_tariff() {

		System.setProperty("webdriver.chrome.driver", "D:\\javaprogs\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("Uuser click on add customer button to enter the datas")
	public void Uuser_click_on_add_customer_button_to_enter_the_datas() {

		driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();
	}

	@When("Uuser enters all the fields with valid data to click submit.")
	public void Uuser_enters_all_the_fields_with_valid_data_to_click_submit() {

		driver.findElement(By.id("rental1")).sendKeys("3000");
		driver.findElement(By.id("local_minutes")).sendKeys("1000");
		driver.findElement(By.id("inter_minutes")).sendKeys("500");
		driver.findElement(By.id("sms_pack")).sendKeys("200");
		driver.findElement(By.id("minutes_charges")).sendKeys("10");
		driver.findElement(By.id("inter_charges")).sendKeys("20");
		driver.findElement(By.id("sms_charges")).sendKeys("20");

	}

	@When("Uusers Should enters all the  fields with valid data to click submit  submit.")
	public void Uusers_Should_enters_all_the_fields_with_valid_data_to_click_submit_submit(DataTable tariff) {

		List<List<String>> datas = tariff.asLists(String.class);

		driver.findElement(By.id("rental1")).sendKeys(datas.get(0).get(1));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(2).get(3));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get(0));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(2).get(0));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get(2));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(0).get(2));

	}

	@When("Uuserss Shouldd  enter all the  fields with valid data to click click  submit.")
	public void Uuserss_Shouldd_enter_all_the_fields_with_valid_data_to_click_click_submit(DataTable tariff2) {
		List<Map<String, String>> datas = tariff2.asMaps(String.class, String.class);

		driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get("MonthlyRent"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(2).get("LM"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(0).get("IM"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3).get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get("IC"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(2).get("LC"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get("SC"));

	}

	@When("Uuserss Shouldd  enter all the  fields with valid data to click click  submit.{string},{string},{string},{string},{string},{string},{string}")
	public void uuserss_Shouldd_enter_all_the_fields_with_valid_data_to_click_click_submit(String MonthlyRent,
			String LM, String IM, String SMS, String LC, String IC, String SC) {
		driver.findElement(By.id("rental1")).sendKeys(MonthlyRent);
		driver.findElement(By.id("local_minutes")).sendKeys(LM);
		driver.findElement(By.id("inter_minutes")).sendKeys(IM);
		driver.findElement(By.id("sms_pack")).sendKeys(SMS);
		driver.findElement(By.id("minutes_charges")).sendKeys(IC);
		driver.findElement(By.id("inter_charges")).sendKeys(LC);
		driver.findElement(By.id("sms_charges")).sendKeys(SC);


		
	}

	@When("Uuser clicks on submit button to get successful message")
	public void Uuser_clicks_on_submit_button_to_get_successful_message() {

		driver.findElement(By.name("submit")).click();
	}

	@Then("Uuser should be displayed successful message")
	public void Uuser_should_be_displayed_successful_message() {

		WebElement success = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));

		Assert.assertTrue(success.isDisplayed());

	}

}
