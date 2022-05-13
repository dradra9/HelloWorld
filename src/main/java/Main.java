
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


       /* int age = 26;
        String name = "Melvin";

        String aboutMe = "My name is " + name + ".\n"+ "I am " + age + " years old. I enjoy doing programming";

        //String hello = "Hello World!";
        System.out.println(aboutMe); */

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What are the wall dimensions that you want to cover?");
        System.out.println("Enter the Height in meters: ");

        String wallHeight = myScanner.nextLine();

        float wallNumberHeight = Float.parseFloat(wallHeight);

        System.out.println("Enter the Width in meters: ");

        String wallWidth = myScanner.nextLine();

        float wallNumberWidth = Float.parseFloat(wallWidth);


        System.out.println("Enter the dimensions for the areas you want to exclude ");
        System.out.println("Enter the Height in meters: ");

        String exludeHeight = myScanner.nextLine();

        float wallExcludeHeight = Float.parseFloat(exludeHeight);


        System.out.println("Enter the Width in meters: ");

        float wallExcludeWidth = Float.parseFloat(exludeHeight);

        String exludeWidth = myScanner.nextLine();


        System.out.println("How many coats do you need 1, 2, or 3? ");
        int coats = Integer.valueOf(myScanner.nextLine());

        float areaOfWall = wallNumberWidth*wallNumberHeight;
        float areaOfExclude = wallExcludeHeight*wallExcludeWidth;

        float paintArea = areaOfWall - areaOfExclude;

        float fullPaint = paintArea*coats;

        double paintRequired = (double) Math.round(0.1D*fullPaint*100)/100;

        double remaining = (double) Math.round(paintRequired*0.9*100)/100;

        System.out.println("The paint required in Liters is : " + paintRequired + "." + "\nIf 10% of the paint is " +
                "wasted in the process you will have " + remaining + " liters." );































    }
}
