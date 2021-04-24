import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void simpleTest() {
      Assert.assertEquals(StringUtils.capitalize("sergey"));
    }

    @Test
    public void numberTest() {
        System.out.println(
                "12345".equals(StringUtils.capitalize("12345")));
    }

    @Test
    public void emptyTest() {
        System.out.println(
                "".equals(StringUtils.capitalize("")));
    }

    @Test
    public void nullTest() {
        System.out.println(
                null == StringUtils.capitalize(null));
    }

}
