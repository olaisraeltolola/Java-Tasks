import java.util.Scanner;
	public class Nokia5510MenuMapFirstIteration{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

String menuFunctions = """ 


Welcome to the Nokia 5510 phone

To access any of the menu functions: 

Press 

1. Phonebook
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music
9. Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services
15. SIM Services 


 """;



System.out.println(menuFunctions);
int menuChoice = input.nextInt();

		
	switch(menuChoice){
	case 1 -> {

String phonebookMenu = """

--PHONEBOOK--
Press

1. Search
2. Service Nos.
3. Add name
4. Erase
5. Edit
6. Copy
7. Assign Tone
8. Send b'card
9. Options
10. Speed dials
11. Voice tags 


""";


		System.out.println(phonebookMenu);
		int functionsUnderPhonebookMenu = input.nextInt();

			switch(functionsUnderPhonebookMenu){
			case 9 -> {
		String optionsMenu = """

--OPTIONS--
Press

1. Memory in use
2. Type of view
3. Memory status  

""";

		System.out.println(optionsMenu);

		}
	}
}





	case 2 -> {
String messageMenu = """

--MESSAGES--
Press 

1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Serve command editor

""";

		System.out.println(messageMenu);
		int functionsUnderMessageMenu = input.nextInt();

			switch(functionsUnderMessageMenu){
			case 7 -> {
String messageSettingsMenu = """

--MESSAGE SETTINGS--
Press

1. Set 1
2. Common

""";

		System.out.println(messageSettingsMenu);
		int optionsUnderMessageSettingsMenu = input.nextInt();

			switch(optionsUnderMessageSettingsMenu){
			case 1 -> {
String optionsUnderSet1 = """

--SET 1--
Press

1. Message centre number
2. Messages sent as
3. Message validity

""";

		System.out.println(optionsUnderSet1);
}

			case 2 -> {
String optionsUnderCommon = """

--COMMON--
Press
 
1. Delivery reports
2. Reply via same centre
3. Character support

""";

		System.out.println(optionsUnderCommon);

}
			}
		}
	}

}


	case 3 -> {System.out.println("Welcome to Chat");}


	case 4 -> {
String callRegisterMenu = """

--CALL REGISTER--
Press

1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit

""";

		System.out.println(callRegisterMenu);
		int functionsUnderCallRegisterMenu = input.nextInt();

			switch(functionsUnderCallRegisterMenu){
			case 5 -> {
String optionsUnderCallDuration = """

--CALL DURATION--
Press
1. Last call duration
2. All calls' duration
3. Received calls' duration
4. Dialled calls' duration
5. Clear timers

""";

		System.out.println(optionsUnderCallDuration);		
}

			case 6 -> {
String optionsUnderCallCosts = """

--CALL COSTS--
Press
1. Last call cost
2. All calls' cost
3. Clear counters

""";

		System.out.println(optionsUnderCallCosts);		

}

			case 7 -> {
String optionsUnderCallCostSettings = """

--CALL COST SETTINGS--
Press
1. Call cost limit
2. Show costs in

""";

		System.out.println(optionsUnderCallCostSettings);		

}	
	}


}
	case 5 -> {
String tonesMenu = """

--TONES--
Press

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Message alert tone
5. Keypad tones
6. Warning tones
7. Vibrating alert
8. Screen saver

""";

		System.out.println(tonesMenu);	

}
	case 6 -> {
String settingsMenu = """

--SETTINGS--
Press

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings

""";

		System.out.println(settingsMenu);	
		int functionsUnderSettingsMenu = input.nextInt();

			switch(functionsUnderSettingsMenu){
			case 1 -> {
String optionsUnderCallSettings = """

--CALL SETTINGS--
Press

1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer

""";

		System.out.println(optionsUnderCallSettings);	

}

			case 2 -> {
String optionsUnderPhoneSettings = """

--PHONE SETTINGS--
Press

1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Confirm SIM service actions

""";

		System.out.println(optionsUnderPhoneSettings);	

}

			case 3 -> {
String optionsUnderSecuritySettings = """

--SECURITY SETTINGS--
Press

1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Security level
6. Change access codes

""";

		System.out.println(optionsUnderSecuritySettings);	

}

	}

}
	case 7 -> {System.out.println("Welcome to Call divert");}
	case 8 -> {
String musicMenu = """

--MUSIC--
Press

1. Music player
2. Radio
3. Recorder
4. Track list

""";

		System.out.println(musicMenu);	

}
	case 9 -> {System.out.println("Welcome to Games");}
	case 10 -> {System.out.println("Welcome to Calculator");}
	case 11 -> {System.out.println("Welcome to Reminders");}
	case 12 -> {
String clockMenu = """

--CLOCK--
Press

1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time

""";

		System.out.println(clockMenu);	

}
	case 13 -> {System.out.println("Welcome to Profiles");}
	case 14 -> {System.out.println("Welcome to Services");}
	case 15 -> {System.out.println("Welcome to SIM Services");}






		}
	}
}