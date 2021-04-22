package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.MenuSort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MenuSortController {

	public static void main(String[] args) {
		SpringApplication.run(MenuSortController.class, args);

		Scanner sn = new Scanner(System.in);
		boolean op = false;
		int opt;

		while(!op){
			System.out.println("1. Quick Sort");
			System.out.println("2. Insertion Sort");
			System.out.println("3. Bubble Sort");
			System.out.println("4. Recursive Bubble Sort");
			System.out.println("5. Selection Sort");
			System.out.println("6. Exit");

			System.out.println("Enter your Option: ");
			opt = sn.nextInt();

			switch(opt){
				case 1:
					System.out.println("Quick Sort algorithm");
					break;
				case 2:
					System.out.println("Insertion Sort algorithm");
					break;
				case 3:
					System.out.println("Bubble Sort algorithm");
					break;
				case 4:
					System.out.println("Recursive Bubble Sort algorithm");
					break;
				case 5:
					System.out.println("Selection Sort algorithm");
					break;
				case 6:
					op=true;
					break;
				default:
					System.out.println("Incorrect Option");
			}
		}
	}
}
