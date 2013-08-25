import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
/* Head ends here */
static void displayPathtoPrincess(int n, String [] grid){
	String[] moves = new String[4];
	int marioRow = 0;
	Boolean marioFound = false;
	int peachRow = 0;
	Boolean peachFound = false;

	moves[0] = "LEFT";
	moves[1] = "UP";
	moves[2] = "RIGHT";
	moves[3] = "DOWN";
	System.out.println("");
	System.out.println("You said the room looked like this:");
	
	for (int i = 0;i <grid.length; i++ ) {
		System.out.println(grid[i]);
	}
	
	System.out.println("");
	for (int i = 0;i <grid.length; i++ ) {
		grid[i] = grid[i].toLowerCase();
		if (grid[i].indexOf('p') > 0){
			peachRow = i+1;
			System.out.println("Peach is in row: " + peachRow);
			peachFound = true;
		}
		if (grid[i].indexOf('m') > 0){
			marioRow = i+1;
			System.out.println("Mario is in row: " + marioRow);
			marioFound = true;
		}
	}
	if(marioFound && peachFound ){
		System.out.println("This is how you save Peach:");
		if (peachRow == marioRow) {
			System.out.println("Easy, you guys are so close"); 
		}
		else{
			System.out.println("Let's get started!"); 
		}
	}
	else{
		System.out.println("Sorry, Bowser took Peach to a different castle . . .");	
	}
  }

/* Tail starts here */
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}