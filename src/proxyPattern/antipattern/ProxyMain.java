package proxyPattern.antipattern;

public class ProxyMain {
    public static void main(String[] args) {
        System.out.println("Image service check");
        Image image = new Image("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        System.out.println("Image service check");
        image.display();
    }
}
