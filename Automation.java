/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lubaba
 */
public class Automation {
ChromeDriver driver;
    /**
     */
    public void invoke() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lubaba\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.phptravels.net");
        driver.manage().window().maximize();
        
    }
    public void work_proc()
    {
       WebElement t = driver.findElement(By.xpath("//a[@data-name='tours']"));
       if(t.isDisplayed()){
           System.out.println("Pass");
       } else {
           System.out.println("Fail");
       }
       
    }
    public static void main(String[] args){
    Automation a=new Automation();
    a.invoke();
    a.work_proc();
    }
}
