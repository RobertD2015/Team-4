// TEAM 4
// Brad Adams, Robert Deetz, Ryan Volino
// brad.adams001@umb.edu
// usmcdeetz@gmail.com
// ryan.volino@gmail.com
// CS114
// Assignment 5
// Question 4

package q4;


public class SnakeGame {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("---  S N A K E   G A M E  ---");
		System.out.println("-----------------------------");
		System.out.println("To Enter a Command:");
		System.out.println("Type a single digit (distance), ");
		System.out.println("followed by a letter.");
		System.out.println("A <-");
		System.out.println("D ->");
		System.out.println("W UP");
		System.out.println("S DOWN");

		String header;
		String footer;
		String command;
		int points = 5;

		Snake2 snake = new Snake2();
		Board board = new Board();
		
		// Outer Loop
		while (points > 0) {
			header = "Points to Eat: " + points;
			footer = "Enter Command (Ex. 2A): ";
	
			Food food = new Food();
			
			// Layout Board
			// Initialize with empty space.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					board.cells[i][j] = ' ';
				}
			}
			
			// Place Snake.
			board.cells[snake.y][snake.x] = '|';
			
			// Place Food.
			board.cells[food.y][food.x] = 'o';
			
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println(header);
			
			// Print Board.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					System.out.print(board.cells[i][j]);
				}
				System.out.println();
			}
			System.out.print(footer);
			
			System.out.println();
			
			snake.move();
			
			if (snake.x == food.x && snake.y == food.y) {
				System.out.print("Food Eaten!");
				points--;
			}
		
				
		}

	}

}
