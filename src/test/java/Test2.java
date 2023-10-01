import org.junit.Assert;
import org.junit.Test;

public class Test2 extends BeseTest{
    private final static String Base_URL = "https://testsheepnz.github.io";

    /**
     * Кейс 1: Разница двух целых чисел
     */
    @Test
    public void checkDifference(){
        MainPage mainPage = new MainPage(Base_URL+"/BasicCalculator.html");
        mainPage.inputBuild("Prototype");
        mainPage.inputNumber1("2");
        mainPage.inputNumber2("3");
        mainPage.inputOperation("Subtract");
        mainPage.clickCalculate();
        String res = mainPage.getAnswer();
        System.out.println(res);
        Assert.assertTrue(res.contains("-1"));
    }
    /**
     * Кейс 2 Конкатенация двух строк
     */
    @Test
    public void checkConcatenate(){
        MainPage mainPage = new MainPage(Base_URL+"/BasicCalculator.html");
        mainPage.inputBuild("Prototype");
        mainPage.inputNumber1("gs");
        mainPage.inputNumber2("bu");
        mainPage.inputOperation("Concatenate");
        mainPage.clickCalculate();
        String res = mainPage.getAnswer();
        System.out.println(res);
        Assert.assertTrue(res.contains("gsbu"));
    }
    /**
     * Кейс 3 Появление сообщения при вводе строки в поле
     */
    @Test
    public void checkString(){
        MainPage mainPage = new MainPage(Base_URL+"/random-number.html");
        mainPage.inputBuild3("Demo");
        mainPage.clickReRoll();
        mainPage.inputString("string");
        mainPage.clickSubmit();
        String res = mainPage.getRes();
        Assert.assertTrue(res.contains("string: Not a number!"));
    }
}
