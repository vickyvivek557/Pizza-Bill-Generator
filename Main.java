import java.util.*;

public class Main {
    public static void main(String[] args) {
      Pizza p = new Pizza(true); //  veg pizza
      System.out.println("WELCOME SIR..");
    System.out.println("Which type of PIZZA do you want ?");
    System.out.println("Press 1 for veg Pizza or press 2 for non-vej Pizza.");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    if(input == 1){
         p = new Pizza(true);
    }else if(input == 2){
        p = new Pizza(false);
   }else{
    System.out.println("INVALID INPUT !!!!!");
   }

   System.out.println("Do you want extra cheese ?\nPress 1 if YES and Press 0 if NO.");
   int cheese = sc.nextInt();

    if(cheese == 1){
        p.addExtraCheese();
    }

    System.out.println("Do you want extra topping ?\nPress 1 if YES and Press 0 if NO.");
   int topping = sc.nextInt();

    if(topping == 1){
        p.addExtraToppings();
    }

    System.out.println("Do you want to takeaway ?\nPress 1 if YES and Press 0 if NO.");
   int takeaway = sc.nextInt();

    if(takeaway == 1){
        p.addTakeaway();
    }

    //   p.addExtraCheese();
    //   p.addExtraToppings();
    //   p.addTakeaway();
    System.out.println("\nYOUR BILL IS READY");
      System.out.println(p.getBill());
    }
  }