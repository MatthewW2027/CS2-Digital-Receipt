import java.util.Scanner; 

public class Main {

   public static void main(String []args) {
       
      Scanner input = new Scanner(System.in);
      System.out.println("High School Name: ");
      String highSchoolName = input.nextLine(); 
      double drink = 1.50; 
      double candy = 1.25; 
      double hotDog = 2.75; 
      double hamburger = 3.50; 
      int orderNumber = (int)(Math.random()*100)+1; 
      System.out.println("How many drinks would you like?: ");
      int numOfDrinksOrdered = input.nextInt(); 
      System.out.println("How many candies would you like?: ");
      int numOfCandiesOrdered = input.nextInt(); 
      System.out.println("How many hot dogs would you like?: ");
      int numOfHotDogs = input.nextInt();
      System.out.println("how many hamburgers would you like?: ");  
      int numOfHamburgers = input.nextInt(); 
      double taxRate = 0.08; 
      double subTotal = (drink * numOfDrinksOrdered) + (candy * numOfCandiesOrdered) + (hotDog * numOfHotDogs) + (hamburger * numOfHamburgers); 
      double totalTax = subTotal * taxRate; 
      double total = subTotal + totalTax; 
      
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                " + highSchoolName + "                *");
     System.out.println("*                  " + orderNumber + "                *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("* Drink .........." + drink + " quantity: " + numOfDrinksOrdered + "    *");                      
     System.out.println("* Candy .........." + candy + " quantity " + numOfCandiesOrdered + "    *");     
     System.out.println("* Hot Dog ........" + hotDog + " quantity: " + numOfHotDogs + "   *");     
     System.out.println("* Hamburger ......" + hamburger + " quantity: " + numOfHamburgers + "    *");     
     System.out.println("*            total: " + total + "            *");    
     System.out.println("**************************************");
   }
}
