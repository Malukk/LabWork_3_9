import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Bulik on 04.10.2016.
 */
public class TestTemperatureConverter {
    static TemperatureConverter obj;
    @BeforeClass
    public static void init(){
        obj = new TemperatureConverter();
    }
    @Test
    public void testConvertKtoC(){
        double result = obj.convertKtoC(273.2);
        Assert.assertEquals( 0.0, result, 0.0000001);

    }
    @Test
    public void convertCtoK(){
        double result =obj.convertCtoK(0);
        Assert.assertEquals( 273.2, result, 0.0000001);
    }
//    @Test
//    public void convertCtoF(){
//        double result =obj.convertCtoF(0);
//        Assert.assertEquals( 273.2, result, 0.0000001);
//    }
//    @Test
//    public void convertFtoC(){
//        double result =obj.convertFtoC(0);
//        Assert.assertEquals( 273.2, result, 0.0000001);
//    }

}
