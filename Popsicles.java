import java.util.Scanner;

public class Popsicles
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int siblings = input.nextInt();
        int popsicles = input.nextInt();
        
if(popsicles>0 && popsicles >= siblings){
            if(popsicles % siblings == 0)System.out.print("give away");
            else System.out.print("eat them yourself");
        }
        else System.out.print("eat them yourself");
        input.close();
    }
}