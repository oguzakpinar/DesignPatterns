package proxyPattern.pattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Image service check");
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
