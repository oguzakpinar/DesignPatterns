package proxyPattern.antipattern;

public class ProxyMain {
    public static void main(String[] args) {
        ProxyImage2 image = new ProxyImage2("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
