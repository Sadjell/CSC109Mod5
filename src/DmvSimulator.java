import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
        int count;


<<<<<<< HEAD
        int currentNumber = random.nextInt(200); 
=======

        int currentNumber = random.nextInt(200); 

        //int currentNumber = random.nextInt(100); 

>>>>>>> fd36fa0d81542ad729658381681806cfd1697723


        System.out.println("Welcome to the DMV!");

        System.out.println("This is your number, wait to be called on:"+ currentNumber);

        count = currentNumber + 1;

<<<<<<< HEAD
        while (count <= 200) {
=======

        while (count <= 200) {

       

>>>>>>> fd36fa0d81542ad729658381681806cfd1697723
            System.out.println("Currently serving:  " + count);
            count++;


        }

        for (int i = 1; i < currentNumber; i++) 
        {
            System.out.println("Currenlty serving: " + i);
        }

        System.out.println("Currently serving: " + currentNumber);
        System.out.println("You do not have the required documents, please come back once you have them.");


        System.out.println("You really need to leave. You do not have the right documents. Get out");



        System.out.println("Evil laugh mwaahahhaahha");

        System.exit(0);
		
		

	}

}
