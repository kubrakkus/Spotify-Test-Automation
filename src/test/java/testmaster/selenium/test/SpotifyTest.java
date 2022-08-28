package testmaster.selenium.test;

import org.junit.jupiter.api.Test;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.pages.*;

public class SpotifyTest extends Driver {

    // TODO Cleaner method names and less gibberish class-more clean names(use more steps if necessary.)
    // TODO More loggers. Differ the project further from the source.
    // TODO Additionally separate Test classes
    // TODO Git Page.
    // TODO POM check
    // TODO Check BDD and Gauge, maybe apply if time allows.

    GuestPage guestPage;
    LoginPage loginPage;
    HomePage homePage;
    PlaylistPage playlistPage;
    SearchPage searchPage;

    @Test
    public void seleniumTestAutomation(){
        init();
        guestPage.clickLoginButton();
        loginPage.checkLogin("kubraakkus05@gmail.com","Szbmk000");


        playlistPage.changePlaylistName("Spotify Listem");

        playlistPage.clickSearchButton();

        searchPage.search("Daft Punk");

        searchPage.addSecondSongPlaylist();

        playlistPage.playSong("Instant Crush",10);

        playlistPage.removeSongFromPlaylist(3);

        playlistPage.removePlaylist();

    }

    public void init(){
        guestPage = new GuestPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        playlistPage = new PlaylistPage();
        searchPage = new SearchPage();
    }
}
