package pastYear2020_1;

/**
 *
 * @author TING WEI JING
 */
public class CloudPackage extends Cloud {

    private String name;
    private int coreNum;
    private int memory;
    private double priceHour;

    public CloudPackage(String name, int coreNum, int memory, double priceHour) {
        super(null);
        this.name = name;
        this.coreNum = coreNum;
        this.memory = memory;
        this.priceHour = priceHour;
        super.setCloudPackage(this);
    }

    public String getName() {
        return name;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public int getMemory() {
        return memory;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public boolean check(Job job) {
        return this.memory >= job.getMemory();
    }

    public double totalCost(Job job) {
        
        return ((double) job.getTaskNum() / this.coreNum * this.priceHour);
    }

}
