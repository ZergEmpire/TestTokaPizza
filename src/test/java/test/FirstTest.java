package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class FirstTest extends TestBase {

    @Test
    public void ScenarioForTestSendOrder() {


        main
                .goTo();
               /* .SelectCity()*/
        taskThreeTestSecondarySS.GoMainPage();
        taskSecondSendAnOrder
                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .FillInFields()
                .selectPayType()
                .SendOrder()
                .CheckStatusOrder();

    }
   /* @Feature("CheckDeliveryPage")
    @Severity(SeverityLevel.MINOR)
    @Description("In this test we will check Secondary Site Sections")
    @Story("Scenario For Test Of Secondary Site Sections")
    @Test
    public void ScenarioForTesOfSecondarySiteSections() {
        main
                .goTo();
                *//*.SelectCity()*//*
        taskThreeTestSecondarySS.GoMainPage();
        taskThreeTestSecondarySS.ScrollToFooterMainPage()
                .CheckElementsInFooterSection()
                .GoToDeliverySiteSections()
                .GoMainPage()
                .ScrollToFooterMainPage()
                .GoToAboutSiteSections()
                .GoToContact()
                .GoToPartner()
                .GoMainPage()
                .GoToRulesPayInfo()
                .GoMainPage();
    }*/

}
