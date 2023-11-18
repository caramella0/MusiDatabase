package it.test.controler;

import java.util.Scanner;

public class ScannerRimuovi {

	public void scannerRimuovi() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Vuoi rimuovare una band o un album?: ");
		String scelta = scanner.next();
		
		if (scelta.equals("band")) {
			
			
			
		}else if (scelta.equals("album")) {
			
		}
	}
}
