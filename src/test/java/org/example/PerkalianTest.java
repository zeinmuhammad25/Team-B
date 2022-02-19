package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerkalianTest {

    @Test
    public void perkalianTest1(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");

    }


}
