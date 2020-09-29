package com.example.myfirstapp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class ScrapeProfileImageURL {


    public ScrapeProfileImageURL() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.zooniverse.org/users/kiriyim");
        Document doc = Jsoup.parse(driver.getPageSource());
        Element image = doc.select("img.avatar").first();
        String absUrl = image.absUrl("src");
        String src = image.attr("src");
        //System.out.println(doc);
        System.out.println(image);
        System.out.println(src);
        System.out.println("Hi");
        driver.quit();

    }

    public static void main (String args[]) {

        new ScrapeProfileImageURL();

    }

}