package actions;

import io.cucumber.java.en.*;

public class BlazeDemo_login {


	@Given("^User is on Login Page$")
	public void user_is_on_login_page() {
		System.out.println("User is on Login Page");
	}

	@Then("^login pane should have email address text field$")
	public void login_pane_should_have_email_address_text_field() {
		System.out.println("Email Address text field available on login pane");
	}

	@Then("^login pane should have password text field$")
	public void login_pane_should_have_password_text_field() {
		System.out.println("Password text field is available on login pane");
	}

	@Then("^login pane should have remember me check box$")
	public void login_pane_should_have_remember_me_check_box() {
		System.out.println("Remember me check box available on login pane");
	}

	@Then("^login pane should have Forgot your password hyperlink$")
	public void login_pane_should_have_forgot_your_password_hyperlink() {
		System.out.println("Forgot your password hyperlink is available on login pane");
	}

	@Then("^login page should have Login button$")
	public void login_page_should_have_login_button() {
		System.out.println("Login button is available on login pane");
	}

}
