/**
 * 
 */
package mar15;

/**
 * 
 * 
 * Always define the Scanner outside of a try/catch block
 * 
 * 
 * FileReader and BufferedReader are more efficient,
 * This uses the RAM cache
 * 
 * FileReader takes the file
 * BufferedReader takes the input
 */
public class FileIONotes {

	/**
	 * While loop
	 * > until it's not null then keep using the readline method
	 * > spaces also count as a character
	 * > space is the current delimiter with fileScanner
	 * > important to get the delimiter right
	 * 
	 * 3 ways of reading 
	 * 1. Scanner
	 * 2. Buffer (more efficient then scanner)
	 * 3. ArrayList
	 * 
	 * other kinds of counting 
	 * 
	 * When writing to a file,
	 * if the file exists, it will overwrite the file
	 * if the file does not exist, it will create a file
	 * always nest it under the "src/temp" location
	 * 
	 *  You can read from a file and write somewhere else
	 *  logic condition for specific data
	 *  
	 *  Cannot read and write together
	 *  Always store data in a temporary place (string or ArrayList)
	 *  
	 */
}
