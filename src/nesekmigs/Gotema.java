package nesekmigs;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




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
			        Object tagadVaronis = varoni.get(NizveID);
			        
			        // Izveidojam metožu sarakstu atkarībā no varoņa tipa
			        ArrayList<String> dotasMetodes = new ArrayList<>();
			        
			        // Metodes visiem varoņiem
			        dotasMetodes.add("Parādīt varoņa ipašības");
			        dotasMetodes.add("Mainīt spēku");
			        dotasMetodes.add("Uzbrukt");
			        
			        // Unikālās metodes Betmenam
			        if(tagadVaronis instanceof Betmens) {
			            dotasMetodes.add("Trenēties");
			            dotasMetodes.add("Pārbaudīt ieroci");
			            dotasMetodes.add("Mainīt ieroci");
			            dotasMetodes.add("Nonemt ieroci");
			            dotasMetodes.add("Izmantot gadžetu");
			            dotasMetodes.add("Pārbaudīt gadžetu");
			        }
			        
			        // Unikālās metodes Džokeram
			        if(tagadVaronis instanceof Dzokers) {
			            dotasMetodes.add("Džokera organisma dati");
			            dotasMetodes.add("Smejies");
			            dotasMetodes.add("Uzspridzināt");
			            dotasMetodes.add("Sagatavot jaunu joku");
			            dotasMetodes.add("Izvairīties");
			            dotasMetodes.add("Uzlabot kritisko triecienu");
			            dotasMetodes.add("Uzlabot izvairīšanos");
			        }
			        
			        String[] metodes = dotasMetodes.toArray(new String[0]);
			        
			        String izvele1 = (String) JOptionPane.showInputDialog(null, "Izvēlies metodi", "Metodes izvēle", JOptionPane.QUESTION_MESSAGE,
			                null, metodes, metodes[0]);
			        if(izvele1 == null) {
			            break;
			        }
			        
			        switch(izvele1) {
			            case "Parādīt varoņa ipašības":
			                String info = ((Supervaronis) tagadVaronis).Izvadit();
			                JOptionPane.showMessageDialog(null, info, "Varoņa informācija", JOptionPane.INFORMATION_MESSAGE);
			                break;
			                
			            case "Mainīt spēku":
			                int spekaIzmaina = Metodes.skPar("Cik mainīt spēku? (pozitīvs skaitlis)", 1, 100);
			                String[] options = {"Palielināt", "Samazināt"};
			                int choice = JOptionPane.showOptionDialog(null, "Kā mainīt spēku?", "Spēka maiņa", 
			                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			                boolean palielinat = (choice == 0);
			                ((Supervaronis) tagadVaronis).izmainitSPEKU(spekaIzmaina, palielinat);
			                JOptionPane.showMessageDialog(null, "Spēks veiksmīgi mainīts!", "Veiksme", JOptionPane.INFORMATION_MESSAGE);
			                break;
			                
			            case "Uzbrukt":
			                int bojajums = 0;
			                if(tagadVaronis instanceof Dzokers) {
			                    // Džokers uzbruk ar kritu un izvairīšanos
			                    bojajums = ((Dzokers) tagadVaronis).uzbrukt();
			                } else if(tagadVaronis instanceof Betmens) {
			                    // Betmens uzbruk ar ieroča bonusu ja tas ir
			                    Betmens betmens = (Betmens) tagadVaronis;
			                    bojajums = betmens.noteiktKopegoBojajumu();
			                    String ierocaInfo = betmens.vaiIrIerocis() ? 
			                            " (ieskaitot ieroča bonusu: " + betmens.noteiktIerocaBonusu() + " ATK)" : "";
			                    JOptionPane.showMessageDialog(null, "Betmens uzbruk! 🦇\nBojājums: " + bojajums + " ATK" + ierocaInfo, 
			                            "Uzbrukums", JOptionPane.INFORMATION_MESSAGE);
			                } else {
			                    // Parasts varonis - vienkāršs uzbrukums
			                    bojajums = ((Supervaronis) tagadVaronis).noteiktSPEKS();
			                    JOptionPane.showMessageDialog(null, "Varonis uzbruk! ⚔️\nBojājums: " + bojajums + " ATK", 
			                            "Uzbrukums", JOptionPane.INFORMATION_MESSAGE);
			                }
			                break;
			                
			            case "Trenēties":
			                ((Betmens) tagadVaronis).treneties();
			                break;
			                
			            case "Pārbaudīt ieroci":
			                boolean irIerocis = ((Betmens) tagadVaronis).vaiIrIerocis();
			                if(irIerocis) {
			                    int bonuss = ((Betmens) tagadVaronis).noteiktIerocaBonusu();
			                    JOptionPane.showMessageDialog(null, "Ierocis: IR 🗡️\nBonuss: " + bonuss + " ATK", 
			                            "Ieroča pārbaude", JOptionPane.INFORMATION_MESSAGE);
			                } else {
			                    JOptionPane.showMessageDialog(null, "Ierocis: NAV ❌", 
			                            "Ieroča pārbaude", JOptionPane.INFORMATION_MESSAGE);
			                }
			                break;
			                
			            case "Mainīt ieroci":
			                ((Betmens) tagadVaronis).mainitIeroci();
			                break;
			                
			            case "Nonemt ieroci":
			                ((Betmens) tagadVaronis).nonemtIerocu();
			                break;
			                
			            case "Izmantot gadžetu":
			                ((Betmens) tagadVaronis).izmantotGadzetu();
			                break;
			                
			            case "Pārbaudīt gadžetu":
			                boolean irGadzets = ((Betmens) tagadVaronis).noteiktGadzets();
			                JOptionPane.showMessageDialog(null, "Gadžets: " + (irGadzets ? "IR 🔧" : "NAV ❌"), 
			                        "Gadžeta pārbaude", JOptionPane.INFORMATION_MESSAGE);
			                break;
			                
			            case "Džokera organisma dati":
			                ((Dzokers) tagadVaronis).dzonkleraorganismaizvaddati();
			                break;
			                
			            case "Smejies":
			                ((Dzokers) tagadVaronis).smieties();
			                break;
			                
			            case "Uzspridzināt":
			                ((Dzokers) tagadVaronis).Uzspridzinat();
			                break;
			                
			            case "Sagatavot jaunu joku":
			                ((Dzokers) tagadVaronis).sagatavotJaunuJoku();
			                break;
			                
			            case "Izvairīties":
			                boolean izvairijas = ((Dzokers) tagadVaronis).izvairities();
			                if(!izvairijas) {
			                    JOptionPane.showMessageDialog(null, "Džokers neizvairījās! 💥", 
			                            "Izvairīšanās", JOptionPane.INFORMATION_MESSAGE);
			                }
			                break;
			                
			            case "Uzlabot kritisko triecienu":
			                ((Dzokers) tagadVaronis).uzlabotKrit();
			                break;
			                
			            case "Uzlabot izvairīšanos":
			                ((Dzokers) tagadVaronis).uzlabotIzvairisanas();
			                break;
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Sarakstā nav neviens varonis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			    }
			    break;
			case 4:
				JOptionPane.showMessageDialog(null, "Programma apturēta~", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while(izvelesID != 4);
		
		
	}
}
