import java.util.Scanner;

public class Benutzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//es wird eine Scanner Methode initialisiert um Benutzer Eingaben abzufragen
		int Anzahl_Datensaetze;
		
		System.out.println("Guten Tag dies ist Ihr Assistent zum anlegen von neuen Benutzern");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Wie viele Benutzer sollen angelegt werden?");
		Anzahl_Datensaetze = s.nextInt();
		// die erste Zahleneingabe legt fest wie viele Benutzer das System anlegt
		System.out.println("");
		
		int Alter[] = new int[Anzahl_Datensaetze];
		String[] Name = new String[Anzahl_Datensaetze];
		String[] Vorname = new String[Anzahl_Datensaetze];
		int sum=0, avg = 0;
		String[] Schulabschluss = new String[Anzahl_Datensaetze];
		boolean Eignung = false;
		//es werden mehrere Arrays und Variablen angelegt mit denen ich später arbeite
		
		for(int x=0;x<Anzahl_Datensaetze;x++) {
			// eine for schleife um die einzelnen Einträge durchzugehen
			
			System.out.println("Vorname für "+(x+1)+". Benutzer");
			Vorname[x] = s.next();
			// die nächste String Eingabe wird im Aktuellen Vornamen gespeichert
			
			System.out.println("");
			
			System.out.println("Nachname für "+(x+1)+". Benutzer");
			Name[x] = s.next();
			// selbe für Nachname
			
			System.out.println("");
			
			System.out.println("Alter für "+(x+1)+". Benutzer");
			Alter[x] = s.nextInt();
			// Zahlen eingabe für Alter
			
			s.nextLine();  //sinnfreier Input um einen absatz zwischen s.nextInt(); und s.nextLine() zu schaffen da sonst der s.nextline() Befehl einfach übersprungen wurde
			
			System.out.println("");
			System.out.println("Schulabschluss von "+(x+1)+". Benutzer");
			Schulabschluss[x] = s.nextLine();
			// String Eingabe Schulabschluss
			
			System.out.println("");
			System.out.println(Vorname[x]+" "+Name[x]); //Ausgabe der eingegebenen Werte und bestätigung der Eingabe
			System.out.println("Eingabe erfolgreich");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("");
			
			sum = sum+Alter[x]; //aktuelles alter wird zu summe addiert
		}
		s.close();
		
		System.out.println("Zusammenfassung Benuter:");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(int z=0; z<Anzahl_Datensaetze; z++) {
			String Eig;
			String erw;
			
			if(Alter[z]>=18) {
				erw = "-volljährig-";
				}else {
				erw = "-minderjährig-";
			}
			// eine if abfrage um zu ermitteln ob angelegte Benutzer volljährig ist oder nicht
			switch (Schulabschluss[z]) {
					case "MittlereReife": Eignung = false;
					break;
					case "FachhochschulReife": Eignung = true;
					break;
					case "Hauptschulabschluss": Eignung = false;
					break;
					case "Fachabitur": Eignung = true;
					break;
					case "FachgebundeneHochschulreife": Eignung = true;
					break;
					case "FachoberschulReife": Eignung = true;
					break;
					case "Abitur": Eignung = true;
					break;
					case "Studium": Eignung = true;
					break;
					case "Abi": Eignung = true;
					break;
					case "Student": Eignung = true;
					break;
					case "AllgemeineHochschulreife": Eignung = true;
					break;
					case "Mittlere-Reife": Eignung = false;
					break;
					case "Fachhochschul-Reife": Eignung = true;
					break;
					case "Hauptschul-Abschluss": Eignung = false;
					break;
					case "Fachgebundene-Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul-Reife": Eignung = true;
					break;
					case "Allgemeine-Hochschulreife": Eignung = true;
					break;
					case "Mittlere Reife": Eignung = false;
					break;
					case "Fachhochschul Reife": Eignung = true;
					break;
					case "Hauptschul Abschluss": Eignung = false;
					break;
					case "Fachgebundene Hochschulreife": Eignung = true;
					break;
					case "Fachoberschul Reife": Eignung = true;
					break;
					case "Allgemeine Hochschulreife": Eignung = true;
					break;
					default: Eignung = false;
			}
			// eine switch case abfrage um zu ermitteln ober der Angegebene Schulabschluss für den Job geeignet ist oder nicht
			if(Eignung == true && erw == "-volljährig-") {
				Eig = "Ist für den Job geeignet";
			} else {
				Eig = "Ist nicht für den Job geeignet";
			}
			System.out.println(Vorname[z]+" "+Name[z]+ " "+Alter[z]+" "+erw+" |"+Schulabschluss[z]+"| "+Eig);
		}
				avg = sum / Anzahl_Datensaetze;		// durchschnittsalter Benutzer
		System.out.println("");
		System.out.println("Durchschnittsalter: "+avg);
		System.out.println("-----------------------------------------------------------------------------------------------");
		}
}
