package composite;

/**
 *
 * @author Sergio Ramirez
 */

public class SimpleProduct extends AbstractProduct {

    protected String brand;

    public SimpleProduct(String name, double weigth, String brand) {
        super(name, weigth);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
