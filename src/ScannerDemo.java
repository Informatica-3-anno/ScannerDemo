import java.util.Scanner;

public class ScannerDemo{
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		String risp;
		do {
			System.out.println("Inserisci un numero 1 e 10");
			
			// 1 - quello che sto per inserire è un numero!!
			// 2 - il numero inserito è compreso tra 1 e 10 !!
			// 3 - Se 1 o 2 sono false ripeto (e scrivo messaggio di errore)
			n=0;
			do {
				if (! in.hasNextInt() ) {
					System.out.println("Devi inserire un numero intero!!");
					in.next();
				} else {
					n=in.nextInt();
					if (n<1||n>10) System.out.println("Devi inserire un numero tra 1 e 10");
					in.nextLine();
				}		
			} while (n<1 || n>10);
			
			
			System.out.println("Hai inserito il numero: "+n);
			System.out.println("Vuoi continure? (s/n)");
			risp=in.next();
		} 	while( risp.equalsIgnoreCase("s"));	
		
		System.out.println("Test dell'input: scrivi qualcosa");
		
		System.out.println("Risultato hasNextInt "+in.hasNextInt());
		System.out.println("Risultato hasNextDouble "+in.hasNextDouble());
		System.out.println("Risultato hasNext "+in.hasNext());
	}
	

	

}
