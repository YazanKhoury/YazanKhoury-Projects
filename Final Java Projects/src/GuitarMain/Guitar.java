package GuitarMain;

public class Guitar
{
	private String brandName;
	private String strings;	
	 String color;	// attributes 
	 String size;
	 String type; 


	 
	 
	 public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getStrings() {
		return strings;
	}

	public void setStrings(String strings) {
		this.strings = strings;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Guitar ()
		{				// by default
			
		}

public Guitar(String brandName, String strings, String color, String type, String size)
    {
	this.brandName = brandName;
	this.strings= strings;			 
	this.color = color;
	this.type = type;
	this.size = size;
	}

public void brandName() 

{
	
	System.out.println(this.brandName + " is a unique guitar for professional playes " );
}

public void strings()
{
	System.out.println(this.strings + " strings is one of the best strings you could ever use for that guitar");
}

public void color()
{
	System.out.println(this.color + " is the most attractive color on spanish guitars ");
}

public void type()
{
	System.out.println(this.type + " guitars are usually for flaminco techniques ");
}

public void size()
{
	System.out.println(this.size + " is a size that suits you, or you can try some other sizes ");
}

}
