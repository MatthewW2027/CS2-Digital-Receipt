public class Main {

   public static void main(String []args) {
       
      String highSchoolName = "The Birch Wathen Lenox School"; 
      double drink = 1.50; 
      double candy = 1.25; 
      double hotDog = 2.75; 
      double hamburger = 3.50; 
      int orderNumber = (int)(Math.random()*3); 
      int numOfDrinksOrdered = (int)(Math.random()*3); 
      int numOfCandiesOrdered = (int)(Math.random()*3); 
      int numOfHotDogs = (int)(Math.random()*3); 
      int numOfHamburgers = (int)(Math.random()*3); 
      int taxRate = 
      
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink .........." + drink + "            *");                      
     System.out.println("*     Candy .........." + candy + "           *");     
     System.out.println("*     Hot Dog ........" + hotDog + "           *");     
     System.out.println("*     Hamburger ......" + hamburger + "            *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   }
}
