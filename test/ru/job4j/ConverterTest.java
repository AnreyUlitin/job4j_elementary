
    import org.junit.Assert;
    import org.junit.Test;
    import ru.job4j.Converter;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        double in = 140.0;
        double expected = 2.0;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, in, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double in = 180.0;
        double expected = 3.0;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, in, out);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        double in = 0.0;
        double expected = 0.0;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, in, out);
    }
}