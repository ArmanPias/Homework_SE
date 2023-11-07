package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass{
	@Test
 public void clickFinfOutMoreTest() throws InterruptedException {
		homePage.clickFindOutMore();
	}

}
