package proxyPattern.antipattern;

public class ProxyImage implements IImage{

    private Image image;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("Image service check");
        if(image == null)
            image = new Image(fileName);
        image.display();
    }
}
