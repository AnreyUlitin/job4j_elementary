public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void hello1(String age) {
        System.out.println("Age " + age);
    }
    public static void main(String[] args) {
        String name = "Petr Arsentev";
        String age = "33";
        ArgMethod.hello(name);
        ArgMethod.hello1(age);
    }
}

