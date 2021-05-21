package shelter;

import java.util.Scanner;


public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userChoice;
        String userName;
        boolean keepPlaying = true;

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("Sweet Pea", "The Crown Prince of Demonia", 30, 30, 30);
        VirtualPet pet2 = new VirtualPet("Ham Gravy", "Olive Oyl's' First True Love",32, 32, 32);
        VirtualPet pet3 = new VirtualPet("Olive Oyl", "Popeye's Sweet Patootie", 52, 42, 32);
        VirtualPet pet4 = new VirtualPet("Professor", "The Inventor of Vitamin V", 23, 38, 28);

        myVirtualPetShelter.add(pet1);
        myVirtualPetShelter.add(pet2);
        myVirtualPetShelter.add(pet3);
        myVirtualPetShelter.add(pet4);

        System.out.println("Thank you for volunteering at The Little Shop of Hamsters Pet Shelter!  Please enter your first name:");
        userName = input.nextLine();
        System.out.println("Welcome " + userName + "! Here's  the status of your pets:" + "\n");
        System.out.println("   A; ;A");
        System.out.println("  ={ t.}= )~");
        System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
        System.out.println("------------|-------|-------|-------");
        myVirtualPetShelter.showPets();

        while (keepPlaying) {
            System.out.println("\n" + "What would you like to do?" + "\n");
            System.out.println("1. Feed the pets" + "\n" + "2. Water the pets" + "\n" + "3. Play with a pet" + "\n" + "4. Adopt a pet" + "\n" + "5. Admit a pet" + "\n" + "6. Quit");
            userChoice = input.nextLine();
            if (userChoice.equals("1")) {
                myVirtualPetShelter.feed();
                System.out.println("You fed the pets");
                System.out.println("Here's the status of your pets:");

            } else if (userChoice.equals("2")) {
                myVirtualPetShelter.water();
                System.out.println("You watered the pets");
                System.out.println("Here's the status of your pets:");

            } else if (userChoice.equals("3")) {
                System.out.println("Enter the name of the pet you wish to play with");
                Scanner inputPlayWithOnePet = new Scanner(System.in);
                String playWithOnePetName = inputPlayWithOnePet.nextLine();
                if (myVirtualPetShelter.pets.containsValue(myVirtualPetShelter.findPet(playWithOnePetName))) {
                    myVirtualPetShelter.playWithOnePet(myVirtualPetShelter.findPet(playWithOnePetName));
                } else {
                    System.out.println("Sorry, we do not have a pet by that name in the pet shelter" + "\n");
                }

            } else if (userChoice.equals("4")) {
                System.out.println("Enter the name of the pet you wish to adopt");
                String petName = input.nextLine();
                if (myVirtualPetShelter.pets.containsValue(myVirtualPetShelter.findPet(petName))) {
                    myVirtualPetShelter.remove(myVirtualPetShelter.findPet(petName));
                } else {
                    System.out.println("Sorry, we do not have a pet by that name in the pet shelter" + "\n");
                }

            } else if (userChoice.equals("5")) {
                System.out.println("Enter the Name of the pet you wish to admit");
                String userPetName = input.nextLine();
                System.out.println("Enter the Description of the pet you wish to admit");
                String userPetDescription = input.nextLine();
                VirtualPet admitAPet = new VirtualPet(userPetName, userPetDescription,50, 50, 50);
                myVirtualPetShelter.add(admitAPet);
                System.out.println("You just admitted " + userPetName + " to The Little Shop of Hamsters Pet Shelter." + "\n");
                System.out.println("Here's the status of your pets:");

            } else if (userChoice.equals("6")) {
                System.out.println("Thank you " + userName + " for helping out today!");
                keepPlaying = false;
                System.exit(0);

            } else {
                System.out.println("Oh no " + userName + "! The pet shelter caught on fire! Game over.");
                System.exit(0);
            }
            myVirtualPetShelter.tick();

            System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
            System.out.println("------------|-------|-------|-------");
            myVirtualPetShelter.showPets();
        }

        input.close();
    }
}



