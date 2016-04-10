package pokemon;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/* Ce programme est compose de 4 fonctions 
   Les 4 fonctions renvoient une valeur tiree du fichier CSV
   getAttack1 renvoie l'attaque du joueur qui affronte l'ordi
   getAttack2 renvoie l'attaque de l'ordinateur 
   getPokemon1 renvoie le numéro du pokemon choisi pour le joueur
   getPokemon2 renvoie le numéro du pokemon choisi pour l'ordinateur

*/
public class ReadCsv {



 public static int getAttack1 (int choix, int ligne) {

  String filename = "src\\pokemon\\euromillions.csv";
  File file = new File(filename);
  int tmp = 0;
  int i;
  try { 
  Scanner inputStream = new Scanner(file);
  //  permet de passer la premiere ligne : celle des titres
  inputStream.next();
   if (ligne < 0) { ligne = -(ligne); } 
     
  
 for ( i = 0; i < ligne; i++) { inputStream.next(); } // descend dans le fichier CSV d'un nombre de lignes egales a la variable "ligne"
  String data = inputStream.next(); // copie ligne entiere
  String [] Values = data.split(";"); // cree un tableau de valeurs avec les mots separes par ";"
  tmp = Integer.parseInt(Values[choix + 3]); // convertit la valeur String du tableau en int
  
  inputStream.close();

} catch (FileNotFoundException e) { e.printStackTrace(); } 
 
 return tmp; }
 
 public static int getAttack2 (int ligne) {
// la difference avec getAttack1 est le fait que l'on choisit un l'attaque au hasard comme il s'agit de l'ordi
  String filename = "src\\pokemon\\euromillions.csv";
  File file = new File(filename);
  int i;
  int tmp = 0; 
  
  // numero choisi au hasard entre 0 et 4
  Random rn = new Random();
int n = 5;
int hasard = rn.nextInt() % n;
 if (hasard < 0) {hasard = -(hasard); } 
 
 hasard = hasard + 1; // nous voulons que "hasard" soit entre 1 et 5
 
 try { 
  Scanner inputStream = new Scanner(file);
 inputStream.next(); //  permet de passer la premiere ligne : celle des titres
   if (ligne < 0) { ligne = -(ligne); } 
     
  
 for ( i = 0; i < ligne; i++) { inputStream.next(); }

  String data = inputStream.next(); // copie ligne entiere
  String [] Values = data.split(";"); // cree un tableau de valeurs avec les mots separes par ";"
  tmp = Integer.parseInt(Values[hasard + 3]); // convertie la valeur String du tableau en int

  inputStream.close();

} catch (FileNotFoundException e) { e.printStackTrace(); } 

 return tmp; }
 
 
 
 public static int getpokemon1 (int ligne) {

  String filename = "src\\pokemon\\euromillions.csv";
  File file = new File(filename);

  int tmp = 0;
  int i;
  
 try { 
  Scanner inputStream = new Scanner(file);
 inputStream.next(); //  permet de passer la premiere ligne : celle des titres
   if (ligne < 0) { ligne = -(ligne); } 
     
  
 for ( i = 0; i < ligne; i++) { inputStream.next(); } // saute les premieres lignes du fichier CSV

  String data = inputStream.next(); // copie ligne entiere
  String [] Values = data.split(";"); // cree un tableau de valeurs avec les mots separes par ";"
  tmp = Integer.parseInt(Values[9]); // convertit en int 

  inputStream.close();

} catch (FileNotFoundException e) { e.printStackTrace(); } 
 return tmp; 
 }
 
 public static int getpokemon2 (int ligne) {

  String filename = "src\\pokemon\\euromillions.csv"; 
  File file = new File(filename);
  int tmp = 0;
  int i;
  
 try { 
  Scanner inputStream = new Scanner(file);
 inputStream.next(); //  permet de passer la premiere ligne : celle des titres
   if (ligne < 0) { ligne = -(ligne); } 
     
  
 for ( i = 0; i < ligne; i++) { inputStream.next(); }

  String data = inputStream.next(); // copie ligne entiere
  String [] Values = data.split(";"); // cree un tableau de valeurs avec les mots separes par ";"
  
  tmp = Integer.parseInt(Values[10]);

   inputStream.close();

} catch (FileNotFoundException e) { e.printStackTrace(); } 
 return tmp; }

   

}


