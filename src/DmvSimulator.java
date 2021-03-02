import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
        int count;


<<<<<<< HEAD
        int currentNumber = random.nextInt(200); 
=======
        int currentNumber = random.nextInt(100); 
>>>>>>> ea5ff687a6de356a62cfcd6e53a586593f764c8d


        System.out.println("Welcome to the DMV!");

        System.out.println("This is your number, wait to be called on:"+ currentNumber);

        count = currentNumber + 1;

<<<<<<< HEAD
        while (count <= 200) {
=======
        while (count <= 100) {
>>>>>>> ea5ff687a6de356a62cfcd6e53a586593f764c8d
            System.out.println("Currently serving:  " + count);
            count++;


        }

        for (int i = 1; i < currentNumber; i++) 
        {
            System.out.println("Currenlty serving: " + i);
        }

        System.out.println("Currently serving: " + currentNumber);
        System.out.println("You do not have the required documents, please come back once you have them.");
<<<<<<< HEAD
=======
        System.out.println("You really need to leave. You do not have the right documents. Get out");
>>>>>>> ea5ff687a6de356a62cfcd6e53a586593f764c8d

        System.exit(0);
		
		

	}

}
