import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		try {
			duplicateRemover.remove("/sewpersaud_assignment4/sewpersaud_problem1(4)/src/problem1.txt");
			duplicateRemover.write("/sewpersaud_assignment4/sewpersaud_problem1(4)/src/unique_words.txt");
			System.out.println("Completed");
			
		}
		catch (IOException e) {
			System.out.println("Exception Occured:" + e.toString());
			e.printStackTrace();
		}
	}
}
