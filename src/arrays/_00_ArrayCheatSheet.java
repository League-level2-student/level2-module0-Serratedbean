package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] myArray = new String[10];
		myArray[2]="akaaaa";
		//2. print the third element in the array
		System.out.println("third:" + myArray[2]);
		//3. set the third element to a different value
		
		//4. print the third element again
		System.out.println("third:" + myArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i<5; i++)
		{
			myArray[i] = "i = " + i;
			
			
		}
		int index= 200;
		int b = 200;
		//6. make an array of 50 integers
		int [] myAIR = new int[5];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0; i<5; i++)
		{
			int num = (int)(Math.random()*50);
			myAIR[i] = num;
			
			if (i==0)
			{
				System.out.println("" + myAIR[i]);
			}
			

		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int s=0; s<5; s++)
		{
	
		if (b > myAIR[s] )
		{
			b = myAIR[s];
			index = s;
		}
			
		}
		System.out.println(myAIR[index] + "LLOOOOK");
		//9 print the entire array to see if step 8 was correct
		for (int f=0; f<5; f++)
		{

			System.out.println(myAIR[f] + " this");
			

		}
		//10. print the largest number in the array.
		int big_number = 0;
		int array_footnote = 0;
		
		for (int s=0; s<5; s++)
		{
	
		if (big_number < myAIR[s] )
		{
			big_number = myAIR[s];
			array_footnote = s;
		}
		
		}
		System.out.println(myAIR[array_footnote] + "LLOOOOK");
	}

	
}
