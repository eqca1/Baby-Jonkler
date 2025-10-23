package nesekmigs;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Gotema {
	
	
	public void main(String[]args) {
		
		String izvele;
		int izvelesID;
		String[] darbibas = {"Izveidot varoni", "Noņemt varoni", "Varoņu saraksts",
							 "Varoņa darbības izvēle", "Aizvērt programmu"};
		String[] atbilde = {"Jā", "Nē"};
		String[] veidi = {"Supervaronis", "Betmens", "Džokers"};
		//
		int DZIVSK, HP, SPEKS, VECUMS, AIZS; 
		String VARDS, IZCELSME, MOTIVS;
		
		ArrayList<Object> varoni = new ArrayList<>();

		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēlne", JOptionPane.QUESTION_MESSAGE,
					null, darbibas, darbibas[0]);
			if(izvele == null) break;
			izvelesID = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesID) {
			case 0: // Jauns varonis
				String izve = (String)JOptionPane.showInputDialog(null, "Izvēlies varoņu veidi!", "Izvēlne", JOptionPane.QUESTION_MESSAGE,
						null, veidi, veidi[0]);
				if(izve == null) break;
				int izveID = Arrays.asList(veidi).indexOf(izve);
			
				switch(izveID) {
				
				case 0: // Supervaronis
					
				VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa vārdu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				DZIVSK = Metodes.skPar("Ievadiet supervaroņa dzīvibas skaitu!", 1, 2);
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));

				VECUMS = Metodes.skPar("Ievadiet supervaroņa vecumu!", 5, 80);
				HP = Metodes.skPar("Ievadiet supervaroņa maksimālo HP!", 80, 350);
				SPEKS = Metodes.skPar("Ievadiet supervaroņa spēku (ATK)!", 30, 150);
				AIZS =  Metodes.iestatitArBidjoslu("Izvēlēties aizsardzību (DEF)", "Aizsardzību izvēlēšana", 5);

				
				varoni.add(new Supervaronis(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS));
				JOptionPane.showMessageDialog(null, "Supervaronis veiksmīgi tika izveidots~", "Veiksme!", JOptionPane.PLAIN_MESSAGE);
				break;
				
				case 1: // Betmens
					
				VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Betmens) vārdu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				DZIVSK = Metodes.skPar("Ievadiet supervaroņa(Betmens) dzīvibas skaitu!", 1, 2);
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Betmens) izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Betmens) motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));

				VECUMS = Metodes.skPar("Ievadiet supervaroņa(Betmens) vecumu!", 5, 80);
				HP = Metodes.skPar("Ievadiet supervaroņa(Betmens) maksimālo HP!", 80, 350);
				SPEKS = Metodes.skPar("Ievadiet supervaroņa(Betmens) spēku (ATK)!", 30, 150);
				AIZS =  Metodes.iestatitArBidjoslu("Izvēlēties supervaroņa(Betmens) aizsardzību (DEF)", "Aizsardzību izvēlēšana", 5);

				
				varoni.add(new Betmens(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS, false, false ));
				JOptionPane.showMessageDialog(null, "Supervaronis(Betmens) veiksmīgi tika izveidots~", "Veiksme!", JOptionPane.PLAIN_MESSAGE);
				break;
				case 2: //Džokers
				VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Džokers) vārdu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				DZIVSK = Metodes.skPar("Ievadiet supervaroņa(Džokers) dzīvibas skaitu!", 1, 2);
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Džokers) izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Džokers) motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));

				VECUMS = Metodes.skPar("Ievadiet supervaroņa(Džokers) vecumu!", 5, 80);
				HP = Metodes.skPar("Ievadiet supervaroņa(Džokers) maksimālo HP!", 80, 350);
				SPEKS = Metodes.skPar("Ievadiet supervaroņa(Džokers) spēku (ATK)!", 30, 150);
				AIZS =  Metodes.iestatitArBidjoslu("Izvēlēties supervaroņa(Džokers) aizsardzību (DEF)", "Aizsardzību izvēlēšana", 5);

					
				varoni.add(new Dzokers(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS, izveID, izveID));
				JOptionPane.showMessageDialog(null, "Supervaronis(Džokers) veiksmīgi tika izveidots~", "Veiksme!", JOptionPane.PLAIN_MESSAGE);
				break;
			}
			break;
			
			
			case 4:
				JOptionPane.showMessageDialog(null, "Programma apturēta~", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while(izvelesID != 4);
		
		
	}
}
