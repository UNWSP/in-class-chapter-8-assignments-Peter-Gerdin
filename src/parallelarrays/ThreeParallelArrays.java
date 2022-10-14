package parallelarrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ThreeParallelArrays {

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};

		boolean TFvar = true;
		boolean Tfvar2 = false;
		Scanner inputDevice = new Scanner(System.in);

		while(TFvar){
			System.out.print("Enter the name of a state in the USA >> ");
			String input = inputDevice.nextLine();
			int index = 0;

			for(String state: states){
				if (state.toUpperCase().equals(input.toUpperCase())){
					String abr = (String) Array.get(statesAbbreviation, index);
					String cap = (String) Array.get(capitals, index);
					System.out.print(state + "\t\t" + abr + "\t\t" + cap + "\n");
					Tfvar2 = true;

					System.out.print("Enter a zip code for this state >> ");
					String input2 =inputDevice.nextLine();

					cap = cap + " - " + input2;

					Array.set(capitals, index, cap);
					System.out.print(cap + "\n\n");

				}
				index++;
			}
			if (!Tfvar2) {
			TFvar = false;
			}
		}
	}
}