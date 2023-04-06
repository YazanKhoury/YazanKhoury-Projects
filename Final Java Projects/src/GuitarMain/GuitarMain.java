package GuitarMain;

public class GuitarMain

{

	public static void main(String[] args) 
	{
		
		Guitar guitar1 = new Guitar("Cordoba", "Daddario", "Maroon", "Classical", "3/4");
		
		guitar1.brandName();
		guitar1.strings();
		guitar1.color();
		guitar1.type();
		guitar1.size();
		
		
	}

}