package examen;
public class Brand{
	private String brandName;
	private String brandRef;
	
	public Brand(String brandName, String brandRef) {
		this.brandName = brandName;
		this.brandRef = brandRef;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public String getBrandRef() {
		return brandRef;
	}
}