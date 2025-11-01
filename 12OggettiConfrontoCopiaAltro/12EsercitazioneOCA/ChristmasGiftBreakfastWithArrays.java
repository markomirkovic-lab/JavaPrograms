import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * Enum for the gifts' colors.
 */
enum Color {
	RED, YELLOW, GREEN, BLACK, BLUE
}

/**
 * Class representing gift.
 */
class Gift {
	Color color;

	Gift(Color color) {
		this.color = color;
	}

	/**
	 * Method to print the gift details.
	 */
	void print() {
		System.out.println(color);
	}
}

/**
 * Class that wraps an array of Gift. It provides some convenience functions.
 */
class GiftArrayWithUtils {
	Gift[] gifts;
	// Counter for the number of gifts in the array
	int giftCounter;

	GiftArrayWithUtils(int numberOfGifts) {
		gifts = numberOfGifts <= 0 ? new Gift[1] : new Gift[numberOfGifts];
	}

	/**
	 * Method to add a gift to the array.
	 * 
	 * @param gift gift to add
	 */
	void add(Gift gift) {
		if (gift == null) {
			return;
		}

		// There is no more place for a new gift
		if (giftCounter == gifts.length) {
			System.out.println("Something is wrong, array is full.");
			return;
		}

		gifts[giftCounter] = gift;
		System.out.println("Gift added");
		giftCounter++;
	}

	/**
	 * Method to check if the array is empty.
	 * 
	 * @return true if there are no gifts in the array, false otherwise
	 */
	boolean isEmpty() {
		return giftCounter == 0;
	}

	/**
	 * Method to check if there is at least one gift in the array.
	 * 
	 * @return true if there is at least one gift in the array, false otherwise
	 */
	boolean thereIsAGift() {
		return !isEmpty();
	}

	/**
	 * Method to retrieve and remove the last gift in the array.
	 * 
	 * @return the last gift in the array
	 */
	Gift getGiftAndRemove() {
		if (giftCounter == 0) {
			return null;
		}

		// "--giftCounter" corresponds to the index of the last gift in the array
		Gift gift = gifts[--giftCounter];
		// Remove the gift from the array
		gifts[giftCounter] = null;
		return gift;
	}

	/**
	 * Method to print the array of gifts.
	 */
	void print() {
		if (isEmpty()) {
			System.out.println("Gift array is empty");
			return;
		}

		for (int i = 0; i < giftCounter; i++) {
			gifts[i].print();
		}
	}
}

/**
 * Class representing a person.
 */
class Person {
	String name;
	// Wrapper of an array of gifts
	GiftArrayWithUtils giftArrayWrapper;

	/**
	 * Constructor for the Person class.
	 * 
	 * @param name      name of the person
	 * @param nrOfGifts number of gift for the person
	 */
	Person(String name, int nrOfGifts) {
		this.name = name;
		giftArrayWrapper = nrOfGifts <= 0 ? new GiftArrayWithUtils(1) : new GiftArrayWithUtils(nrOfGifts);
	}

	/**
	 * Method to print the details of a person (name and gifts).
	 */
	void print() {
		System.out.println(name);
		giftArrayWrapper.print();
		System.out.println();
	}

	/**
	 * Method to add a gift to the person.
	 * 
	 * @param newGift gift to add
	 */
	void receiveGift(Gift newGift) {
		if (newGift == null) {
			return;
		}

		giftArrayWrapper.add(newGift);
	}

	/**
	 * Method for simulating the opening of a gift. This method also removes the
	 * gift from the list.
	 */
	void openGiftAndRemove() {
		if (giftArrayWrapper.thereIsAGift()) {
			Gift giftToOpen = giftArrayWrapper.getGiftAndRemove();
			System.out.print(name + " opens gift ");
			giftToOpen.print();
		}
	}

	/**
	 * Method to check whether a person still has gifts.
	 * 
	 * @return true if the person still has gifts, false otherwise
	 */
	boolean haveMoreGift() {
		return giftArrayWrapper.thereIsAGift();
	}
}

/**
 * Class that wraps an array of Person. It provides some convenience functions.
 */
class PersonArrayWithUtils {
	Person[] persons;
	// Counter for the number of persons in the array
	int personCounter;
	// Index of the person that should open the gift
	int currentPerson;

	PersonArrayWithUtils(int numberOfPersons) {
		persons = numberOfPersons <= 0 ? new Person[1] : new Person[numberOfPersons];
	}

	/**
	 * Method to get the length of the array of persons.
	 * 
	 * @return length of the array of persons
	 */
	int arrayLength() {
		return persons.length;
	}

	/**
	 * Method to add a person to the array.
	 * 
	 * @param person person to add
	 */
	void add(Person person) {
		if (person == null) {
			return;
		}

		if (personCounter == persons.length) {
			// There is no more place for a new person
			System.out.println("Something is wrong, array is full.");
			return;
		}

		System.out.println(person.name + " added");
		persons[personCounter] = person;
		personCounter++;
	}

	/**
	 * Method to check if the array is empty.
	 * 
	 * @return true if the array is empty, false otherwise
	 */
	boolean isEmpty() {
		return personCounter == 0;
	}

	/**
	 * Method to retrieve the person that should open the gift.
	 * 
	 * @return the person that should open the gift
	 */
	Person getCurrentPerson() {
		return persons[currentPerson];
	}

	/**
	 * Method to update the index representing the next person that will open a
	 * gift.
	 */
	void moveNextCircular() {
		currentPerson = ++currentPerson % personCounter;
	}

