package lab3.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	static int numberOfProducts = 0;
	static Scanner sc = new Scanner(System.in);
	static List<IPackage> packages = new ArrayList<IPackage>();

	public static void main(String[] args) {
		Application.numberOfProducts = 1;
		
		int i = 0;
		
		while (i < Application.numberOfProducts)
		{
			System.out.println("------------------PRODUCT: "+(i+1)+"-------------");
			System.out.println("Description: ");
			String desc = sc.next();
			System.out.println("Weight: ");
			Double weight = 0.0;
			
			try {
				weight = getDouble();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String zone = chooseZone();
			IPackage p = new Package(zone, desc, weight);
			
			//add carrier to the product
			((Package) p).addCarrier(new Carrier("UPS", p));
			((Package) p).addCarrier(new Carrier("US Mail", p));
			((Package) p).addCarrier(new Carrier("FedEx", p));
			
			Application.packages.add(p);
			i++;
		}
		outLowPrice();

	}

	/****************************************/
	public static double getDouble() throws IOException // reads an double from the keyboard input
	{
		//Scanner sc = new Scanner(System.in);
		
		//String s = getString();
		String s = sc.next();
		
		return (Double.valueOf(s)).doubleValue();
	}
	
	/****************************************/
	public static String chooseZone()
	{
		System.out.println("*********************************");
		System.out.println(" \n1: IA, MT or CA\n 2: TX and UT\n 3: FL, MA or OH\n 4: Others");
		String rep = "Others";
		switch (sc.nextInt())
		{
		case 1: rep = "IA";
			break;
		case 2: rep = "TX";
		break;
		case 3: rep = "FL";
		break;
		default: rep = "Others";
		break;
		}
		return rep;
		
	}
	
	public static void outLowPrice()
	{
		for (IPackage iPackage : packages) {
			Package p = (Package) iPackage;
			String carrierName = "";
			for (ICarrier carrier : p.getCarriers()) {
				Carrier c = (Carrier) carrier;
				if (c.computeCost() == p.computeLowestCost())
					carrierName = c.getName();
			}
			System.out.println(p.getDescription()+" $"+ p.computeLowestCost() + " "+ carrierName);
		}

	}
	

}
