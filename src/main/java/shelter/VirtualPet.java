package shelter;

public class VirtualPet {
    private String petName;
    private String petDescription;
    private String userChoice = "";
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;



    public String getPetName() {
        return petName;
    }
public String getPetDescription() {
        return petDescription;
}
    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public String getPetStats() {
        return getPetName() + "   |\t" + getHungerLevel() + "  |\t" + getThirstLevel() + "  |\t" + getBoredomLevel();
    }

    @Override
    public String toString() {
        return "\n" + "\t" + getPetName() + "\t" + getHungerLevel() + "\t" + getThirstLevel() + "\t" + getBoredomLevel();
    }

    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;
    }

    public void feed() {
        hungerLevel -= 15;
        thirstLevel += 5;
        boredomLevel -= 5;
    }

    public void feedOnePet(VirtualPet pet) {
        pet.hungerLevel -= 15;
        pet.thirstLevel += 5;
        pet.boredomLevel -= 5;

    }

    public void water() {
        hungerLevel -= 7;
        thirstLevel -= 15;
        boredomLevel -= 5;
    }

    public void waterOnePet(VirtualPet pet) {
        hungerLevel -= 7;
        thirstLevel -= 15;
        boredomLevel -= 5;
    }
    public void playWithPetOutsideItsCage(VirtualPet pet){
        hungerLevel += 7;
        thirstLevel += 3;
        boredomLevel -= 15;

    }

    public VirtualPet(String petName, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;

    }

}


