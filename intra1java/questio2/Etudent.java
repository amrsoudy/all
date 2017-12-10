package question2;

import java.util.Arrays;
import java.util.Scanner;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private String codePer;
	private double [] listNote =  new double[10];
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCodePer() {
		return codePer;
	}
	public void setCodePer(String codePer) {
		this.codePer = codePer;
	}
	
	public Etudiant(){
		Arrays.fill(listNote, -1);
	}
	public Etudiant(String nom ,String prenom){
		this.nom =nom;
		this.prenom = prenom ;
		Arrays.fill(listNote, -1);
	}
	
	
	public void ajouterNote(int numNote,double note){
		boolean correct =false ;
		
		if (numNote <1 || numNote > 10){
			System.out.println("le number de note dois Etre entre 1 a 10  svp ");
			return;
			
				
		}else {
			
			
			if ( (note >= 0 && note <= 100 )){
				
			listNote[numNote-1] = note;	
		
		}else {
			System.out.println("le note est pas enter  0 ou  mois de 100   Donc c'est pas correct SVP changer ");
		
				}
			}
		}
	
	
	
		
	public double calculeLaMoyenne(){
		double somme = 0.0 ;
		double moyenne = 0.0;
		
		int count = 0;
		for(int i = 0 ; i <listNote.length;i++){
			if (listNote[i] >=0){
				somme = somme + listNote[i];
				count ++;
			}
			
		}
		moyenne = (somme/(count));
		
		return moyenne;
	
	}

	}
	
	
	

	


