package proxyPattern.antipattern;

public class ProxyImage2 implements IImage{

    IImage image;
    private String fileName;

    public ProxyImage2(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("Request Validation");
        if(image == null)
            image = new ProxyImage(fileName);
        image.display();
    }
}
