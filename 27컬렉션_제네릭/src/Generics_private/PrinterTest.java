package Generics_private;

import java.util.ArrayList;

public class PrinterTest {

	public static void main(String[] args) {
		Printer<Powder> printer = new Printer<Powder>();
		printer.setMaterial(new Powder());	
		Powder powder = printer.getMaterial();		
		System.out.println(printer);
		
		Printer<Plastic> printerPlastic = new Printer<Plastic>();
		printerPlastic.setMaterial(new Plastic());	
		Plastic plastic = printerPlastic.getMaterial();		
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
		
	}

}
