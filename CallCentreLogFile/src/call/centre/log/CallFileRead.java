package call.centre.log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

/*1385718408:1385718452
1385718408:1385718464
1385718413:1385718452 */
public class CallFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Read Call Log txt File
		File file = new File("C://Users//HP//Desktop//calllog.txt");

		int arr[] = new int[10];
		// Scanner to read input file data
		Scanner sc = new Scanner(file);

		int count = 0;
		// looping record using while
		while (sc.hasNext()) {
			String next = sc.next();
			// split with Colon:

			String[] split = next.split(":");

			for (int i = 0; i < split.length; i++) {
				// convert String int Integer
				int parseInt = Integer.parseInt(split[i]);
				// add in array Object
				arr[count] = parseInt;
				// list.add(arr[count]);
				count++;

			}

		}
//print Common Log Call
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Common call log\n" + arr[i]);
					// System.out.println(arr[j]);

				}
			}
			sc.close();
		}
	}

}
