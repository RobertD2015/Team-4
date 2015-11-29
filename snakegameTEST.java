import java.util.Scanner;

public class Snake {
	public int x;
	public int y;

	public Snake() {
		x = (int)(Math.random() * 10);
		y = (int)(Math.random() * 5);
	}

	public void move() {
		Scanner input = new Scanner(System.in);
		// Obtain new coordinates and make sure they are in range.
		int newX = -1, newY = -1;
		while (newX < 0 || newX > 9 || newY < 0 || newY > 4) {

			String command = input.nextLine();
			command = command.toUpperCase();
			// Validate command.
			while (!command.matches("[0-9][ASDW]")) {
				System.out.print("Invalid Command, Please Reenter: ");
				command = input.nextLine();
				command = command.toUpperCase();
			}
			char dist = command.charAt(0);
			int distance = Character.getNumericValue(dist);
			char direction = command.charAt(1);
			char snakedirection = '\u2191';;
			//System.out.println("Distance: " + distance + direction);
			switch (direction) {
				case 'A':
					// Left
					newX = x - distance;
					newY = y;
		//trying to get the arrow to change the direction its pointing 
		//depending on what the input was. 
					snakedirection = '\u2190';
					break;
				case 'D':
					// Right
					newX = x + distance;
					newY = y;
					snakedirection = '\u2192';
					break;
				case 'W':
					// Up
					newX = x;
					newY = y - distance;
					snakedirection = '\u2191';
					break;
				case 'S':
					// Down
					newX = x;
					newY = y + distance;
					snakedirection = '\u2193';
					break;

			}
		}


		x = newX;
		y = newY;

	}
}
