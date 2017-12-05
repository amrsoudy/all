package quiz2;

public class Batiment1 {
	private String address ;
	private double longeurTerrain;
	private double largeurTerrain;
	
	public double getLongeurTerrain() {
		return longeurTerrain;
	}

	public void setLongeurTerrain(double longeurTerrain) {
		this.longeurTerrain = longeurTerrain;
	}
	

	public double getLargeurTerrain() {
		return largeurTerrain;
	}

	public void setLargeurTerrain(double largeurTerrain) {
		this.largeurTerrain = largeurTerrain;
	}

	public Batiment1(){
		address ="Address no difini";
		
		
		
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Batiment1(String NouvelleAddress){

		
		
		this.address = NouvelleAddress;
		
		
	}
	public double funcSuerfici(){
		
		
		return this.longeurTerrain * this.largeurTerrain;
		
	}

	
	
	

}


