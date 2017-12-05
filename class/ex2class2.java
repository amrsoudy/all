package ex2_1;

public class joueur {
	private String nom ;
	private String prenom;
	private int nomChandail;
	private String date;
	private String ville;
	private String position;
	private int score ;
	
	//constructure   pas  de type de retour 
	public joueur(){
		nom = "inconnue";
		prenom = "inconnue";
		
		
		
	}
	//on peux utilise autre structure si il different parameter ou type de reture 
	public joueur(String newnom ,String newprenom){
		nom = newnom ;
		prenom =newprenom ;
		
	}

	
	public String getNom(){
		
		
		return nom;
	}
	public String getPrenom(){
		
		
		return prenom;
	}
	public int getnomChandail(){
		
		return nomChandail ;
		
		
	}
	public String getDate(){
		
		return date;
		
	}
	public String getVille(){
		
		return ville;
		
	}
	public String getPosition(){
		
		return position;
		
	}
	
	public int getScore(){
		
		return score;
		
	}
	
	
	
	public void setNom(String newnom){
		
		nom = newnom;
		
	}
	public void setPrenom(String newprenom){
		
		prenom = newprenom ;
		
		
	}
	public void setNomChandail(int newnomdechandail){
		
		nomChandail = newnomdechandail ; 
		
	}
	
	public void setDate(String newDate){
		
		date = newDate ; 
		
	}
	public void setVille(String newville){
		
		ville = newville ;
		
	}
	
	public void setposition(String newposition){
		boolean positionPrmis = false ;
		/*switch(newposition){
		case  "Attaquant aillier gauche":positionPrmis = true;break;
		case  "Attaquant aillier droit":positionPrmis = true;break;

				
		}*/
		String[] listposition = {"agouche","droite"};
		for(int i = 0 ;i<listposition.length;i++){
			
			if(newposition.compareTo(listposition[i])==0){
				
				
				positionPrmis = true;

			}
			
			
		}
		if(positionPrmis == true){
			position = newposition ;

			
		}else{
			
			System.out.print("position non permis ");
		}
		
	}
	public void setscore(int newscore){
		
		score = newscore ;
		
	}
	
	
	public void obtenirFicheJoueur(String nom,String prenom,int nomChandail,String date,String ville,String position,int score )
	{
		
		System.out.println(nom +" "+prenom +" "+nomChandail +" "+date+" "+ville+" " +position+" "+score);
		
	}
		
	
	
}
	

	


