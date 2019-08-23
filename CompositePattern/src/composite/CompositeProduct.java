package composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sergio Ramirez
 */

public class CompositeProduct extends AbstractProduct {

    private List< AbstractProduct > products = new ArrayList< AbstractProduct >();

    public CompositeProduct(String name) {
        super(name, 0);
    }

    @Override
    public double getWeight() {
        double weight = 0d;
        for (AbstractProduct child : products) {
            weight += child.getWeight();
        }
        return weight;
    }

    public void addProduct(AbstractProduct product, String boxName) {
        System.out.println("Adding " + product.getName() +"("+ product.getWeight() + " Kg) to <" + boxName + ">");
        this.products.add(product);
    }

    public boolean removeProduct(AbstractProduct product) {
        return this.products.remove(product);
    }
}