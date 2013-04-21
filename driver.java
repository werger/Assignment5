import java.io.*;
import java.util.*;

public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "";
		try
		{
			FileInputStream file = new FileInputStream ("src\\Input.txt");					//imports the file
			DataInputStream data = new DataInputStream(file);							
			BufferedReader bReader = new BufferedReader (new InputStreamReader (data));
			String s = "";
			while ((s = bReader.readLine()) != null)									//reads the file
				{
					text += s;															
				}
		}
		catch (IOException e1)															//gives error if the file is not found
		{
			System.out.println (e1);
		}
		Map <String,Integer> count = new HashMap <String,Integer>();					//creates the hash table
		String[] words = text.split("\\s");												
		
		for (int i = 0; i < words.length; i++)											
			{
				String temp = words [i];
				if (count.containsKey(temp))											
					{
						count.put(temp, count.get(temp)+1);
					}
				else
					{
						count.put(temp, 1);												
					}
			}
		
		for (String Key: count.keySet())
			{
				System.out.println (Key + "\t\t" + count.get(Key));						//prints count
			}
	}
}
