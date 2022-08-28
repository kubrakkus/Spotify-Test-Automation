package testmaster.selenium.pages;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class GuestPage {

    Methods methods;

    public GuestPage() {

        methods = new Methods();
    }

    public void clickLoginButton() {

        By loginButton = By.cssSelector("button[data-testid=\"login-button\"]");
        assertTrue(methods.isElementClickable(loginButton, 10));
        methods.clickElement(loginButton);
    }
}
