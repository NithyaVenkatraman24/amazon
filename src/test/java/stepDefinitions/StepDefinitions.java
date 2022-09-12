package stepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.MediaSize.Other;
import javax.security.auth.login.LoginContext;
import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.driverfactory.DriverFactory;
import com.pages.AccountSummaryPage;
import com.pages.ClientContactDetailsPage;
import com.pages.ClientDetailsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OthersPage;
import com.pages.SiteDtailsPage;
import com.utility.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	public LoginPage loginPage = new LoginPage();
	public AccountSummaryPage accountsummary = new AccountSummaryPage();
	public ClientContactDetailsPage clientcontact = new ClientContactDetailsPage();
	public HomePage homepage = new HomePage();
	public OthersPage other = new OthersPage();
	public SiteDtailsPage sitedetails = new SiteDtailsPage();
	public ClientDetailsPage clientdetails = new ClientDetailsPage();

	
	
	public String title;

	@Given("Im on the dynamics.com page")
	public void im_on_the_dynamics_com_page() throws InterruptedException {
		DriverFactory.getdriver().get("https://lifetimetraininggroupinttest.crm11.dynamics.com/");
		Thread.sleep(50000);
	}

	@Given("I click on client button")
	public void i_click_on_client_button() throws InterruptedException {
		BaseMethods.click((loginPage.getClientbutton()));
		Thread.sleep(2000);

	}

	@Then("I get existing records and new record creation page")
	public void i_get_existing_records_and_new_record_creation_page() {
		System.out.println("The Exixting and new record creation page is displayed successfully");
	}

	@When("I Click on +New button")
	public void i_click_on_new_button() throws InterruptedException {
		BaseMethods.click(loginPage.getNewrecord());
		Thread.sleep(2000);
	}

	@Then("I get creation of new client form")
	public void i_get_creation_of_new_client_form() throws InterruptedException {
		System.out.println("New record creation page dispalyed successfully");
		Thread.sleep(5000);
	}
	
	@When("I click on the Client Name filed and send values")
	public void i_click_on_the_client_name_filed_and_send_values() throws InterruptedException {
		BaseMethods.click(loginPage.getClientName());
		loginPage.getClientName().sendKeys("Client - KFC - Bristol");
		Thread.sleep(3000);
	}
	

	@When("I click on the Client Size")
	public void i_click_on_the_client_size() throws InterruptedException {
	BaseMethods.click(loginPage.getClientSize());
	
	
	}

	@Then("I select the Value from the drop down list")
	public void i_select_the_value_from_the_drop_down_list1() throws InterruptedException {
		Select selectall = new Select(loginPage.getClientSize());
		selectall.selectByVisibleText("Large<1000");
		Thread.sleep(3000);
	}

	@When("I click on the Client Ownership field")
	public void i_click_on_the_client_ownership_field() {
		BaseMethods.click(loginPage.getClientOwnership());
	}

	@Then("I select the value from the drop drown list")
	public void i_select_the_value_from_the_drop_drown_list() throws InterruptedException {
		Select selectall = new Select(loginPage.getClientOwnership());
		selectall.selectByVisibleText("Public");
		Thread.sleep(3000);
	}

	@When("I click on the Client Type")
	public void i_click_on_the_client_type() {
	    BaseMethods.click(loginPage.getClientType());
	}

	@Then("I search for client type result")
	public void i_search_for_client_type_result() throws InterruptedException {
	    loginPage.getClientType().sendKeys("restarunt");
	    Thread.sleep(5000);
	}

	@When("I click on TA or Contact? field")
	public void i_click_on_ta_or_contact_field() {
		JavascriptExecutor jk=(JavascriptExecutor)DriverFactory.getdriver();
		jk.executeScript("arguments[0].scrollIntoView(true);", loginPage.getTAContract());
	    BaseMethods.click(loginPage.getTAContract());
	}

	@Then("I select the value from the drop down list")
	public void i_select_the_value_from_the_drop_down_list11() {
		Select selectall = new Select(loginPage.getTAContract());
		selectall.selectByVisibleText("Training Agreement");
	}
	@When("I click on Sector field")
	public void i_click_on_sector_field() {
	    BaseMethods.click(loginPage.getSector());
	}

	@Then("I search for the sector result")
	public void i_search_for_the_sector_result() throws InterruptedException {
	    loginPage.getSector().sendKeys("Hospitality");
	    Thread.sleep(5000);
	}

	@When("I click on Office Type")
	public void i_click_on_office_type() {
		BaseMethods.click(loginPage.getOfficeType());
	}

	@Then("I Select the value from the drop down list")
	public void i_select_the_value_from_the_drop_down_list() throws InterruptedException {
		Select selectall = new Select(loginPage.getOfficeType());
		selectall.selectByVisibleText("Site");
		Thread.sleep(200);

	}

	@Then("I navigate to Client Details page")
	public void i_navigate_to_client_details_page() throws InterruptedException {
	    BaseMethods.click(loginPage.getClientDetails());
	    Thread.sleep(1000);
	}

	@Then("I click on Levy Paying field")
	public void i_click_on_levy_paying_field() {
	    BaseMethods.click(loginPage.getLevyPaying());
	}

	@Then("I select value from the drop down list")
	public void i_select_value_from_the_drop_down_list() throws InterruptedException {
		Select selectall = new Select(loginPage.getLevyPaying());
		selectall.selectByVisibleText("Levy");
		Thread.sleep(200);
	}

	@When("I click on The Apprenticeship Service status field")
	public void i_click_on_the_apprenticeship_service_status_field() throws InterruptedException {
	BaseMethods.click(loginPage.getTheApprenticeshipServiceStatus());
	Select selectall = new Select(loginPage.getTheApprenticeshipServiceStatus());
	selectall.selectByVisibleText("On TAS");
	Thread.sleep(200);
	}

	@When("I click on the TAS Name")
	public void i_click_on_the_tas_name() throws InterruptedException {
		BaseMethods.click(loginPage.getTasName());
	}

	@Then("I send value to TAS Name field")
	public void i_send_value_to_tas_name_field() {
	    loginPage.getTasName().sendKeys("Testing");
	}
	
	@When("I click on the TAS Agreement ID field")
	public void i_click_on_the_tas_agreement_id_field() {
		BaseMethods.click(loginPage.getTasAgreementId());
	}

	@Then("I send value to TAS Agreement ID field")
	public void i_send_value_to_tas_agreement_id_field() {
		loginPage.getTasAgreementId().sendKeys("999999");
	}

	@Then("I navigate to Site Details page")
	public void i_navigate_to_site_details_page() throws InterruptedException {
	    try {
			BaseMethods.click(loginPage.getSiteDetails());
		} catch (Exception e) {
			e.printStackTrace();
		}
	    Thread.sleep(200);
	}

	@When("I click on Employer ID\\(ERN) field")
	public void i_click_on_employer_id_ern_field() {
		BaseMethods.click(loginPage.getEmployerId());
	}

	@Then("I send value to Employer ID\\(ERN) field")
	public void i_send_value_to_employer_id_ern_field() {
		loginPage.getEmployerId().sendKeys("254871");
	}

	@When("I click Status Reason field")
	public void i_click_status_reason_field() throws InterruptedException {
		BaseMethods.click(loginPage.getStatusReason());
		Thread.sleep(500);
		
	}

	@Then("I navigate to Client Contact Details page")
	public void i_navigate_to_client_contact_details_page() throws InterruptedException {
	   BaseMethods.click(loginPage.getClientContactDetails());
	   Thread.sleep(590);
	}

	@When("I click on Street {int} field")
	public void i_click_on_street_field(Integer int1) {
	  loginPage.getStreet1().sendKeys("Lifetime");
	  loginPage.getStreet2().sendKeys("Training");
	  loginPage.getStreet3().sendKeys("Office");
	}

	@Then("I pass the value and click on enter button")
	public void i_pass_the_value_and_click_on_enter_button() {
		  loginPage.getCity().sendKeys("Bristol");
	}

	@Then("Check for all remaining address fields are filled with values")
	public void check_for_all_remaining_address_fields_are_filled_with_values() {
	    loginPage.getPostalCode().sendKeys("BS8 1EJ");
	}

	@Then("I navigate to Other page")
	public void i_navigate_to_other_page() {
	    BaseMethods.click(loginPage.getOthers());
	}

	@When("I click on Price List field")
	public void i_click_on_price_list_field() {
	  BaseMethods.click(loginPage.getPriceList());
	}

	@Then("I select value from the drop down")
	public void i_select_value_from_the_drop_down() {
	   System.out.println("The Price list is dispalyed");
	}

	@Then("I click on the Save button from the header tag.")
	public void i_click_on_the_save_button_from_the_header_tag() {
	   BaseMethods.click(loginPage.getSave());
	}
}


