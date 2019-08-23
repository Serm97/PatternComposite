package composite;

/**
 *
 * @author Sergio Ramirez
 */

public abstract class AbstractProduct {

    protected String name;
    protected double weight;

    public AbstractProduct(String name, double weight) {

        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
