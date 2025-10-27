public class Main {

   public static void main(String []args) {
       
      String highSchoolName = "The Birch Wathen Lenox School"; 
      double drink = 1.50; 
      double candy = 1.25; 
      double hotDog = 2.75; 
      double hamburger = 3.50; 
      int orderNumber = (int)(Math.random()*100)+1; 
      int numOfDrinksOrdered = (int)(Math.random()*3); 
      int numOfCandiesOrdered = (int)(Math.random()*3); 
      int numOfHotDogs = (int)(Math.random()*3); 
      int numOfHamburgers = (int)(Math.random()*3); 
      double taxRate = 0.08; 
      double subTotal = drink + candy + hotDog + hamburger; 
      double totalTax = subTotal * taxRate; 
      double total = subTotal + totalTax; 
      
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                  " + orderNumber + "                *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("* Drink .........." + drink + " quantity: " + numOfDrinksOrdered + "    *");                      
     System.out.println("* Candy .........." + candy + " quantity " + numOfCandiesOrdered + "    *");     
     System.out.println("*     Hot Dog ........" + hotDog + "           *");     
     System.out.println("*     Hamburger ......" + hamburger + "            *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   }
}
