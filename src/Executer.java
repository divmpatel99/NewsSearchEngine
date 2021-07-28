import java.util.Scanner;



public class Executer {
	//Displays Main menu
	public static void menu1() {		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean menu = true;
		while(menu) {
			System.out.println("\n\n-----------------------------------------\nSearch Engine\n-----------------------------------------");
			System.out.println("Press 1 to search for a keyword");
			System.out.println("Press 2 to crawl the pages again(Will take upto 15 minuites to crawl 500 pages)");
			System.out.println("Press 0 to exit");
			System.out.println("-----------------------------------------");
			System.out.print("Select an option: ");
			String ans = sc.nextLine();
			
			switch(ans) {
				case "1":
					System.out.print("Enter keyword to search: ");
					Search.searchPhrase(sc2.nextLine(),10);
					break;
				case "2":
					menu2();
					break;
				case "0":
					System.out.println("Exiting, thanks for using our search");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong Input, Try again.");
			}
		}
		sc.close();
		sc2.close();
		
	}
	//Displays CrwalMenu.
	public static void menu2() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean menu = true;
		while(menu) {
			System.out.println("\n\n-----------------------------------------\nWeb Crawling\n-----------------------------------------");
			System.out.println("Press 1 to enter websites to crawl");
			System.out.println("Press 2 to crwal the default web pages");
			System.out.println("Press 0 to exit");
			System.out.println("-----------------------------------------");
			System.out.print("Select an option: ");
			int ans = sc.nextInt();
			
			switch(ans) {
				case 1:
					System.out.print("Enter websites to crawl saperated by a whitespace\n");
					WebCrawler.crawlCustom(sc2.nextLine());
					break;
				case 2:
					System.out.print("Executing crawl on default links");
					WebCrawler.crawlDefault();
					break;
				case 0:
					System.out.println("Exiting, thanks for using our search");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong Input, Try again.");
			}
			menu = false;
		}
		sc.close();
		sc2.close();
	}
	public static void main(String[] args) {
		menu1();
	}
}
