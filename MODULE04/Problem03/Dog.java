package MODULE04.Problem03;

public class Dog extends Pet {
    private String furColor;
    private String[] abilityAnimal;

    public Dog(String name, String breed, String furColor, String[] abilityAnimal) {
        super(name, breed);
        this.furColor = furColor;
        this.abilityAnimal = abilityAnimal;
    }

    public String getFurColor() {
        return furColor;
    }

    public String[] getAbilityAnimal() {
        return abilityAnimal;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + getFurColor());
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i < getAbilityAnimal().length; i++) {
            System.out.print(getAbilityAnimal()[i]);
        }
    }
}