package nesekmigs;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import nhk.BernuRitenis;
import nhk.KalnuRitenis;
import nhk.Metodes;
import nhk.Velosipeds;



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
		
		int Krit, Izvairisana;
		boolean ierocis, gadzets;
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

				String ieroc = (String) JOptionPane.showInputDialog(null, "Vai ir papildu ierocis?", "Izvēle", JOptionPane.QUESTION_MESSAGE,
						null, atbilde, atbilde[0]);
				if(ieroc == null || ieroc == "Nē") ierocis = false; 
				else ierocis = true;
				String gadzet = (String) JOptionPane.showInputDialog(null, "Vai ir papildu gadžets?", "Izvēle", JOptionPane.QUESTION_MESSAGE,
						null, atbilde, atbilde[0]);
				if(gadzet == null || gadzet == "Nē") gadzets = false; 
				else gadzets = true;
				
				varoni.add(new Betmens(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS, ierocis, gadzets ));
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

				Krit = Metodes.skPar("Ievadiet supervaroņa(Džokers) kritiskā trieciena iespēju!", 15, 60);
				Izvairisana = Metodes.skPar("Ievadiet supervaroņa(Džokers) izvairīšanās iespēja!", 5, 30);

					
				varoni.add(new Dzokers(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS, Krit, Izvairisana));
				JOptionPane.showMessageDialog(null, "Supervaronis(Džokers) veiksmīgi tika izveidots~", "Veiksme!", JOptionPane.PLAIN_MESSAGE);
				break;
			}
			break;
			case 1: // Noņemt varoni
				if(varoni.size() > 0) {
					
					int NizvID = Metodes.varonaIzvele(varoni);
					varoni.remove(NizvID);
					JOptionPane.showMessageDialog(null, "Varonis tika noņemts!", "Veiksme", JOptionPane.PLAIN_MESSAGE);
				}else {
					
					JOptionPane.showMessageDialog(null, "Sarakstā nav neviens varonis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}
				break;
			
			case 2: // Varoņu saraksts
				if(varoni.size()>0) {
					String str = "Varoņu skaits~ "+varoni.size()+
							"\n___________________\n";
					for(int i=0; i<varoni.size(); i++) {
						
						str += ((Supervaronis)varoni.get(i)).Izvadit()+
								"\n___________________\n";
						}
					JTextArea textArea = new JTextArea(str);
					textArea.setEditable(false);
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);

					JScrollPane scrollPane = new JScrollPane(textArea);
					scrollPane.setPreferredSize(new Dimension(500, 500));

					JOptionPane.showMessageDialog(null, scrollPane, "Varoņu saraksts", JOptionPane.INFORMATION_MESSAGE);
		}else{
				JOptionPane.showMessageDialog(null, "Sarakstā nav neviens varonis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);}
				break;
				
				
				
				
			case 3: // Varoņa darbības izvēle
				if(varoni.size()>0) {
					
					int NizveID = Metodes.varonaIzvele(varoni);
					String[] metodes = {"Noteikt varones īpašības", "Iestatīt sēdekli", "Noteikt kustības ātrumu",
							"Mīties", "Bremzēt", "Noteikt iestatīto ātrumu", "Pārslēgt ātrumu", "Palīgriteņi", "Zvaniņš"};

					String izvele1 = (String) JOptionPane.showInputDialog(null, "Izvēlies metodi", "Metodes izvēle", JOptionPane.QUESTION_MESSAGE,
							null, metodes, metodes[0]);
					if(izvele1 == null) {
						break;
					}
					int izvelesID1 = Arrays.asList(metodes).indexOf(izvele1);	
					switch(izvelesID1) {
					case 0: // Noteikt varones īpašības
						((Supervaronis) varoni.get(NizveID)).Izvadit();
					break;
					case 1: // 
						
						((Velosipeds) riteni.get(NizveID)).iestatitSedeklaPoz(Metodes.iestatitSedekli());
						JOptionPane.showMessageDialog(null, "Sedekļa pozīcija veiksmīgi iestatīta",
								"Veiksme", JOptionPane.INFORMATION_MESSAGE);
					break;
					case 2:
						JOptionPane.showMessageDialog(null, "Riteņa kustība ātrums ir "+(((Velosipeds) riteni.get(NizveID)).noteiktAtr())+" m/s.", "Noteikt kustības ātrumu", 
								JOptionPane.INFORMATION_MESSAGE);
					break;
					case 3:
						((Velosipeds) riteni.get(NizveID)).mities(Integer.parseInt(JOptionPane.showInputDialog(null, "Cik mītienu jūs grībāt uztaisīt?", "Mities", JOptionPane.QUESTION_MESSAGE)));
					break;
					case 4: 
						((Velosipeds) riteni.get(NizveID)).bremzet(Integer.parseInt(JOptionPane.showInputDialog(null, "Cik jūs grībāt uzbremzēt?", "Bremzēt", JOptionPane.QUESTION_MESSAGE)));
					break;
					case 5:
						if(riteni.get(NizveID) instanceof KalnuRitenis) {
							JOptionPane.showMessageDialog(null, "Iestatītais ātrums ir "+((KalnuRitenis)riteni.get(NizveID)).noteiktIestatAtr()+".", 
									"Noteikt iestatīto ātrumu", JOptionPane.INFORMATION_MESSAGE);
						}else JOptionPane.showMessageDialog(null, "Šim riteņa veidam nav iestatītie ātrumi~", "Kļūda", JOptionPane.ERROR_MESSAGE);
						
					break;
					case 6:
						if(riteni.get(NizveID) instanceof KalnuRitenis) {
							((KalnuRitenis) riteni.get(NizveID)).parslegtAtr(Metodes.iestatitAtrumu());
						}else JOptionPane.showMessageDialog(null, "Šim riteņa veidam nav iestatītie ātrumi~", "Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
					case 7:
						if(riteni.get(NizveID) instanceof BernuRitenis) {
							boolean darbiba;
							String izv2 = (String) JOptionPane.showInputDialog(null, "Veikt darbību ar palīgrīteņiem?", "Izvēle", JOptionPane.QUESTION_MESSAGE,
									null, atbilde, atbilde[0]);
							if(izv2 == null || izv2 == "Nē") darbiba = false; 
							else darbiba = true;
							
							((BernuRitenis)riteni.get(NizveID)).darbArPaligrit(darbiba);
						}else JOptionPane.showMessageDialog(null, "Šim riteņa veidam nav palīgriteņi~", "Kļūda", JOptionPane.ERROR_MESSAGE);
			
					break;
						case 8:
						if(riteni.get(NizveID) instanceof BernuRitenis) {
							((BernuRitenis)riteni.get(NizveID)).zvanitZvaninu();
						}else JOptionPane.showMessageDialog(null, "Šim riteņa veidam nav zvaniņš~", "Kļūda", JOptionPane.ERROR_MESSAGE);
						
					break;
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Sarakstā nav neviens ritenis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
					break;
				}
				break;
				
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Programma apturēta~", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while(izvelesID != 4);
		
		
	}
}
