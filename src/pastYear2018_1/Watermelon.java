package pastYear2018_1;

/**
 *
 * @author TING WEI JING
 */
public class Watermelon extends Fruit {

    private double weight;

    public Watermelon(String type, double weight) {
        super("Watermelon", type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        switch(getType()) {
            case "Local":
                if(weight < 2) {
                    return 2.25 * weight;
                }
                else if(weight <= 5) {
                    return 1.95 * weight;
                }
                else {
                    return 1.65 * weight;
                }

            case "Imported":
                if(weight < 2) {
                    return 3.75 * weight;
                }
                else if(weight <= 5) {
                    return 3.45 * weight;
                }
                else {
                    return 3.15 * weight;
                }
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + weight + "kg = RM " + totalPrice();
    }

}
