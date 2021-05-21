# Virtual Pet Shelter
I used TDD to begin building this program. The advantage to using TDD is that it helped me to quickly place the appropriate methods in the appropriate classes. The constructor for the Virtual Pet and all it's attributes were created in the VirtualPet Class and the Array List was contructed in the Virtual Pet Shelter class.
After constructing my VirtualPet in the Virtual Pet Class I had to create and test 4 methods. 
1 Add a pet 
2 Add 2 pets
3 Remove a pet

The add a pet method would be used to add the original pets to the ArrayList and also would be used in the VirtualPetShelterApp.
During the TDD I was able to test adding one and then two pets. In addition. I was able to test removing a pet which would be used to  adopt a pet in the VirtualPetShelterApp

When I constructed my Virtual Pet Class I had 3 attributes that were changed after each user interaction. (Known as the tick).
Hunger
Thirst
Boredom

I decided that when the pets were fed Hunger would decrease by 15 and Thirst would increase by 5 and Boredom would decrease by 5.
After a task was completed a tick would add 5 to Hunger, Thirst and Boredom.

I used a while loop to run the game. However, before the person could play the game they are prompted to enter their name. The user is given the status of each animal in the shelter.
The user can then decide what to do from a list of options.

The user exits the loop when they select the option to quit or if they enter invalid text. If the user enters invalid text such as a non-existent menu item number, they are told the pet shelter
caught on fire, and the game is over. 

If the user enters the wrong name for the menu options: adopt or play with a pet, they are told that there is no pet by that name in the pet shelter.

The user is also able to play with one pet. The user can feed, water and take that one pet out of its cage. Each time the user feeds, waters and plays with the pet, that one pet's Hunger, Thirst and Boredom are affected.

The user can play with the one pet as much as it wants and once the user is finished playing with the one pet they are returned to the main menu, all the pets are given one tick, and the user can continue to 
work with all the pets in the pet shelter.

If I had more time...I would check the status of the pets and if their stats did not meet a certain threshold, warn the user.