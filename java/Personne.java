public class Personne{
    String nom;
    String prenom;
    int age=30;
    String sex;
     public Personne(String nam,String lastname, int old, String sexe){
      nom=nam;
      prenom=lastname;
      age=old;
      sex=sexe;
    public Personne(){
        nom="Doe";
        prenom="John";
        age=30;
        sexe="masculin";
    }
   
         }
        public String getName(){
        return nom;
        }
        public void sameLastName(Personne p){
            this.name=name;
            
        }
     public static void main(String[] argv){
        Personne P1 = new Personne();
        System.out.println("Nom: "+P1.nom + " Prenom: " + P1.prenom + " Age: " + P1.age + "ans");
       // Personne P2 = new Personne();
        System.out.println("Nom: " +P1.nom + " Prenom: " + P1.prenom + " Age: " + P1.age + " Sexe: " + P1.sexe);
        getName("Doe","John",30,"masculin");
        Personne P = new Personne();
        System.out.println(P.name);
    }
       }

    

   

