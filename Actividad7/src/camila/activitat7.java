package camila;
import java.util.Random;
public class activitat7 {
	
	    public static void main(String[] args) {
	        Random rand = new Random();
	        System.out.println("vamos a ver los primeros 20 numeros"); 
	        for (int i = 0; i < 20; i++) {
	            int numeroAleatorio = rand.nextInt(); 
	            System.out.printf("%d",numeroAleatorio); 
	        }
	        System.out.println("FIN"); 
	    }
	}

