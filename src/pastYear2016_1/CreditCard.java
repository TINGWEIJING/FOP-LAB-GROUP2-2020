package pastYear2016_1;

/**
 *
 * @author TING WEI JING
 */
public class CreditCard {
    private String name;
    private String cardNo;
    private char type; // R - rebate, P - point
    private double totalReward;
    
    public CreditCard(String name, String cardNo, char type) {
        this.name = name;
        this.cardNo = cardNo;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public char getType() {
        return type;
    }

    public double getTotalReward() {
        return totalReward;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setTotalReward(double reward) {
        this.totalReward = reward;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Credit Card : ");
        sb.append(name);
        sb.append(" (");
        sb.append(cardNo);
        sb.append(")\n");
        sb.append("Card Type : ");
        if(type == 'R') {
            sb.append("Cash Rebate\n");
        }
        else{
            sb.append("Point Reward\n");
        }
        sb.append("Total Cash Reward : ");
        sb.append(totalReward);
//        String.format(name, args)
//String = + + + 
        return sb.toString();
//        return + + + ;
    }
    
}
