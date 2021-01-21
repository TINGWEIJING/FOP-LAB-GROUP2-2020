package pastYear2020_1;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    private static char[] direction = new char[4];
    private static int[] degree = new int[4];
    private static int[] minute = new int[4];
    private static int[] second = new int[4];

    public static void main(String[] args) {
        double lat1;
        double lon1;
        double lat2;
        double lon2;
        System.out.println("Enter location 1");
        userInput(0);
        userInput(1);
        System.out.println("Enter location 2");
        userInput(2);
        userInput(3);
//        location 1
        if(direction[0] == 'N' || direction[0] == 'S') {
            lat1 = decimalDegree(direction[0],
                                 degree[0],
                                 minute[0],
                                 second[0]);
            lon1 = decimalDegree(direction[1],
                                 degree[1],
                                 minute[1],
                                 second[1]);
        }
        else {
            lat1 = decimalDegree(direction[1],
                                 degree[1],
                                 minute[1],
                                 second[1]);
            lon1 = decimalDegree(direction[0],
                                 degree[0],
                                 minute[0],
                                 second[0]);
        }
        //        location 2
        if(direction[2] == 'N' || direction[2] == 'S') {
            lat2 = decimalDegree(direction[2],
                                 degree[2],
                                 minute[2],
                                 second[2]);
            lon2 = decimalDegree(direction[3],
                                 degree[3],
                                 minute[3],
                                 second[3]);
        }
        else {
            lat2 = decimalDegree(direction[3],
                                 degree[3],
                                 minute[3],
                                 second[3]);
            lon2 = decimalDegree(direction[2],
                                 degree[2],
                                 minute[2],
                                 second[2]);
        }
        System.out.printf("Location 1: %.6f Latitude , %.6f Longitude \n", lat1, lon1);
        System.out.printf("Location 2: %.6f Latitude , %.6f Longitude \n", lat2, lon2);
        System.out.printf("Distance : %.2f KM", distance(Math.toRadians(lat1), Math.toRadians(lat2), Math.toRadians(lon1), Math.toRadians(lon2)));
    }

    public static void userInput(int index) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Direction: [N, S, E, W]: ");
        direction[index] = sc.nextLine().charAt(0);
        System.out.print("Enter Degree, Minute, and Second : ");
        String temp = sc.nextLine();
        String tempArr[] = temp.split(" ", 3);
        degree[index] = Integer.parseInt(tempArr[0]);
        minute[index] = Integer.parseInt(tempArr[1]);
        second[index] = Integer.parseInt(tempArr[2]);
    }

    public static double decimalDegree(char direction, int degree, int minute, int second) {
        double sign = 0;
        switch(direction) {
            case 'N':
            case 'E':
                sign = 1;
                break;

            case 'S':
            case 'W':
                sign = -1;
                break;
        }
        return sign * (double) (degree + (double) (minute * 60 + second) / 3600);
    }

    public static double distance(double lat1, double lat2, double lon1, double lon2) {
        double a;
        double c;
        double d;
        a = Math.pow(Math.sin((lat1 - lat2) / 2), 2)
            + Math.cos(lat1)
              * Math.cos(lat2)
              * Math.pow(Math.sin((lon1 - lon2) / 2), 2);
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        d = 6371 * c;
        return d;
    }

}
