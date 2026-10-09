package MODULE02.Problem01;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;

    private double pricePerKg;

    public Fruit(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;

        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {

        System.out.println("Nama Buah: " + fruitName);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + purchaseTotal + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f%n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", getPostDiscountPrice());
        System.out.println();
    }

    public double getPreDiscountPrice() {
        return pricePerKg * purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}