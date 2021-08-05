package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import utils.Logger;

public class OrderPageStepdefs {
    private final HomePageService homePageService = new HomePageService();

    @Given("start order page is open")
    public void start_order_page_is_open() {
        Logger.info("\tSTART PAGE IS OPEN THEN TEST");
        assert homePageService.isMainPageLinkVisible();
    }

    @Then("check tourist new order")
    public void check_tourist_new_order() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the tourist information button")
    public void click_the_tourist_information_button() {

        throw new io.cucumber.java.PendingException();
    }

    @When("fill all fields on the page: Surname={word}, Name={word}, NationalityId={word}, Birthday={word}, PassportSeria={word}, PassportNumber={word}, PassportExpirationDate={word}, Inn={word}, Phone={word}")
    public void fill_all_fields_on_the_page(String surname, String name, String nationalityId, String birthday, String passportSeria, String passportNumber, String passportExpirationDate, String inn, String phone) {
        Logger.info("\tFILL FIELDS:");
        Logger.info(surname + " | " + name + " | " + nationalityId + " | " + birthday + " | " + passportSeria + " | " + passportNumber + " | " + passportExpirationDate + " | " + inn + " | " + phone);

        throw new io.cucumber.java.PendingException();
    }

    @When("select radio button gender female")
    public void select_radio_button_gender_female() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the data validation button")
    public void click_the_data_validation_button() {

        throw new io.cucumber.java.PendingException();
    }

    @When("check surname and passport number")
    public void check_surname_and_passport_number() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the checkout button")
    public void click_the_checkout_button() {

        throw new io.cucumber.java.PendingException();
    }

    @When("the form for choosing the type of purchase has opened")
    public void the_form_for_choosing_the_type_of_purchase_has_opened() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the continue button without registration")
    public void click_the_continue_button_without_registration() {

        throw new io.cucumber.java.PendingException();
    }

    @When("fill all fields on the page: Surname={word}, Name={word}, MName={word}, Birthday={word}, PassportSeria={word}, PassportNumber={word}, PassportExpirationDate={word}, nationalityId={word} , Phone={word}, Email={word}")
    public void fill_all_fields_on_the_page(String surname, String name, String mName, String birthday, String passportSeria,  String passportNumber, String passportExpirationDate, String nationalityId, String phone, String email) {
        Logger.info("\tFILL FIELDS:");
        Logger.info(surname + " | " + name + " | " + mName + " | " + birthday + " | " + passportSeria + " | " + passportNumber + " | " + passportExpirationDate + " | " + nationalityId + " | " + phone + " | " + email);

        throw new io.cucumber.java.PendingException();
    }

    @When("select the checkbox I agree with the terms of the agreement")
    public void select_the_checkbox_i_agree_with_the_terms_of_the_agreement() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the pay button")
    public void click_the_pay_button() {

        throw new io.cucumber.java.PendingException();
    }
}
