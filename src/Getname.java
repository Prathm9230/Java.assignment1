//using getProperty:that retrieves value(username) from the system.//
public class Getname {
    public static void main(String[] args) {
        String name = System.getProperty("user.name");
        System.out.println("User name is:" + name);
    }
}