public class StateNameInfo implements Collection {

	// array storing the names of the states
	public String states[] = { "Tennessee", "Georgia", "Pennsylvania", "Texas" };

	@Override
	public Iterator getIterator() {

    return new NameIterator();
	}

	private class NameIterator implements Iterator {

		// declare variables
		int indexPosition = 0;

		@Override
		public boolean hasNext() {
			// if index position is greater than the length of states, return true
			if (indexPosition < states.length) {
				return true;
			}
			// else, return false
			return false;
		}

		@Override
		public Object nextElement() {

			if (this.hasNext()) {
				return states[indexPosition++];
			}
			return null;
		}
	}
}
