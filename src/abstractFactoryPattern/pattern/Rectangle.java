package abstractFactoryPattern.pattern;

class Rectangle implements Shape {
    private String name = "rectangle";
    @Override
    public String getName() {
        return name;
    }
}
