package pastYear2016_1;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");

        String[] type = {"Grocery", "Other", "Fuel", "Utility", "Other"};
        String[] day = {"Saturday", "Friday", "Sunday", "Friday", "Tuesday"};
        double[] price = {124.80, 64.60, 95.40, 100.00, 220.00};

        for(int i = 0; i < price.length; i++) {
            r.getReward(type[i], price[i]);
        }

        for(int i = 0; i < price.length; i++) {
            p.getReward(day[i], price[i]);
        }

        System.out.println(r);
        System.out.println(p);
        if(r.getTotalReward() > p.getTotalReward()) {
            System.out.println("The best card is Cash Rebate Card");
        }else{
            System.out.println("The best card is Point Reward Card");
            
        }
    }

}
