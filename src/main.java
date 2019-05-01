import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args)  {
    	ArrayList<Product> productList = new ArrayList<Product>();
    	Scanner in = new Scanner(System.in);
    	String choice = "";
    	while (choice != "quit") {
    		System.out.println("Laptop, VideoGame, or MobilePhone?");
    		choice = in.nextLine();
    		if (choice.equalsIgnoreCase("Laptop")) {
    			System.out.println("Enter: Brand + Model + Price + Quantity");
    			String phrase = in.nextLine();
    			String delims = "[ ,]+";
    			String[] tokens = phrase.split(delims);
    			productList.add(new Laptop(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3])));
//    			for (int i = 0; i < l.size(); i++) {
//    			    System.out.println(l.get(i).toString());
//    			}
    		}
    		else if (choice.equalsIgnoreCase("videogame")) {
    			System.out.println("Enter: Brand + Model + Price + Quantity");
    			String phrase = in.nextLine();
    			String delims = "[ ,]+";
    			String[] tokens = phrase.split(delims);
    			productList.add(new VideoGame(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3])));
    		}
    		else if (choice.equalsIgnoreCase("MobilePhone")) {
    			System.out.println("Enter: Brand + Model + Price + Quantity");
    			String phrase = in.nextLine();
    			String delims = "[ ,]+";
    			String[] tokens = phrase.split(delims);
    			productList.add(new MobilePhone(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3])));
    		}
    		else if (choice.equalsIgnoreCase("quit")) {
    			choice = "quit";
    		}
    	}
		double total = calculatePrice(productList);
		System.out.println("Total cost: " + total);
    }
    public static double calculatePrice(ArrayList<Product> productList) {
    	Visitor visitor = new PriceVisitor();
    	double sum = 0;
    	for (Product p: productList) {
    		sum += p.accept(visitor);			
    	}
    	return sum;
    }
}

