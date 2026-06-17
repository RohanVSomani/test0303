package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--no-sandbox"); 
        WebDriver driver = new ChromeDriver(op);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard-user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        System.out.println("Successfully logged");
    }
}
