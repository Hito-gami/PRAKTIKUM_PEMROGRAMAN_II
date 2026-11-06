package MODULE04.Problem03;

public class Cat extends Pet {
    private String furColor;

    public Cat(String name, String breed, String furColor) {
        super(name, breed);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + getFurColor());
    }
}