package pastYear2018_1;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Apple("Red", 8);
        fruits[1] = new Apple("Green", 11);
        fruits[2] = new Watermelon("Local", 7.6);
        fruits[3] = new Watermelon("Imported", 4);
        
        Fruit cheapFruit = fruits[0];
        for(Fruit fruit : fruits) {
            System.out.println(fruit);
            if(cheapFruit.totalPrice() > fruit.totalPrice()) {
                cheapFruit = fruit;
            }
        }
        
        System.out.println("The cheapest item is");
        System.out.println(cheapFruit);
        
    }

}
