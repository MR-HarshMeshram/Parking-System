import java.util.*;
public class Parking_System{
    static int Total_Slots  , Available_Slots;
    static ArrayList<String> Parke_Car= new ArrayList<>();

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter  the total number of PARKING SLOTS : ");
        Total_Slots=input.nextInt();
        Available_Slots=Total_Slots;

        while(true){
            System.out.println(" What would you like to do ?");
            System.out.println("1. Park a Car ");
            System.out.println("2. Remove a Car ");
            System.out.println("2. View Parked Cars ");
            System.out.println("4. Exit ");
            
            int Choice=input.nextInt();

            switch( Choice){
                case 1:

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println(" Invalid Choice . please try again!")
            }
        }
        
    }
    public static void ParkCar(){
        if(Available_Slots==0){
            System.out.println(" Sorry ! there are no available Parking Slots.");
            return;
        }
        Scanner user=Scanner(System.in);

        System.out.println(" Enter  the License plate number of the Car :")
        String License_Plate=user.nextLine();

        Parke_Car.add(License_Plate);
        Available_Slots--;
        
        System.out.println(" Car Parked Sucessfully . Available Slots :"+Available_Slots);
    }
    
    public static void RemoveCar(){
        if(Available_Slots == Total_Slots){
            System.out.println(" There are NO parked Cars");
            
        }
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter the License plate number of the car to be Removed : ");

        String License_Plate=input.nextLine();
        if(Parke_Car.contains(License_Plate)){
            Parke_Car.remove(License_Plate);
            Available_Slots++;
            System.out.println(" The car removed successfully . Available Slots: "+Available_Slots);
        }else{
            System.out.println(" the car is not parked here. ");
        }
    }

}