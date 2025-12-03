import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @ParameterizedTest
    @CsvFileSource(resources = "login_test.csv", numLinesToSkip = 1)
    void testLogin01(String log, String pass) {
        open("https://slqamsk.github.io/cases/slflights/v01/");
        $x("//input[@id='username']").setValue(log);
        $x("//input[@id='password']").setValue(pass);
        $x("//button[@id='loginButton']").click();
    }
}
