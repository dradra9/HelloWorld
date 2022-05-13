import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int wallNumber = 0;

        System.out.println("How many walls are you painting?");

        wallNumber = Integer.valueOf(myScanner.nextLine());
        double totalWallArea = 0;

        for( int i = 1;  i <= wallNumber; i++ )
        {
            System.out.println("For wall number:  " + wallNumber + ". What are the dimensions?" );
            System.out.println("What is the height of the wall?" );

            double wallHeight = Double.valueOf(myScanner.nextLine());

            System.out.println("What is the width of the wall?" );
            double wallWidth = Double.valueOf(myScanner.nextLine());






        }




        System.out.println("What are the wall dimensions that you want to cover?");
        System.out.println("Enter the Height in meters: ");

        int x = 50;
        int y = 50;

        if (x == y){
            System.out.println("Hey how are you?");
        } else if (x>5) {

        }


    }
}
