package pastYear2020_1;

/**
 *
 * @author TING WEI JING
 */
public class Cloud {
    private CloudPackage cloudPackage;
    private double totalCost;

    public Cloud(CloudPackage cloudPackage) {
        this.cloudPackage = cloudPackage;
    }

    public CloudPackage getCloudPackage() {
        return cloudPackage;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCloudPackage(CloudPackage cloudPackage) {
        this.cloudPackage = cloudPackage;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Cloud Package : " + cloudPackage.getName() + " Total Cost = " + totalCost;
    }
    
    
}
