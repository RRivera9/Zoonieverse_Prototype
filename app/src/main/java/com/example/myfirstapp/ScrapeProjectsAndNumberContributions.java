package com.example.myfirstapp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;


public class ScrapeProjectsAndNumberContributions {

    //gets to the projects page, but leaves the user logged in. Shut it down later if necessary.
    public WebDriver NavigateToProjectsAndLogin() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.zooniverse.org/#projects");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("button[value*='sign-in']")).click();
        driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("kiriyim");
        driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("hiroshima9");
        driver.findElement(By.cssSelector("button[type*='submit']")).click();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement test = driver.findElement(By.cssSelector("a[class*='outlined-button']"));
        test.click();
        //System.out.println(test.isDisplayed());
        return driver;
    }

    public ScrapeProjectsAndNumberContributions() {
        WebDriver driver = NavigateToProjectsAndLogin();
        //Document doc = Jsoup.parse(driver.getPageSource());
        //Element projectName = doc.select("div.name").first();
        //String absUrl = projectName.absUrl("src");
        //String src = projectName.attr("src");
        //System.out.println(doc);
        //System.out.println(projectName);
        //System.out.println(src);
        //System.out.println("Hi");
        //driver.quit();
    }

    public static void main (String args[]) {

        new ScrapeProjectsAndNumberContributions();

    }

}
