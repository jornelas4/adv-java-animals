package edu.wctc;
import java.util.Scanner;
import java.util.ArrayList;

public class Create {
    Scanner userInput = new Scanner(System.in);
    public ArrayList<Talkable> implementAnimal;

    public Create(ArrayList<Talkable> addAnimal) {
        this.implementAnimal = addAnimal;
    }

    public void choice(){
        System.out.println("What type of animal they want to create?(cat or dog)");
        String choice = userInput.nextLine();
        if (choice.equals("cat")) {
            System.out.println("Cat's Name: ");
            String kityName = userInput.nextLine();
            int mice = miceformatter();


            implementAnimal(new Cat(mice, kityName));
        }
            else if (choice.equals("dog")) {
            System.out.println("Dog's Name: ");
            String pupName = userInput.nextLine();
            boolean isFriendly = friendlyDog();
            implementAnimal(new Dog(isFriendly, pupName));
        }else{
                System.out.println("Please choose dog or cat");}


    }

    public boolean friendlyDog() {
        while (true){
            System.out.println("Is your dog friendly? (Yes or No)");

            char value = Character.toUpperCase(userInput.next().charAt(0));

            if (value == 'Y'){
                return true;
            }else if (value == 'N'){
                return false;
            }else{
                System.out.println("Invalid choice please try again!!!");
            }
        }
    }

    public int miceformatter(){
        System.out.println("Number of Mice killed?");
        while (true){
            try {
                return Integer.parseInt(userInput.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Please enter a number!!!");
            }
        }
    }

    public void implementAnimal(Talkable pet){
        implementAnimal.add(pet);
    }

    public ArrayList<Talkable> getList(){
        return implementAnimal;
    }
}
