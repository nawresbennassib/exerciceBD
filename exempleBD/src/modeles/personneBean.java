package modeles;

public class personneBean {
	
	 private int id;
	    private String nom;
	    private String prenom;
 public personneBean (){
	 
 }
 public personneBean(int id, String nom, String prenom) {
     this.id = id;
     this.nom = nom;
     this.prenom = prenom;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

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
 

 try {
     
     Class.forName("com.mysql.jdbc.Driver");

     
     Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

    
     Statement statement = connexion.createStatement();

     
     String requete = "SELECT * FROM candidats";
     ResultSet resultat = statement.executeQuery(requete);

     
     while (resultat.next()) {
         int id = resultat.getInt("id");
         String nom = resultat.getString("nom");
         String prenom = resultat.getString("prenom");

         Personne candidat = new Personne(id, nom, prenom);
         candidats.add(candidat);
     }

     
     resultat.close();
     statement.close();
     connexion.close();
 } catch (ClassNotFoundException | SQLException e) {
     e.printStackTrace();
 }

 return candidats;
}
 
 
 
 
}
