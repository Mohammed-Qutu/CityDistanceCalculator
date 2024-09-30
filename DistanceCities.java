/*
This program is going to find the distance between 2 cities by using a two-dimensional array to
store the distances.
Mohammed Qutu
03/03/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/
import java.util.Scanner;
public class DistanceCities 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your starting city: Dallas, Austin, Houston, Galveston?");
        String city1 = keyboard.nextLine();
        
        System.out.println("What is your ending city: Dallas, Austin, Houston, Galveston?");
        String city2 = keyboard.nextLine();
        
        int[][]distance = { {0, 195, 239, 209},
                            {195, 0, 145, 189},
                            {239, 145, 0, 52},
                            {289, 189, 52, 0} };
        
        int row = 0;
        switch (city1)
        {
            case "Dallas":
                row = 0;
                break;
            case "Austin":
                row = 1;
                break;
            case "Houston":
                row = 2;
                break;
            case "Galveston":
                row = 3;
                break;
            default:
                row = 0;
                System.out.println("Invalid city");
                break;
        }
        
        System.out.println();
        
        int column = 0;
        switch (city2)
        {
            case "Dallas":
                column = 0;
                break;
            case "Austin":
                column = 1;
                break;
            case "Houston":
                column = 2;
                break;
            case "Galveston":
                column = 3;
                break;
            default:
                column = 0;
                System.out.println("Invalid city");
                break;
        }
        System.out.println("Distance is " + distance[row][column] + " miles");
    }
}
