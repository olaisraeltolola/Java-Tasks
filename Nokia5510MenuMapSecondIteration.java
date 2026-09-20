import java.util.Scanner;
	public class Nokia5510MenuMapSecondIteration{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean repeat = true;

int skipLevel = 0;
int skipNestedLevel = 0;

while (repeat){
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

int menuChoice = 0;
if(skipLevel == 0){
	System.out.println(menuFunctions);
	menuChoice = input.nextInt();
} else {
	menuChoice = skipLevel; }
		
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

0. Back

""";

		skipLevel = 0;
		System.out.println(phonebookMenu);
		int functionsUnderPhonebookMenu = input.nextInt();

			switch(functionsUnderPhonebookMenu){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
			case 6 -> {repeat = false;}
			case 7 -> {repeat = false;}
			case 8 -> {repeat = false;}
			case 10 -> {repeat = false;}
			case 11 -> {repeat = false;}

			case 9 -> {
		String optionsMenu = """

--OPTIONS--
Press

1. Memory in use
2. Type of view
3. Memory status  

0. Back
""";

		System.out.println(optionsMenu);
		int functionsUnderOptions = input.nextInt();

			switch(functionsUnderOptions){
			case 0 -> {skipLevel = 1;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
}


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

0. Back

""";
		skipLevel = 0;
int functionsUnderMessageMenu = 0;
if (skipNestedLevel == 0){
	System.out.println(messageMenu);
	functionsUnderMessageMenu = input.nextInt();
} else {
	functionsUnderMessageMenu = skipNestedLevel;}
			switch(functionsUnderMessageMenu){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
			case 6 -> {repeat = false;}
			case 8 -> {repeat = false;}
			case 9 -> {repeat = false;}
			case 10 -> {repeat = false;}

			case 7 -> {
String messageSettingsMenu = """

--MESSAGE SETTINGS--
Press

1. Set 1
2. Common

0. Back
""";
		skipNestedLevel = 0;
		System.out.println(messageSettingsMenu);
		int optionsUnderMessageSettingsMenu = input.nextInt();

			switch(optionsUnderMessageSettingsMenu){
			case 0 -> {skipLevel = 2;}
			case 1 -> {
String optionsUnderSet1 = """

--SET 1--
Press

1. Message centre number
2. Messages sent as
3. Message validity

0. Back

""";

		System.out.println(optionsUnderSet1);
		int functionsUnderSet1 = input.nextInt();

			switch(functionsUnderSet1){
			case 0 -> {skipNestedLevel = 7;
				skipLevel = 2;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
}
}

			case 2 -> {
String optionsUnderCommon = """

--COMMON--
Press
 
1. Delivery reports
2. Reply via same centre
3. Character support

0. Back
""";

		System.out.println(optionsUnderCommon);
		int functionsUnderCommon = input.nextInt();

			switch(functionsUnderCommon){
			case 0 -> {skipNestedLevel = 7;
				skipLevel = 2;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}

}


}
			}
		}
	}

}


	case 3 -> {System.out.println("Welcome to Chat");
			repeat = false;}


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

0. Back

""";
		skipLevel = 0;
		System.out.println(callRegisterMenu);
		int functionsUnderCallRegisterMenu = input.nextInt();

			switch(functionsUnderCallRegisterMenu){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 8 -> {repeat = false;}
			

			case 5 -> {
String optionsUnderCallDuration = """

--CALL DURATION--
Press
1. Last call duration
2. All calls' duration
3. Received calls' duration
4. Dialled calls' duration
5. Clear timers

0. Back

""";

		System.out.println(optionsUnderCallDuration);
		int functionsUnderCallDuration = input.nextInt();

			switch(functionsUnderCallDuration){
			case 0 -> {skipLevel = 4;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
}
}

			case 6 -> {
String optionsUnderCallCosts = """

--CALL COSTS--
Press
1. Last call cost
2. All calls' cost
3. Clear counters

0. Back

""";

		System.out.println(optionsUnderCallCosts);			
		int functionsUnderCallCosts = input.nextInt();

			switch(functionsUnderCallCosts){
			case 0 -> {skipLevel = 4;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
	}

}

			case 7 -> {
String optionsUnderCallCostSettings = """

--CALL COST SETTINGS--
Press
1. Call cost limit
2. Show costs in

0. Back

""";

		System.out.println(optionsUnderCallCostSettings);		
		int functionsUnderCallCostSettings = input.nextInt();

			switch(functionsUnderCallCostSettings){
			case 0 -> {skipLevel = 4;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
		}

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

0. Back

""";

		System.out.println(tonesMenu);	
		int optionsUnderTones = input.nextInt();

			switch(optionsUnderTones){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
			case 6 -> {repeat = false;}
			case 7 -> {repeat = false;}
			case 8 -> {repeat = false;}
}

}
	case 6 -> {
String settingsMenu = """

--SETTINGS--
Press

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings

0. Back
""";
		skipLevel = 0;
		System.out.println(settingsMenu);	
		int functionsUnderSettingsMenu = input.nextInt();

			switch(functionsUnderSettingsMenu){
				case 0 -> {break;}
				case 4 -> {repeat = false;}
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

0. Back

""";

		System.out.println(optionsUnderCallSettings);
		int functionsUnderCallSettings = input.nextInt();

			switch(functionsUnderCallSettings){
				case 0 -> {skipLevel = 6;}
				case 1 -> {repeat = false;}
				case 2 -> {repeat = false;}
				case 3 -> {repeat = false;}
				case 4 -> {repeat = false;}
				case 5 -> {repeat = false;}
				case 6 -> {repeat = false;}
}
			

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

0. Back

""";

		System.out.println(optionsUnderPhoneSettings);	
		int functionsUnderPhoneSettings = input.nextInt();

			switch(functionsUnderPhoneSettings){
			case 0 -> {skipLevel = 6;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
}
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

0. Back
""";

		System.out.println(optionsUnderSecuritySettings);	
		int functionsUnderSecuritySettings = input.nextInt();

			switch(functionsUnderSecuritySettings){
			case 0 -> {skipLevel = 6;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
			case 6 -> {repeat = false;}
}

}

	}

}
	case 7 -> {System.out.println("Welcome to Call divert");
			repeat = false;}
	case 8 -> {
String musicMenu = """

--MUSIC--
Press

1. Music player
2. Radio
3. Recorder
4. Track list

0. Back

""";
	
		System.out.println(musicMenu);	
		int optionsUnderMusic = input.nextInt();

			switch(optionsUnderMusic){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}

}

}
	case 9 -> {System.out.println("Welcome to Games");
			repeat = false;}
	case 10 -> {System.out.println("Welcome to Calculator");
			repeat = false;}
	case 11 -> {System.out.println("Welcome to Reminders");
			repeat = false;}
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

0. Back

""";
	
		System.out.println(clockMenu);	
		int optionsUnderClock = input.nextInt();

			switch(optionsUnderClock){
			case 0 -> {break;}
			case 1 -> {repeat = false;}
			case 2 -> {repeat = false;}
			case 3 -> {repeat = false;}
			case 4 -> {repeat = false;}
			case 5 -> {repeat = false;}
			case 6-> {repeat = false;}
}
}
	case 13 -> {System.out.println("Welcome to Profiles");
			repeat = false;}
	case 14 -> {System.out.println("Welcome to Services");
			repeat = false;}
	case 15 -> {System.out.println("Welcome to SIM Services");
			repeat = false;}






			}
		}
	}
}