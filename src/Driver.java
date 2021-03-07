public class Driver {

	// main method
	public static void main(String[] args) {

		StateNameInfo stateNameInfo = new StateNameInfo();

		for (Iterator iterator = stateNameInfo.getIterator(); iterator.hasNext();) {
			String state = (String) iterator.nextElement();

			// result that will be displayed to the user
			System.out.println("A U.S. state is: " + state);
		}
	}
}
