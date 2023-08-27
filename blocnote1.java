
package blocnote;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner ;
public class blocnote1 {

	ArrayList<String> bloc =new ArrayList<String>();
 //pour cree un blocs note
public static void nouvbloc() {

	ArrayList<String> bloc =new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	System.out.println("veuillez entrer vos notes ");
	String note= sc.nextLine();

	bloc.add(note);

	System.out.println(bloc);
	}
//pour ajouter de nouvelles notes
public  void ecriredenouveau  ()	 {

	Scanner sc= new Scanner(System.in);
	System.out.println("choisir 1 pour continiuer");
	String A= sc.nextLine ();
	do  {
		System.out.println("Vous avez saisi une autre touche "
				+ "veuillez saisir 1 pour continuer");
		String A= sc.nextLine ();
		}
	while (A.contains("1")) ;
		System.out.println("Saisir de nouvelles note ");
	String nouvnote= sc.nextLine();

		bloc.add(nouvnote);

		System.out.println(bloc);
		 }



public  void ecrirefichier() {
	try           {
		BufferedWriter fichier=new BufferedWriter(new FileWriter("blocnote.txt"));
		for (String element:bloc)  {

		fichier.write(element);
		fichier.newLine();
		}
				fichier.close();
	   }
	catch (IOException  e) {
		System.out.println( "ereur d enregistrement:"+e.getMessage());
	}
		}


public static void main(String[] args) {

    blocnote1 nz= new blocnote1();
 nz.nouvbloc();
 nz.ecrirefichier();
}
}
