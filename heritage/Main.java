package quiz2;

public class Main {

	public static void main(String[] args) {
		
		Batiment1 MonBatiment = new Batiment1();
		
		
		
		MonBatiment.setAddress("10 rue");
		
		MonBatiment.setLargeurTerrain(20.5);
		MonBatiment.setLongeurTerrain(15);
		double superf = MonBatiment.funcSuerfici();
		System.out.println(superf);
		
		Maison maMaison =new Maison();
		
		maMaison.setAddress("100 bois de boulgne ");
		maMaison.setLargeurTerrain(20);
		maMaison.setLongeurTerrain(40);
		maMaison.setNbPices(5);
		
		System.out.println(maMaison.funcSuerfici());

	}

}
