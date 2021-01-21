package pastYear2020_1;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {
    public static void main(String[] args) {
        Job J1 = new Job("J1", 252, 20);
        Job J2 = new Job("J2", 108, 10);
        Job J3 = new Job("J3", 72, 25);
        
        CloudPackage[] packages = new CloudPackage[4];
        packages[0] = new CloudPackage("P2-15", 4, 15, 1.24);
        packages[1] = new CloudPackage("P2-30", 6, 30, 2.11);
        packages[2] = new CloudPackage("P5-20", 4, 20, 1.38);
        packages[3] = new CloudPackage("P6-20", 6, 20, 1.88);
        
        // J1
        Cloud cheapPackage1 = new Cloud(packages[1]);
        cheapPackage1.setTotalCost(Integer.MAX_VALUE);
        for(int i = 0; i < packages.length; i++) {
            if(packages[i].check(J1)) {
                if(cheapPackage1.getTotalCost() >= packages[i].totalCost(J1)) {
                    cheapPackage1.setTotalCost(packages[i].totalCost(J1));
                }
            }
        }
        
                
        // J2
        Cloud cheapPackage2 = new Cloud(packages[1]);
        cheapPackage2.setTotalCost(Integer.MAX_VALUE);
        for(int i = 0; i < packages.length; i++) {
            if(packages[i].check(J2)) {
                if(cheapPackage2.getTotalCost() >= packages[i].totalCost(J2)) {
                    cheapPackage2.setTotalCost(packages[i].totalCost(J2));
                }
            }
        }
        
                
        // J3
        Cloud cheapPackage3 = new Cloud(packages[1]);
        cheapPackage3.setTotalCost(Integer.MAX_VALUE);
        for(int i = 0; i < packages.length; i++) {
            if(packages[i].check(J3)) {
                if(cheapPackage3.getTotalCost() >= packages[i].totalCost(J3)) {
                    cheapPackage3.setTotalCost(packages[i].totalCost(J3));
                }
            }
        }
        
        System.out.println(J1);
        System.out.println(cheapPackage1);
        System.out.println(J2);
        System.out.println(cheapPackage2);
        System.out.println(J3);
        System.out.println(cheapPackage3);
        System.out.println("Total Cost : " + (double)(cheapPackage1.getTotalCost() + cheapPackage2.getTotalCost() + cheapPackage3.getTotalCost()));
    }
}
