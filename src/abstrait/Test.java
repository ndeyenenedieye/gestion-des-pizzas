package abstrait;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		
		System.out.println("choix des pays: USA, FR, SN ");
		Scanner sc=new Scanner(System.in);		
		String pays= sc.nextLine();
		
		AbstractFactory factory;
		factory=AbstractFactory.getFactory(pays);
		AbstractOriental oriental=factory.createOrientale();
		oriental.service();
		
		
		factory=AbstractFactory.getFactory(pays);
		AbstractReine reine=factory.createReine();
		reine.service();
		
		
		factory=AbstractFactory.getFactory(pays);
		AbstractTroisFrommage troisFrommage=factory.createTroisFrommage();
		troisFrommage.service();
	}

}


