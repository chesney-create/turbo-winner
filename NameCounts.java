package week4;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {

	public void run() {
		AskForNames();
		returnAnswer();
	}

	private void AskForNames() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals(""))
				break;
			if (name.contains(name) == false) {
				String addOne;
				name.put(name) addOne);

			} else {
				int addOne = NameCounts.get(name) + 1;
				NameCounts.put(name, addOne);

			}

		}

	}

	private void name(week4.put put, Object addOne) {
		// TODO Auto-generated method stub
		
	}

	private static void put(String name, int addOne) {
		// TODO Auto-generated method stub
		
	}

	private static int get(String name) {
		// TODO Auto-generated method stub
		return 0;
		
	}

	private void returnAnswer() {
		for(String name: getName().keySet()) {
			println("Entry["+ name + "] has count " + name.get(name));
			
		}
	