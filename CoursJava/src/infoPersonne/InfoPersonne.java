package infoPersonne;

public class InfoPersonne {
    
    private String nom;
    private Integer age;
    
    public Integer getAge() {
        return age;
    }
    
    public String getNom() {
        return nom;
    }
    
    public InfoPersonne(String nom, Integer age) {
        this.nom = nom;
        this.age = age;
    }

    public static void main(String[] args) {
        InfoPersonne personne = new InfoPersonne("Dan", 19);
        
        System.out.println("Nom & Age : " + personne.getNom() + " " + personne.getAge());
    }
}