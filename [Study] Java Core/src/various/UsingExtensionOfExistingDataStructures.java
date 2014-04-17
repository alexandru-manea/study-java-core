package various;

import java.util.HashMap;

/**
 * Example of extending an existing data structure class and using the methods in the
 * superclass in the subclass.
 * 
 */
public class UsingExtensionOfExistingDataStructures {

	private static final String[] COLUMN_NAMES = {"Name", "Age", "Occupation"};
	
	private class TableRow extends HashMap<String, String> {
		
		public TableRow(String[] columnValues) {
			
			super();

			if (columnValues.length != COLUMN_NAMES.length)
				throw new UnsupportedOperationException();
			
			for (int i = 0; i < COLUMN_NAMES.length; i++) {
				
				// USE METHOD FROM SUPER CLASS
				put(COLUMN_NAMES[i], columnValues[i]);
			}
		}
	}
}
