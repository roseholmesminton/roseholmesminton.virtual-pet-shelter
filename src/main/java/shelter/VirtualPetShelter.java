package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet petToAdd) {
        pets.put(petToAdd.getPetName(), petToAdd);
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public Collection<VirtualPet> getAllVirtualPets() {
        return pets.values();
    }

    public void remove(VirtualPet pet) {
        System.out.println("Congratulations! You adopted " + pet.getPetName() + ". " + pet.getPetDescription() + "\n");
        pets.remove(pet.getPetName(), pet);
        System.out.println("Here's  the status of your pets:");
    }

    public void showPets() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getPetStats());
        }
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }

    }

    public void feed() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void water() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithOnePet(VirtualPet pet) {
        Scanner inputPlayWithOnePet = new Scanner(System.in);
        System.out.println("You are now playing with " + pet.getPetName());
        System.out.println("Here is " + pet.getPetName() + "'s status");
        System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
        System.out.println(pet.getPetStats());

        boolean keepPlayingWithOnePet = true;
        while (keepPlayingWithOnePet) {
            System.out.println("\n" + "What would you like to do with " + pet.getPetName() + "?" + "\n");
            System.out.println("1. Feed " + pet.getPetName() + "\n" + "2. Water " + pet.getPetName() + "\n" + "3. Take " + pet.getPetName() + " out of it's cage." + "\n" + "4. Go back to working with all the hamsters.");
            String userPlayWithOnePetChoice = inputPlayWithOnePet.nextLine();
            System.out.println(userPlayWithOnePetChoice);

            if (userPlayWithOnePetChoice.equals("1")) {
                pet.feedOnePet(findPet(pet.getPetName()));
                System.out.println("You fed " + pet.getPetName());
                System.out.println("Here is " + pet.getPetName() + "'s status");
                System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
                System.out.println(pet.getPetStats());

            } else if (userPlayWithOnePetChoice.equals("2")) {
                pet.waterOnePet(findPet(pet.getPetName()));
                System.out.println("You watered " + pet.getPetName());
                System.out.println("Here is " + pet.getPetName() + "'s status");
                System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
                System.out.println(pet.getPetStats());

            } else if (userPlayWithOnePetChoice.equals("3")) {
                pet.playWithPetOutsideItsCage(findPet(pet.getPetName()));
                System.out.println("You took " + pet.getPetName() + " out of its cage. " + pet.getPetName() + " is having fun!");

                System.out.println("Here is " + pet.getPetName() + "'s status");
                System.out.println("Name" + "\t" + "\t" + "|" + "Hunger" + "\t" + "|" + "Thirst" + "\t" + "|" + "Boredom");
                System.out.println(pet.getPetStats());

            } else if (userPlayWithOnePetChoice.equals("4")) {
                System.out.println("Play time over! Thank you for giving " + pet.getPetName() + " special attention." + "\n");
                System.out.println("Here's  the status of all the pets in the pet shelter:");
                keepPlayingWithOnePet = false;

            }
        }
    }
}
