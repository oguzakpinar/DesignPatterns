package abstractFactoryPattern.pattern;

class Square implements Shape {
    private String name = "square";
    @Override
    public String getName() {
        return name;
    }
}
