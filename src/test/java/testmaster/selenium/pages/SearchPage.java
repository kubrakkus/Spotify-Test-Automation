package testmaster.selenium.pages;

import org.openqa.selenium.By;
import org.w3c.dom.ranges.Range;
import testmaster.selenium.methods.Methods;
import testmaster.selenium.pages.base.BasePage;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchPage extends BasePage {


    public void search(String searchStr) {

        By searchTextBox = By.xpath("//input[@data-testid='search-input']");

        Methods methods = null;
        assertTrue(methods.isElementVisible(searchTextBox, 10));

        methods.sendKeys(searchTextBox, searchStr);

    }

    public void addSecondSongPlaylist() {

        By songsChip = By.xpath("//span[@class='ChipInner-sc-1ly6j4j-0 dLSEQM' and text()='Songs']");

        Methods methods;

        for (int i = 2; i < 5; i++) {  // Song list index starts at 2.

            String selectedSongStr = "//div[@class='JUa6JJNj7R_Y3i4P8YUX' and @role='presentation']//div[@aria-rowindex=" + i + "]";

            By selectedSong = By.xpath(selectedSongStr);

            By selectedSongMoreButton = By.xpath(selectedSongStr + "//button[@data-testid='more-button']");

            String moreButtonMenuItems = "//button[@class='wC9sIed7pfp47wZbmU6m']//span[text()=";

            By addToPlaylistMenuItem = By.xpath(moreButtonMenuItems + "'Add to playlist']");

            By myPlaylistMenuItem = By.xpath(moreButtonMenuItems + "'Spotify Listem']");

        }
    }
}
