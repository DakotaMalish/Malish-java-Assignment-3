package malish.java.assignment.pkg3;
import java.util.*;








public class MalishJavaAssignment3 {
    
    public static void main(String[] args) {         
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
                              "*                                 *\n"+
                              "*  Hotel Room Number Calculator   *\n"+
                              "*                                 *\n"+
                              "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
           
           Scanner selection = new Scanner(System.in);
           int floorCount = 0;
           int roomsNum = 0;
           
          
            System.out.println("Please select the number of floors, Between 1 and 10.");
            floorCount = selection.nextInt();
            while(floorCount < 1 || floorCount > 10)
            {
            System.out.println("Please select the number of floors, Between 1 and 10.");
            floorCount = selection.nextInt();
            }            
         for(int i = 0; i < floorCount; i++)
         {
             System.out.println("Please select the number of rooms on floor " + (i +1) + ".");
             roomsNum += selection.nextInt();
         }
         
            System.out.println("\nyou have "+roomsNum+ " Rooms total.");
    }
}

        
    
