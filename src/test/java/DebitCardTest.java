import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DebitCardTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void shouldSuccessV1() {
        driver.get("http://localhost:9999/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван Иванов");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79031234567");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.tagName("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldSuccessV2() {
        driver.get("http://localhost:9999/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван Иванов-Петров");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79031234567");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.tagName("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldSuccessV3() {
        driver.get("http://localhost:9999/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван Сергей Иванов");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79031234567");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.tagName("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldSuccessV4() {
        driver.get("http://localhost:9999/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иван Иванов-Петров-Сидоров");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79031234567");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.tagName("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldSuccessV5() {
        driver.get("http://localhost:9999/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Алёна Иванова");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79031234567");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.tagName("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText().trim();

        Assertions.assertEquals(expected,actual);

    }
}
