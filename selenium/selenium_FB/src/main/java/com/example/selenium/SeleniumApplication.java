package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumApplication {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // STEP 2: Maximise the window
        driver.manage().window().maximize();

        // STEP 3: Navigate to a URL
        driver.get("https://www.google.com");
        System.out.println("Navigated to Google");

        // STEP 4: Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // STEP 5: Get and print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);

        // STEP 6: Close the browser
        driver.quit();
        System.out.println("Browser closed. Test complete.");
	}

}
