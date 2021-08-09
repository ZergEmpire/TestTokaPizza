package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;


public class SecondTest extends TestBase {


    @Test
    public void ScenarioForTesOfSecondarySiteSections() {
        main
                .goTo();
                /*.SelectCity()*/
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
    }
}