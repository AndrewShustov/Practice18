package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {
    private static WebDriver webDriver;

    private static CalcPage calcPage;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("--user-data-dir=C:\\Users\\A4F7~1\\AppData\\Local\\Temp\\scoped_dir8948_2027490107\\Default");
        //chromeOptions.addArguments("--profile-directory=Default");
        webDriver = new ChromeDriver(chromeOptions);
        calcPage = new CalcPage(webDriver);
    }

    @BeforeEach
    public void setup() {
        webDriver.get("http://google.com");
        webDriver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
    }

    @Test
    public void case1() {
        webDriver.findElement(xpath("//*[@jsname='j93WEe']")).click(); //(
        webDriver.findElement(xpath("//*[@jsname='N10B9']")).click(); //1
        webDriver.findElement(xpath("//*[@jsname='XSr6wc']")).click(); //+
        webDriver.findElement(xpath("//*[@jsname='lVjWed']")).click(); //2
        webDriver.findElement(xpath("//*[@jsname='qCp9A']")).click(); //)
        webDriver.findElement(xpath("//*[@jsname='YovRWb']")).click(); //*
        webDriver.findElement(xpath("//*[@jsname='KN1kY']")).click(); //3
        webDriver.findElement(xpath("//*[@jsname='pPHzQc']")).click(); //-
        webDriver.findElement(xpath("//*[@jsname='xAP7E']")).click(); //4
        webDriver.findElement(xpath("//*[@jsname='bkEvMb']")).click(); //0
        webDriver.findElement(xpath("//*[@jsname='WxTTNd']")).click(); //divide
        webDriver.findElement(xpath("//*[@jsname='Ax5wH']")).click(); //5
        webDriver.findElement(xpath("//*[@jsname='Pt8tGc']")).click(); //=
    }

    @Test
    public void case2() {
        webDriver.findElement(xpath("//*[@jsname='abcgof']")).click(); //6
        webDriver.findElement(xpath("//*[@jsname='WxTTNd']")).click(); //divide
        webDriver.findElement(xpath("//*[@jsname='bkEvMb']")).click(); //0
        webDriver.findElement(xpath("//*[@jsname='Pt8tGc']")).click(); //=
        assertEquals("Infinity", calcPage.geiInf());
    }

    @Test
    public void case3() {
        webDriver.findElement(xpath("//*[@jsname='aN1RFf']")).click(); //sin
        webDriver.findElement(xpath("//*[@jsname='j93WEe']")).click(); //(
        webDriver.findElement(xpath("//*[@jsname='Pt8tGc']")).click(); //=
    }

    @AfterAll
    public static void quit() {
        webDriver.quit();
    }
}
