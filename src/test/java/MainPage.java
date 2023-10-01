import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement firstNumber = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[1]/div[2]/input[1]");
    private final SelenideElement secondNumber = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[2]/div[2]/input[1]");
    private final SelenideElement numberGuess = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[4]/div[3]/div[2]/input[1]");
    private final SelenideElement build = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]");
    private final SelenideElement operation = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[3]/div[2]/select[1]");
    private final SelenideElement calculate = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[4]/div[2]/input[1]");
    private final SelenideElement reRoll = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[3]/div[1]/div[3]/input[1]");
    private final SelenideElement submit = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[4]/div[3]/div[3]/input[1]");
    private final SelenideElement answer = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[4]/div[1]/div[2]/input[1]");
    private final SelenideElement res = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[4]/div[4]/div[1]/label[1]/font[1]/b[1]/i[1]");
    private final  SelenideElement buildK3 = $x("//body[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[1]/div[3]/select[1]");
    /**
     * Открытие страницы
     */
    public MainPage(String url){
        Selenide.open(url);
    }
    /**
     * Ввод первого числа
     */
    public void inputNumber1(String s){
        firstNumber.setValue(s);
    }
    /**
     * Ввод второго числа
     */
    public void inputNumber2(String s){
        secondNumber.setValue(s);
    }
    /**
     * Ввод строки
     */
    public void inputString(String s){
        numberGuess.setValue(s);
    }
    /**
     * Выбор сборки
     */
    public void inputBuild(String s){
        build.selectOptionContainingText(s);
    }
    public void inputBuild3(String s){
        buildK3.selectOptionContainingText(s);
    }
    /**
     * Выбор операции
     */
    public void inputOperation(String s){
        operation.selectOptionContainingText(s);
    }
    /**
     * Нажатие на кнопк
     */
    public void clickCalculate(){
        calculate.click();
    }
    public void clickReRoll(){
        reRoll.click();
    }
    public void clickSubmit(){
        submit.click();
    }
    /**
     * Получиние значения из поля результат
     */
    public String getAnswer(){
        return answer.getValue();
    }
    public String getRes(){
        return res.getText();
    }


}
