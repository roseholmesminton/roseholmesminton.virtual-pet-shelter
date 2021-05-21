package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Sweet Pea","The Crown Prince of Demonia" ,30,30, 30);
        pet2 = new VirtualPet("Popeye","He's Popeye the Sailor Man", 50,50,50);
    }
    @Test
    public void shouldBeAbleToAddOnePet(){
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("Sweet Pea");
        assertThat(retrievedPet, is(pet1));
    }
    @Test
    public void shouldBeAbleToAddTwoPets() {
        underTest.add(pet1);
        underTest.add(pet2);
        Collection<VirtualPet> allVirtualPets = underTest.getAllVirtualPets();
        assertThat(allVirtualPets, containsInAnyOrder(pet1, pet2));
    }
    @Test
    public void shouldBeAbleToRemoveAPet() {
        underTest.add(pet1);
        underTest.remove(pet1);
        VirtualPet retrievedAccount = underTest.findPet("Swee'Pea");
        assertEquals(retrievedAccount, null);
    }
}
