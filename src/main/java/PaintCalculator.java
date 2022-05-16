import java.util.Scanner;

public class PaintCalculator {

    static double totalWallArea(int numberOfWalls){

        Scanner myScanner = new Scanner(System.in);
        double totalWallArea = 0;

        for( int i = 1;  i <= numberOfWalls; i++ )
        {
            System.out.println("For wall number:  " + numberOfWalls + ". What are the dimensions?" );
            System.out.println("What is the height of the wall?" );

            double wallHeight = Double.valueOf(myScanner.nextLine());

            System.out.println("What is the width of the wall?" );
            double wallWidth = Double.valueOf(myScanner.nextLine());

            double wallArea = wallHeight * wallWidth;
            totalWallArea += wallArea;

        }

        return totalWallArea;
    }
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int wallNumber = 0;

        System.out.println("How many walls are you painting?");

        wallNumber = Integer.valueOf(myScanner.nextLine());

        double totalWallArea = totalWallArea(wallNumber);

        int excludeWallNumber = 0;
        System.out.println("How many areas on the wall need to be removed?");
        excludeWallNumber = Integer.valueOf(myScanner.nextLine());

        double excludeWallArea = totalWallArea(excludeWallNumber);


        System.out.println(totalWallArea);
        System.out.println();



    }
}
