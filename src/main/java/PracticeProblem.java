/**
	* File: Practice problem 4.5 - Nested Loops
	* Author: Alfred Yang
	* Date Created: April 16, 2026
	* Date Last Modified: April 16, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(multiplicationTable(5));

	}

	public static String triangle(int buh){
		String rows = "";
		String stars = "";
		for (int chum = 0; chum < buh; chum++){
			
				stars += "*";
				rows += stars + "\n";
			

		}
		return rows;
	}

	public static String pyramid(int buh){
		String rows = "";
		String stars = "";
		String spacer = "";
		String space = "";
		for (int chum = 0; chum < buh; chum++){
			space = "";
			for (int rum = buh-chum; rum > 1; rum--){
				System.out.println(buh);
				space += " ";
			}

			spacer = space;
			stars += "* ";
			rows += space + stars.trim() + "\n";

			

		}
		return rows;
	}

	public static String multiplicationTable(int buh){
		String multiertaber = "";
		String multitablest = "";

		if (buh == 0){
			return "";
		}

		int num = 0;
		for (int chum = 0; chum < buh; chum++){

			for (int idk = 0; idk<buh; idk++){
				num = 0;
				num = (chum+1)*(idk+1);
				multitablest += " " + num;

			}
			multiertaber += multitablest.trim();
			multiertaber += "\n";
			multitablest = "";
			
		}
		System.out.println(multiertaber);
		return multiertaber.trim() + "\n";

	

}}
