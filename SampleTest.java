package com.example.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleTest extends TestBase {

    @Test
    public void testTitle() {
        String expectedTitle = "Example Domain";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testElementPresence() {
        WebElement element = driver.findElement(By.id("element-id"));
        assertNotNull(element);
    }
}
