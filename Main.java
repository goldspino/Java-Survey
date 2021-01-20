import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);

     System.out.println("What is your name?");

     String name = scan.nextLine();

     System.out.println("Cool! Your name is " + name);

     System.out.println("What is your favorite animal?");

     String animal = scan.nextLine();

     System.out.println("Awesome! Your favorite animal is a " + animal);

     System.out.println("What is your favorite color?");

     String color = scan.nextLine();

     System.out.println("Awesome! Your favorite color is " + color); 

     System.out.println("Would you prefer chocolate or ice cream?");

     String sweet = scan.nextLine();
     if (sweet.equals("chocolate")) {

     System.out.println("Which chocolate do you like?");

     String chocoloate = scan.nextLine();

     System.out.println(chocoloate +" is a good choice!");}
     else{
       System.out.println("Which ice cream do you like?");

     String ice = scan.nextLine();
     
     System.out.println(ice +" is a good choice!");
     }
     

     System.out.println("What is your favorite subject?");

     String subject = scan.nextLine();

     System.out.println("Cool! Your favorite subject is " + subject);

     System.out.println("Thank you "+ name + "! Have a great day! Bye!!!");




      


  }
}