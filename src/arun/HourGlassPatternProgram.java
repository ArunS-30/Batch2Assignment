package arun;

public class HourGlassPatternProgram {

	public static void main(String[] args) {

		int input = 5;
		int spaceCount = 0;

		for (int i = input; i != 0; i--) {
			spaceCount = printPattern(spaceCount, i, "INCRENMENT");
		}
		for (int i = 2; i <= input; i++) {
			spaceCount = printPattern(spaceCount, i, "DECREMENT");
		}
	}

	private static int printPattern(int spaceCount, int rowLength, String stratergy) {
		if (rowLength % 2 == 0) {
			if (stratergy.equals("INCRENMENT")) {
				spaceCount++;
			} else {
				spaceCount--;
			}
		} else {
			System.out.println();
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= rowLength; k++) {
				System.out.print("* ");
			}
		}

		return spaceCount;
	}
}
//-0
// Scanner scanner = new Scanner(System.in);
// System.out.println("Please Enter the Number: ");
// int number = scanner.nextInt();
// for(int i=1; i<=number; i++){
// if(i % 2 == 0){
// continue;
// }
// for(int j=1; j<=number*2-1; j++){
// if(i<=j && j+j<=number*2)
// System.out.print("* ");
// // System.out.print((char)(73+j)+" ");
// else
// System.out.print(" ");
// }
// System.out.println();
// }
// for(int i=2; i<=number; i++){
// if(i % 2 == 0){
// continue;
// }
// for(int j=1; j<=number*2-1; j++){
// if(i+j>=number+1 && j-1<=number-1)
// System.out.print("* ");
// //System.out.print((char)(73+j)+" ");
// else
// System.out.print(" ");
// }
// System.out.println();
// }
// scanner.close();
