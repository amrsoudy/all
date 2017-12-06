package question2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Etudiant etudiant1 = new  Etudiant();
		Etudiant etudiant2 = new  Etudiant("Amr","Seoudy");
		
		
		etudiant1.setNom("Adel");
		etudiant1.setPrenom("Mohamed");		
		etudiant1.setCodePer("Seou195623478");
		etudiant1.setCodePer("ADE123456789");;
		
		etudiant1.ajouterNote(1, 85);
		etudiant1.ajouterNote(3, 89);
		etudiant1.ajouterNote(4,93);
		
		double moyenne = etudiant1.calculeLaMoyenne();
		
		
		System.out.println("etudiant 1 :  "+etudiant1.getNom()+"   et le prenom :   "+etudiant1.getPrenom() +"  et le moyenne est  :     " + moyenne );

		

		

		

		

		
		
		

	}
	
	

}
