package pastYear2018_1;

/**
 *
 * @author TING WEI JING
 */
public class Apple extends Fruit {

    private int quantity;

    public Apple(String type, int quantity) {
        super("Apple", type);
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        switch(getType()) {
            case "Green":
                return 1.2 * quantity;

            case "Red":
                return 1.8 * quantity;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + quantity + " = RM " + totalPrice();
    }

}
