import java.util.*;
public class Parking_System{
    static int Total_Slots  , Available_Slots;
    static ArrayList<String> Parke_Car= new ArrayList<>();

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter  the total number of PARKING SLOTS : ");
        Total_Slots=input.nextInt();
        Available_Slots=Total_Slots;
        System.out.println(" end the running "+Available_Slots);
        System.out.println(" end the running "+Total_Slots);
    }
}