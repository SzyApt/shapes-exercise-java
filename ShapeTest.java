import java.util.Scanner; // needed for the Scanner class 
import java.util.InputMismatchException; //needed for exception handling

public class ShapeTest {
	private static Scanner input = new Scanner(System.in); // initial scanner to be used as input

	public static void main(String[] args) {
		int x = 0; // x coordinate
		int y = 0; // y coordinate
		double h = 0;// height
		double r = 0; // radius
		int selection = 0;
		int numOfShapes = 0;

		while (true) {
			try {
				System.out.printf("Enter the number of shapes:\n");
				while (true) { // check if the number of shapes is valid
					numOfShapes = input.nextInt();
					if (numOfShapes < 0) { // check if the number of shapes is +ve
						System.err.printf("Error: The number of shapes cannot be negative !\n");
						continue; // if not then stay in the loop until it is
					}
					break; // if yes, leave the loop
				}
			} catch (InputMismatchException e) { // catch input which is not a number
				System.err.printf("Exception: Inappropriate type of the input data\n");
				input.nextLine(); // move scanner to the next line
				continue;
			}
			break;
		}

		Shape[] shapes = new Shape[numOfShapes]; // create shapes array to store data

		for (int i = 0; i < numOfShapes; i++) { /* loop the code, until it reaches the number of shapes stated
		by the user */
			System.out.printf("Which shape would you like to create?\n"); // ask the user to select the shape 
			System.out.printf("1. Point\n");
			System.out.printf("2. Circle\n");
			System.out.printf("3. Cylinder\n");

			while (true) {
				try {
					selection = input.nextInt(); // scan option choice
				} catch (InputMismatchException e) { // catch input which is not a number
					System.err.printf("Exception: Inappropriate type of the input data\n"); //if caught display error
					input.nextLine();
					continue;
				}
				break;
			}

			switch (selection) { // goes to particular case based on the 'selection' value
			case 1: //when selected option 1
				System.out.printf("Enter the x-coordinate of the shape:\n");
				while (true) { //
					try {
						x = input.nextInt(); // x coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				System.out.printf("Enter the y-coordinate of the shape:\n");
				while (true) {
					try {
						y = input.nextInt(); // y coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}
				Point myPoint = new Point(x, y); // constructor to new point
				shapes[i] = myPoint; // store the data inside the shapes array
				break; // break the case

			case 2: //when selected option 2
				System.out.printf("Enter the x-coordinate of the shape:\n");
				while (true) {
					try {
						x = input.nextInt(); // x coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				System.out.printf("Enter the y-coordinate of the shape:\n");
				while (true) {
					try {
						y = input.nextInt(); // y-coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				while (true) {
					try {
						System.out.printf("Enter the radius of the shape:\n");
						while (true) {
							r = input.nextDouble(); // radius
							if (r < 0) { // catch input value which is <0
								System.err.printf("Error: The radius cannot be negative !\n");
								continue;
							}
							break;
						}
					} catch (InputMismatchException e) { // catch input value which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				Circle myCircle = new Circle(x, y, r); // constructor to new circle 
				shapes[i] = myCircle; // store the data inside the shapes array
				break; //break the case

			case 3:
				System.out.printf("Enter the x-coordinate of the shape:\n");
				while (true) {
					try {
						x = input.nextInt(); // x-coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				System.out.printf("Enter the y-coordinate of the shape:\n");
				while (true) {
					try {
						y = input.nextInt(); // y-coordinate
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}

				while (true) {
					try {
						System.out.printf("Enter the radius of the shape:\n");
						while (true) {
							r = input.nextDouble(); // radius
							if (r < 0) { // catch input value which is <0
								System.err.printf("Error: The radius cannot be negative !\n");
								continue;
							}
							break;
						}
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}
				while (true) {
					try {
						System.out.printf("Enter the height of the shape:\n");
						while (true) {
							h = input.nextDouble(); // height
							if (h < 0) { // catch input value which is <0
								System.err.printf("Error: The height cannot be negative !\n");
								continue;
							}
							break;
						}
					} catch (InputMismatchException e) { // catch input which is not a number
						System.err.printf("Exception: Inappropriate type of the input data\n");
						input.nextLine();
						continue;
					}
					break;
				}
				Cylinder myCylinder = new Cylinder(x, y, r, h); // constructor to new cylinder 
				shapes[i] = myCylinder; // store the data inside shapes array
				break; //break the case

			default:
				System.err.printf("Error: Invalid value. Please select a number 1-3.\n"); // if user picked other than 1-3
				i--; // reset the i counter ; if this is not implemented, it will give error since if
						// return to the switch case, the i counter still increase
				break;
			}
		}
		System.out.printf("\nRESULTS\n"); // print all the values for the shapes
		for (int j = 0; j < numOfShapes; j++) {
			System.out.println("Shape " + (j + 1) + ": " + shapes[j].getName()); // print all the values for any shapes
			System.out.println(shapes[j].toString()); // print toString that is overridden in every shapes
		}
	}
}