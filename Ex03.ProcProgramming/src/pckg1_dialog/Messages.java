package pckg1_dialog;




/**
 * Messages class.
 * Static message functions. 
 */
public class Messages {
	private static void print(String message) {
		System.out.print(message +System.lineSeparator());
		return;
	}
	
	public static void	Hello(String name) {
		print("Hello "+name);
		return;
	}

	public static void	NiceToMeet(String name) {
		print("Nice to meet you "+name);
		return;
	}

	public static void Goodbye(String name) {
		print("Good bye "+name);
		return;
	}
}
