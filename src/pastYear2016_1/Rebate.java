package pastYear2016_1;

/**
 *
 * @author TING WEI JING
 */
public class Rebate extends CreditCard {

    public Rebate(String name, String cardNo) {
        super(name, cardNo, 'R');
    }

    public void getReward(String itemType, double price) {
        switch(itemType) {
            case "Fuel":
                setTotalReward(getTotalReward() + price * 0.08);
                break;
                
            case "Utility":
                setTotalReward(getTotalReward() + price * 0.05);
                break;
                
            case "Grocery":
                setTotalReward(getTotalReward() + price * 0.02);
                break;
                
            case "Other":
                setTotalReward(getTotalReward() + price * 0.002);
                break;
        }
    }

}
