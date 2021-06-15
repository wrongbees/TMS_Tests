import org.testng.Assert;
import org.testng.annotations.Test;

public class Unittest {
    // a>0, b>0
//    @Test
//    public void positiveSumTest1() {
//        Calculator calc = new Calculator();
//
//        Assert.assertEquals(calc.sum(2, 3), 5, "Тестовый комментарий...");
//    }
//
//    // a=0, b=0
//    @Test
//    public void positiveSumTest2() {
//        Calculator calc = new Calculator();
//
//        Assert.assertEquals(calc.sum(0, 0), 0);
//    }
//
//    // a<0, b>0
//    @Test
//    public void positiveSumTest3() {
//        Calculator calc = new Calculator();
//
//        Assert.assertEquals(calc.sum(-2, 3), 1);
//    }
//
//    // a<0, b<0
//    @Test
//    public void positiveSumTest4() {
//        Calculator calc = new Calculator();
//
//        Assert.assertEquals(calc.sum(-2, -3), -5);
//    }
//
//    @Test
//    public void positiveDivTest1(){
//        Calculator calculator = new Calculator();
//
//        Assert.assertEquals(calculator.div(10,5), 2);
//    }
//
//    @Test
//    public void negativeDivTest2(){
//        final Calculator calculator = new Calculator();
//
//        Assert.assertThrows(java.lang.ArithmeticException.class, ()-> calculator.div(-2, 0));
//
//    }

    // a>0,b<0
    @Test
    public void positiveDivDoubleTest1(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(4, 2.5), 1.6);
    }

    // a<0, b<0
    @Test
    public void positiveDivDoubleTest2(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(-4, -2.5), 1.6);
    }

    // a<0, b>0
    @Test
    public void positiveDivDoubleTest3(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(-4, 2.5), -1.6);
    }

    // a>0, b<0
    @Test
    public void positiveDivDoubleTest4(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(4, -2.5), -1.6);
    }

    // a=0, b>0
    @Test
    public void positiveDivDoubleTest5(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(0, 2.5), 0);
    }

    // a>0, b=0
    @Test
    public void negativeDivDoubleTest(){                       //можно ли этот тест считать негативным?????
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divDouble(4, 0), Double.POSITIVE_INFINITY);

    }

    // a>0
    @Test
    public void positiveSqrlTest1(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.sqr_t(4), 2);
    }

    // a=0
    @Test
    public void positiveSqrlTest2(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.sqr_t(0), 0);
    }

    // a<0
    @Test
    public void negativeSqrlTest(){               //можно ли этот тест считать негативным?????
        Calculator calculator = new Calculator();

        Assert.assertEquals(Double.isNaN(calculator.sqr_t(-4)), true);
    }

}
