import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class main {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//Input[@aria-label='Найти']") );
        input.click();
        input.sendKeys("Калькулятор\n");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        input = driver.findElement(By.xpath("//div[@aria-label='открывающая скобка']"));input.click(); //(
        input = driver.findElement(By.xpath("//div[@jsname='N10B9']"));input.click(); //1
        input = driver.findElement(By.xpath("//div[@jsname='XSr6wc']"));input.click(); //+
        input = driver.findElement(By.xpath("//div[@jsname='lVjWed']"));input.click(); //2
        input = driver.findElement(By.xpath("//div[@jsname='qCp9A']"));input.click(); //)
        input = driver.findElement(By.xpath("//div[@jsname='YovRWb']"));input.click(); //*
        input = driver.findElement(By.xpath("//div[@jsname='KN1kY']"));input.click(); //3
        input = driver.findElement(By.xpath("//div[@jsname='pPHzQc']"));input.click(); //-
        input = driver.findElement(By.xpath("//div[@jsname='xAP7E']"));input.click(); //4
        input = driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));input.click(); //0
        input = driver.findElement(By.xpath("//div[@jsname='WxTTNd']"));input.click(); //"/"
        input = driver.findElement(By.xpath("//div[@jsname='Ax5wH']"));input.click(); //5
        input = driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));input.click(); //=
        driver.close();



    }
}