	/**
	 * Method to remove the person who just opened the last gift. This method also
	 * updates (if needed) the index representing the next person that will open a
	 * gift.
	 */
	void removeCurrentPersonAndUpdateNextPerson() {
		if (personCounter == 0) {
			// There is nothing to be removed
			return;
		}

		// Move the elements in order to avoid the gap
		for (int i = currentPerson; i + 1 < personCounter; i++) {
			persons[i] = persons[i + 1];
		}
		persons[personCounter - 1] = null;

		// Removing from the end of the array
		if (currentPerson == personCounter - 1) {
			// Next person that will open a gift is the first one of the array
			currentPerson = 0;
		}

		personCounter--;
	}

	/**
	 * Method to print the array of persons.
	 */
	void print() {
		if (isEmpty()) {
			System.out.println("Person array is empty");
			return;
		}

		for (int i = 0; i < personCounter; i++) {
			persons[i].print();
		}
	}
}

/**
 * Class that represents the member of the family that are around the table for
 * the breakfast.
 */
class FamilyMembersAtTable {
	PersonArrayWithUtils familyMemberAtTheTable;
	// Point in time of the first person sitting at the table for the breakfast
	Instant firstMembertAtTable = null;
	// Point in time of the last person arriving at the table for the breakfast
	Instant lastMembertAtTable = null;

	FamilyMembersAtTable(int numberOfTotalFamilyMembers) {
		familyMemberAtTheTable = numberOfTotalFamilyMembers <= 0 ? new PersonArrayWithUtils(1)
				: new PersonArrayWithUtils(numberOfTotalFamilyMembers);
	}

	/**
	 * Method to add a person at the breakfast table.
	 * 
	 * @param member person to add at the breakfast table
	 */
	void addPerson(Person member) {
		if (member == null) {
			return;
		}

		if (familyMemberAtTheTable.personCounter == 0) {
			// First member at the table
			firstMembertAtTable = Instant.now();
		}

		if (familyMemberAtTheTable.personCounter == familyMemberAtTheTable.arrayLength() - 1) {
			// Last member at the table
			lastMembertAtTable = Instant.now();
		}

		familyMemberAtTheTable.add(member);
	}

	/**
	 * Method for calculating the time between the first and last person to sit at
	 * the breakfast table.
	 * 
	 * @return time between the first and last person to sit at the breakfast table
	 */
	long getSecondBetweenFirstAndLast() {
		return firstMembertAtTable.until(lastMembertAtTable, ChronoUnit.SECONDS);
	}

}

public class ChristmasGiftBreakfastWithArrays {

	/**
	 * Generate random int in the given range.
	 * 
	 * @param min min of the range (inclusive)
	 * @param max max of the range (inclusive)
	 * @return random int in the range
	 */
	private static int generateIntInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	/**
	 * Generates random colors by choosing from those in the enum.
	 * 
	 * @return random color
	 */
	private static Color getRandomColor() {
		Color[] colors = Color.values();
		int randomColorPosition = generateIntInRange(0, colors.length - 1);
		return colors[randomColorPosition];
	}

	/**
	 * Metod to simulate the time flow.
	 */
	private static void simulateTimeFlow() {
		System.out.println("Time flows ...");
		Instant start = Instant.now();
		long difference = 0;
		while (difference < 1) {
			Instant now = Instant.now();
			difference = start.until(now, ChronoUnit.SECONDS);
		}
	}

	/**
	 * Method to print the current time.
	 */
	private static void printCurrentTime() {
		LocalTime now = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(now.format(timeFormatter));
	}

	public static void main(String[] args) {
		// Set up
		int numberOfFamilyMembers = generateIntInRange(3, 10);
		PersonArrayWithUtils peopleNearFireplace = new PersonArrayWithUtils(numberOfFamilyMembers);
		int familyMembersCounter = numberOfFamilyMembers;

		// For each family member
		while (familyMembersCounter != 0) {
			int numberOfGifts = generateIntInRange(1, 5);
			Person familyMember = new Person("Family member " + familyMembersCounter, numberOfGifts);
			System.out.println("Created " + familyMember.name);

			// Add some gifts
			for (int i = 0; i < numberOfGifts; i++) {
				Gift gift = new Gift(getRandomColor());
				familyMember.receiveGift(gift);
			}

			peopleNearFireplace.add(familyMember);
			familyMembersCounter--;
		}

		System.out.println("\nFamily members:");
		peopleNearFireplace.print();

		FamilyMembersAtTable peopleAtTable = new FamilyMembersAtTable(numberOfFamilyMembers);

		// Loop gift opening
		while (!peopleNearFireplace.isEmpty()) {
			Person currentPerson = peopleNearFireplace.getCurrentPerson();
			currentPerson.openGiftAndRemove();
			simulateTimeFlow();
			// If the person has no more gifts, we remove it from those around the fireplace
			// and add it to those at the breakfast table
			if (!currentPerson.haveMoreGift()) {
				printCurrentTime();
				System.out.println(currentPerson.name + " moves from fireplace to table");
				peopleNearFireplace.removeCurrentPersonAndUpdateNextPerson();
				peopleAtTable.addPerson(currentPerson);
			} else {
				// Update the next person who will open a gift
				peopleNearFireplace.moveNextCircular();
			}

		}

		System.out.println("All family's members are at the table for breakfast");

		System.out.println("Elapsed seconds from first to last member at the table: "
				+ peopleAtTable.getSecondBetweenFirstAndLast());
	}
}