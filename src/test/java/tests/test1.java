package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {
    private static WebDriver webDriver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("--user-data-dir=C:\\Users\\A4F7~1\\AppData\\Local\\Temp\\scoped_dir8948_2027490107\\Default");
        //chromeOptions.addArguments("--profile-directory=Default");
        webDriver = new ChromeDriver(chromeOptions);
    }

    @BeforeEach
    public void setup(){
        webDriver.get("http://google.com");
        webDriver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
    }

    @Test
    public void case1() {
        webDriver.findElement(By.xpath("//*[@jsname='j93WEe']")).click(); //(
        webDriver.findElement(By.xpath("//*[@jsname='N10B9']")).click(); //1
        webDriver.findElement(By.xpath("//*[@jsname='XSr6wc']")).click(); //+
        webDriver.findElement(By.xpath("//*[@jsname='lVjWed']")).click(); //2
        webDriver.findElement(By.xpath("//*[@jsname='qCp9A']")).click(); //)
        webDriver.findElement(By.xpath("//*[@jsname='YovRWb']")).click(); //*
        webDriver.findElement(By.xpath("//*[@jsname='KN1kY']")).click(); //3
        webDriver.findElement(By.xpath("//*[@jsname='pPHzQc']")).click(); //-
        webDriver.findElement(By.xpath("//*[@jsname='xAP7E']")).click(); //4
        webDriver.findElement(By.xpath("//*[@jsname='bkEvMb']")).click(); //0
        webDriver.findElement(By.xpath("//*[@jsname='WxTTNd']")).click(); //divide
        webDriver.findElement(By.xpath("//*[@jsname='Ax5wH']")).click(); //5
        webDriver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
    }

    @Test
    public void case2() {
        webDriver.findElement(By.xpath("//*[@jsname='abcgof']")).click(); //6
        webDriver.findElement(By.xpath("//*[@jsname='WxTTNd']")).click(); //divide
        webDriver.findElement(By.xpath("//*[@jsname='bkEvMb']")).click(); //0
        webDriver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
    }

    @Test
    public void case3() {
        webDriver.findElement(By.xpath("//*[@jsname='aN1RFf']")).click(); //sin
        webDriver.findElement(By.xpath("//*[@jsname='j93WEe']")).click(); //(
        webDriver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
    }

    @AfterAll
    public static void quit() {
        //webDriver.quit();
    }
}
