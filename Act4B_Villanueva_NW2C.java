import java.util.*;

public class Act4B_Villanueva_NW2C {
    
    public static void main (String [] args){

        ArrayList sortingList = new ArrayList();

        Scanner scan = new Scanner(System.in);

        while (true){
        System.out.println("\n1. Insert a value "
                            +"\n2. Delete a value "
                            +"\n3. Traverse the array "
                            +"\n4. Exit");
            System.out.println("Enter your choice: ");
            String choice = scan.nextLine(); 
        

            switch(choice){
                case "1":
                System.out.println("Enter the element to be inserted: ");
                sortingList.insertItem(Integer.parseInt(scan.nextLine()));
                break;

                case "2":
                System.out.println("Enter the element to be deleted: ");
                sortingList.deleteItem(Integer.parseInt(scan.nextLine()));
                break;

                case "3":
                System.out.println("Transversal array: ");
                sortingList.printArray();
                break;

                case "4":
                System.exit(0);

            }
        } 
        }
}