/*
b) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
bat_avg). Create an array of n player objects .Calculate the batting average for each
player using static method avg(). Define a static sort method which sorts the array on
the basis of average. Display the player details in sorted order.
*/

import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totatruns;
    double bat_avg;

    CricketPlayer(String name,
    int no_of_innings,
    int no_of_times_notout,
    int totatruns, double bat_avg) {
        this.totatruns = totatruns;
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.bat_avg = bat_avg; 
    }

    public static double avg(int no_of_innings, int totatruns) {
        return totatruns/no_of_innings;
    }

    //sort by insertion sort 
    public static void sortByAvg(CricketPlayer[] cp, int n) {
        for(int i=1; i<n; i++) {
            CricketPlayer curr = cp[i];
            int j = i-1;

            while(j>=0 && cp[j].bat_avg > curr.bat_avg) {
                cp[j+1] = cp[j];
                j--;
            }

            cp[j+1] = curr;
        }
    }
}

public class Asg2Bb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many players :");
        int n = sc.nextInt();

        CricketPlayer[] cp = new CricketPlayer[n];
        for(int i=0; i<n; i++) {
            System.out.println((i+1) + " :");
            System.out.println("Enter player name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter no. of innings :");
            int no_of_innings = sc.nextInt();

            System.out.println("Enter no. of times notout :");
            int no_of_times_notout = sc.nextInt();

            System.out.println("Enter no. of runs :");
            int totatruns = sc.nextInt();

            double bat_avg = CricketPlayer.avg(no_of_innings, totatruns);

            cp[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, totatruns, bat_avg);
            System.out.println("-----------------------------------------------");
        }

        CricketPlayer.sortByAvg(cp, n);

        for(int i=0; i<n; i++) {
            System.out.println((i+1) + " :");
            System.out.println("Player name = " + cp[i].name);
            System.out.println("no. of innings = " + cp[i].no_of_innings);
            System.out.println("no of times notout = " + cp[i].no_of_times_notout);
            System.out.println("no. of runs = " + cp[i].totatruns);
            System.out.println("batting average = " + cp[i].bat_avg);
            System.out.println("-----------------------------------------------");
        }
    }
}