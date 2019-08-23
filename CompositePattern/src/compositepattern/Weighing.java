package compositepattern;

import composite.AbstractProduct;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Sergio Ramirez
 */

public class Weighing {

    private String ref;
    private List<AbstractProduct> boxes = new ArrayList<AbstractProduct>();

    public Weighing(String ref) {
        this.ref = ref;
    }


    public double getWeightTotal() {
        double weigth = 0d;
        for (AbstractProduct child : boxes) {
            System.out.println("Calculando...");
            weigth += child.getWeight();
        }
        return weigth;
    }

    public void addProduct(AbstractProduct product) {
        boxes.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        boxes.remove(product);
    }

    public void printWeigth() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\n=============================================\n" +
                "Caja  " + ref + "\n");
        System.out.println("Total Weigth: " + formater.format(getWeightTotal())
                + " Kg\n=============================================");
    }
}
