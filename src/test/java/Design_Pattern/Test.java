package Design_Pattern;

public class Test {

    public static void main(String[] args) {

        String browserType = SingletonPattern.getInstance().getValue("browserType");
        System.out.println(browserType);
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());

    }

}
