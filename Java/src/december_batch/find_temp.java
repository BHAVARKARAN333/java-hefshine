package december_batch;

import java.util.Scanner;

public class find_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        // Days
	        String day[] = {
	            "Monday", "Tuesday", "Wednesday",
	            "Thursday", "Friday", "Saturday", "Sunday"
	        };

	        // Predefined temperatures
	        float temp[] = {
	            30.5f, 31.0f, 29.5f,
	            32.0f, 33.2f, 34.0f, 28.5f
	        };

	        // Ask day name
	        System.out.println("Enter day name:");
	        String searchDay = sc.nextLine();

	        boolean found = false;

	        // Search temperature
	        for (int i = 0; i < 7; i++) {

	            if (day[i].equalsIgnoreCase(searchDay)) {

	                System.out.println(
	                    "Temperature on " + day[i] +
	                    " is: " + temp[i] + " °C"
	                );

	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Invalid Day Name!");
	        }


	}

}
