import java.util.Scanner;

public class HalloweenCandy
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();
        //your code goes here
        double cal = 200/houses;
        double cal2 = 10%houses;
        if (cal2>=0.5) cal = (int)(cal+1);
        System.out.print((int)cal);
        input.close();
        
    }
}