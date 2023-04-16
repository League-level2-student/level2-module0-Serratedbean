package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot [] myArray = new Robot[5];
		boolean win = false;
		//makes the robots and puts them in starting position
		
		for (int i=0; i<5; i++)
		{
			myArray[i] = new Robot();
			
			myArray[i].moveTo(i*100 + 50, 600);
			
		}
		
		//makes the robots move a random amount
		//while loop keeps the robots moving
		for (int i=0; i<5; i++)
		{
			myArray[0].setSpeed(1000);
			myArray[1].setSpeed(1000);
			myArray[2].setSpeed(1000);
			myArray[3].setSpeed(1000);
			myArray[4].setSpeed(1000);
		
			//while loop keeps the robots moving
			
			while (!win) 
		{
			for (int s=0; s<5; s++)
			{
				if(myArray[s].getY() <= 300)
				{
					System.out.println("robot" + s + " won!");
					win = true;
					
				}
				
				Random R = new Random();
				R.nextInt(50);
				
				myArray[s].move(R.nextInt(50));
				


			}
			
		}
		}
		
		

		
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
