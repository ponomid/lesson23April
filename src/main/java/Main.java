import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        simpleTest();
        numberTest();
        emptyTest();
        nullTest();
    }

    public static void simpleTest() {
        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));
    }

    public static void numberTest() {
        System.out.println(
                "12345".equals(StringUtils.capitalize("12345")));
    }

    public static void emptyTest() {
        System.out.println(
                "".equals(StringUtils.capitalize("")));
    }

    public static void nullTest() {
        System.out.println(
                null == StringUtils.capitalize(null));
    }


}
