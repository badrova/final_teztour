package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.OldSiteService;
import services.OrderPageService;
import utils.Constants;
import utils.DelayUtil;
import utils.Logger;

import static com.codeborne.selenide.Selenide.open;

public class OrderPageStepdefs {
    private final OldSiteService oldSiteService = new OldSiteService();

    private final OrderPageService orderPageService = new OrderPageService();

    @Given("start order page is open")
    public void start_order_page_is_open() {
        Logger.info("\tSTART PAGE IS OPEN THEN TEST");
        open(orderPageService.getHomeAddress());
    }

    @Then("go to tourist information")
    public void click_the_tourist_information_button() {
        oldSiteService.selectTheTourPrice();
        DelayUtil.delay(Constants.ONE_SECOND * Constants.BUY_TOUR_DELAY_SECONDS);
        oldSiteService.switchToBuyOnlineFrame();
        assert oldSiteService.isBuyOnlineTourLinkVisible();
        oldSiteService.buyTour();
        orderPageService.switchToSecondTab();
        DelayUtil.delay(Constants.ONE_SECOND * Constants.TOURIST_INFO_DELAY_SECONDS,
                orderPageService::isInfoAboutTouristReady);
        orderPageService.goToInfoAboutTourist();
    }

    @Then("fill all fields on the page: Surname={word}, Name={word}, NationalityId={word}, Birthday={word}, IsFemale={word}, IsMale={word}, PassportSeria={word}, PassportNumber={word}, PassportExpirationDate={word}, Inn={word}, Phone={word}")
    public void fill_all_fields_on_the_page(String surname, String name, String nationalityId, String birthday, String isFemale, String isMale, String passportSeria, String passportNumber, String passportExpirationDate, String inn, String phone) {
        orderPageService.fillInfoAboutTourist(0, surname, name, nationalityId, birthday, isFemale, isMale, passportSeria, passportNumber, passportExpirationDate, inn, phone);
    }

    @Then("click the data validation button")
    public void click_the_data_validation_button() {
        assert !orderPageService.isPassportsDivVisible();
        orderPageService.checkData();
    }

    @Then("check validation success")
    public void check_validation_success() {
        assert orderPageService.isPassportsDivVisible();
        orderPageService.switchToFirstTab();
    }
}
