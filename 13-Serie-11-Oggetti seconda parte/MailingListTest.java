class User {
	String userName;
	String mail;

	User(String userName, String mail) {
		this.userName = userName;
		this.mail = mail;
	}

	void show() {
		System.out.println(userName + ", " + mail);
	}

	boolean isTheSame(User otherUser) {
		if (this == otherUser)
			// Same object
			return true;
		if (otherUser == null)
			// This object cannot be null, otherwise we could not have executed this method
			return false;
		if (userName == null) {
			if (otherUser.userName != null)
				return false;
		} else if (!userName.equals(otherUser.userName))
			return false;
		if (mail == null) {
			if (otherUser.mail != null)
				return false;
		} else if (!mail.equals(otherUser.mail))
			return false;
		return true;
	}
}

class MailingList {
	String description;
	int numberOfMembers;
	User[] members;

	MailingList(int maximumNumberOfMembers, String description) {
		if (maximumNumberOfMembers <= 0) {
			maximumNumberOfMembers = 10;
		}

		members = new User[maximumNumberOfMembers];
		this.description = description;
	}

	boolean addMember(User newMember) {
		if (newMember != null && numberOfMembers < members.length) {
			members[numberOfMembers] = newMember;
			numberOfMembers++;
			return true;
		}
		return false;
	}

	void show() {
		System.out.println(description);
		for (int i = 0; i < numberOfMembers; i++) {
			members[i].show();
		}
		System.out.println();
	}

	int countCommonMembers(MailingList otherMailingList) {
		if (otherMailingList == null) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < numberOfMembers; i++) {
			for (int j = 0; j < otherMailingList.numberOfMembers; j++) {
				if (members[i].isTheSame(otherMailingList.members[j])) {
					count++;
				}
			}
		}
		return count;
	}
}

public class MailingListTest {

	// convenient method of creating a user using the username as the first part of
	// the mail
	static User createUser(String userName, String mailDomain) {
		return new User(userName, userName + "@" + mailDomain);
	}

	// convenient method to add a new member to the mailing list and print an error
	// message if this is not possible
	static void addMemberWithPrintError(User user, MailingList mailingList) {
		if (user == null || mailingList == null) {
			return;
		}

		System.out.print("Try to add user ");
		user.show();
		if (!mailingList.addMember(user)) {
			System.out.println("Impossible to add new member to " + mailingList.description);
		}
	}

	public static void main(String[] args) {
		User[] users = new User[10];
		users[0] = createUser("giovanni", "supsi.ch");
		users[1] = createUser("roberto", "supsi.ch");
		users[2] = createUser("nicholas", "supsi.ch");
		users[3] = createUser("elvis", "supsi.ch");
		users[4] = createUser("sandro", "gmail.com");
		users[5] = createUser("tiziano", "gmail.com");
		users[6] = createUser("mariangela", "gmail.com");
		users[7] = createUser("andrea", "gmail.com");
		users[8] = createUser("amos", "gmail.com");
		users[9] = createUser("giacomo", "gmail.com");

		MailingList mathMailingList = new MailingList(4, "Math mailing list");
		MailingList programmingMailingList = new MailingList(15, "Programming mailing list");

		System.out.println("Add some members");
		for (int i = 0; i < users.length; i++) {
			if (i % 2 == 0) {
				addMemberWithPrintError(users[i], mathMailingList);
			} else {
				addMemberWithPrintError(users[i], programmingMailingList);
			}
		}

		System.out.println("\nShow mailing lists");
		mathMailingList.show();
		programmingMailingList.show();

		System.out.println("\nNumber of common members: " + mathMailingList.countCommonMembers(programmingMailingList));

		System.out.println("\nAdd some common members");
		addMemberWithPrintError(createUser("giovanni", "supsi.ch"), programmingMailingList);
		addMemberWithPrintError(mathMailingList.members[1], programmingMailingList);

		System.out.println("\nNumber of common members: " + mathMailingList.countCommonMembers(programmingMailingList));
	}
}