package nesekmigs;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




public class Gotema {
	
	private static void atskaņotSkanu(String soundFile) {
	    try {
	        java.io.File f = new java.io.File(soundFile);
	        javax.sound.sampled.AudioInputStream ais = javax.sound.sampled.AudioSystem.getAudioInputStream(f.toURI().toURL());
	        javax.sound.sampled.Clip c = javax.sound.sampled.AudioSystem.getClip();
	        c.open(ais);
	        c.start();
	    } catch (Exception e) {
	        System.out.println("Nevar atskaņot skaņu: " + soundFile);
	    }
	}
	
	public static void main(String[]args) {
	
		atskaņotSkanu("./audio/intro.wav");
		
		atskaņotSkanu("./audio/music.wav");
		
		Random rand = new Random();
		
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
					
					String[] varonaVardi = {"Gaismas Sargs", "Spēka Vīrs", "Atbildības Nestājs", "Varoņa Sirds", "Taisnības Cīnītājs"};
					String noklusejumaVardsVaronim = varonaVardi[rand.nextInt(varonaVardi.length)];

					VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa vārdu! ( Piemēram: Varonis )", "Ievade", JOptionPane.PLAIN_MESSAGE));
					if(VARDS == null || VARDS.trim().isEmpty()) {
					    VARDS = noklusejumaVardsVaronim;
					}
					
				DZIVSK = Metodes.iestatitArBidjoslu("Ievadiet supervaroņa dzīvibas skaitu!", "Dzīvibu skaits", 2);
				
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(IZCELSME == null) break;
				if(IZCELSME.trim().isEmpty()) {
				    String[] varonaIzcelsmes = {
				        "Rāvalda kabinets - kur sapņi saskaras ar realitāti",
				        "Mazpilsētas lauku māja - kur vienkāršība rada varoņus",
				        "Zinātnieku ģimene - kur eksperiments deva vairāk nekā gaidīja", 
				        "Universitātes laboratorija - kur nejauša kļūda rada leģendu",
				        "Vienkārša cilvēka dzīve - līdz liktenim bija citi plāni"
				    };
				    IZCELSME = varonaIzcelsmes[new Random().nextInt(varonaIzcelsmes.length)];
				}
				
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(MOTIVS == null) break;
				if(MOTIVS.trim().isEmpty()) {
				    String[] varonaMotivi = {
				        "Ar lielu spēku nāk liela atbildība... Kādam tam ir jāpiekrīt",
				        "Es redzu cilvēkus... Un es varu tos apturēt. Vienkārši tāpat",
				        "Pasaulei vajag varoņus, nevis vēl vienu slēptu identitāti",
				        "Mans spēks ir zvērs... Bet mans prāts ir tā važa",
				        "Es neizvēlējos šo dzīvi... tā izvēlējās mani"
				    };
				    MOTIVS = varonaMotivi[new Random().nextInt(varonaMotivi.length)];
				}

				VECUMS = Metodes.skPar("Ievadiet supervaroņa vecumu! ( 5-80 )", 5, 80); if(VECUMS == -1 ) break;
				HP = Metodes.skPar("Ievadiet supervaroņa maksimālo HP! ( 80-350 )", 80, 350); if(HP == -1 ) break;
				SPEKS = Metodes.skPar("Ievadiet supervaroņa spēku (ATK)! ( 30-150 )", 30, 150); if(SPEKS == -1 ) break;
				AIZS =  Metodes.iestatitArBidjoslu("Izvēlēties aizsardzību (DEF)", "Aizsardzību izvēlēšana", 5);

				
				varoni.add(new Supervaronis(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS));
				JOptionPane.showMessageDialog(null, "Supervaronis veiksmīgi tika izveidots~", "Veiksme!", JOptionPane.PLAIN_MESSAGE);
				break;
				
				case 1: // Betmens
					
					// Iestatītu vardu randoms
				String[] betmenaVardi = {"Tumsas Jātnieks", "Vilks", "Kaujas Vīrs", "Tumsas Sargs", "Nakts Sargs"};
				String noklusejumaVardsBetmenam = betmenaVardi[rand.nextInt(betmenaVardi.length)];

				VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet Betmena vārdu! ( Piemēram: Betmens )", "Ievade", JOptionPane.PLAIN_MESSAGE));
					if(VARDS == null || VARDS.trim().isEmpty()) {
					    VARDS = noklusejumaVardsBetmenam;
					}
					
				DZIVSK = Metodes.iestatitArBidjoslu("Ievadiet supervaroņa(Betmens) dzīvibas skaitu!", "Dzīvibu skaits", 2); System.out.println(DZIVSK);
				
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Betmens) izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(IZCELSME == null) break;
				if(IZCELSME.trim().isEmpty()) {
				    String[] betmenaIzcelsmes = {
				        "Gotemas augšējo aprindu ģimene - miljonāra bērns ar traģisku pagātni",
				        "Veinu ģimenes pils - kur katrs akmens runā par mantojumu un parādiem", 
				        "Gotemas biznesa impērija - kur nauda plūst blakus noziedzībai",
				        "LVT - iestāde, kas slēpj tumsu",
				        "Gotemas naktīs - kur bērns zaudēja visu un atrada mērķi"
				    };
				    IZCELSME = betmenaIzcelsmes[new Random().nextInt(betmenaIzcelsmes.length)];
				}
				
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Betmens) motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(MOTIVS == null) break;
				if(MOTIVS.trim().isEmpty()) {
				    String[] betmenaMotivi = {
				        "Mans vecākus nošāva noziedzības ielās... Es taisīšu tā, lai neviens cits nepiedzīvo to, ko es",
				        "Gotema ir slima, un es esmu tās ārsts. Ārsts ar nūjām un dūķiem",
				        "Es esmu briesmīgāk par briesmām. Es esmu tumsas sargs",
				        "Bagātība ir mans līdzeklis, bet stipendija ir mans mērķis",
				        "Es neradu baumas... Es esmu baumas"
				    };
				    MOTIVS = betmenaMotivi[new Random().nextInt(betmenaMotivi.length)];
				}

				VECUMS = Metodes.skPar("Ievadiet supervaroņa(Betmens) vecumu! ( 5-80 )", 5, 80); if(VECUMS == -1 ) break;
				HP = Metodes.skPar("Ievadiet supervaroņa(Betmens) maksimālo HP! ( 80-350 )", 80, 350); if(HP == -1 ) break;
				SPEKS = Metodes.skPar("Ievadiet supervaroņa(Betmens) spēku (ATK)! ( 30-150 )", 30, 150); if(SPEKS == -1 ) break;
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
					
					String[] dzokeraVardi = {"Joku Princis", "Haosa Jātnieks", "Smejas Vīrs", "Sarkanie Lūpi", "Joku Kēniņš"};
					String noklusejumaVardsDzokeram = dzokeraVardi[rand.nextInt(dzokeraVardi.length)];

					VARDS = (String)(JOptionPane.showInputDialog(null, "Ievadiet Džokera vārdu! ( Piemēram: Džokers )", "Ievade", JOptionPane.PLAIN_MESSAGE));
					if(VARDS == null || VARDS.trim().isEmpty()) {
					    VARDS = noklusejumaVardsDzokeram;
					}
					
				DZIVSK = Metodes.iestatitArBidjoslu("Ievadiet supervaroņa(Džokers) dzīvibas skaitu!", "Dzīvibu skaits", 2);
				
				IZCELSME = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Džokers) izcelsmi!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(IZCELSME == null) break;
				if(IZCELSME.trim().isEmpty()) {
				    String[] dzokeraIzcelsmes = {
				        "Žurku kanalizācija - kur ķīmija sajaucās ar prātu",
				        "Gotemas apakšpasaules labirinti - kur pazuda cilvēcība", 
				        "LVT psihiatriskā slimnīca - kur prāts beidzās un joki sākās",
				        "Liepājas kanalizācija - kur izmetamais atrod dzīvību",
				        "Neidentificēta izcelsme - pats Džokers to aizmirsis"
				    };
				    IZCELSME = dzokeraIzcelsmes[new Random().nextInt(dzokeraIzcelsmes.length)];
				}
				
				MOTIVS = (String)(JOptionPane.showInputDialog(null, "Ievadiet supervaroņa(Džokers) motivu!", "Ievade", JOptionPane.PLAIN_MESSAGE));
				if(MOTIVS == null) break;
				if(MOTIVS.trim().isEmpty()) {
				    String[] dzokeraMotivi = {
				        "Visa šī pasaule ir viens liels joks... Un es esmu tā atklājējs!",
				        "Kāpēc nopietni? Pasaule ir trakāka par mani! AH-HA-HA-HA!",
				        "Es negribu naudu, es negribu varu... Es gribu tikai redzēt pasauli!",
				        "Viena slikta diena var padarīt jebkuru par mani... Es tikai parādīju to visiem!",
				        "Kāda starpība starp manu seju un šo pasauli? Abas ir trakas!"
				    };
				    MOTIVS = dzokeraMotivi[new Random().nextInt(dzokeraMotivi.length)];
				}

				VECUMS = Metodes.skPar("Ievadiet supervaroņa(Džokers) vecumu! ( 5-80 )", 5, 80); if(VECUMS == -1 ) break;
				HP = Metodes.skPar("Ievadiet supervaroņa(Džokers) maksimālo HP! ( 80-350 )", 80, 350); if(HP == -1 ) break;
				SPEKS = Metodes.skPar("Ievadiet supervaroņa(Džokers) spēku (ATK)! ( 30-150 )", 30, 150); if(SPEKS == -1 ) break;
				AIZS =  Metodes.iestatitArBidjoslu("Izvēlēties supervaroņa(Džokers) aizsardzību (DEF)", "Aizsardzību izvēlēšana", 5);

				Krit = Metodes.skPar("Ievadiet supervaroņa(Džokers) kritiskā trieciena iespēju! ( 15-60 %)", 15, 60); if(SPEKS == -1 ) break;
				Izvairisana = Metodes.skPar("Ievadiet supervaroņa(Džokers) izvairīšanās iespēja! ( 5-30 %)", 5, 30); if(SPEKS == -1 ) break;

					
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
			    if(varoni.size() > 0) {
			        String str = "Varoņu skaits~ "+varoni.size()+"\n";
			        str += "___________________\n\n";
			        
			        for(int i=0; i<varoni.size(); i++) {
			            Object varonis = varoni.get(i);
			            
			            String e = "";
			            if(varonis instanceof Dzokers) {
			                e = " Džokers: ";
			            } else if(varonis instanceof Betmens) {
			                e = " Betmens: ";
			            } else {
			                e = " Varonis: ";
			            }
			            str += e + "\n";
			            str += ((Supervaronis)varonis).Izvadit() + "\n";
			            str += "________________\n\n";
			        }
			        
			        JTextArea textArea = new JTextArea(str);
			        textArea.setEditable(false);
			        textArea.setLineWrap(true);
			        textArea.setWrapStyleWord(true);

			        JScrollPane scrollPane = new JScrollPane(textArea);
			        scrollPane.setPreferredSize(new Dimension(500, 500));

			        JOptionPane.showMessageDialog(null, scrollPane, "Varoņu saraksts", JOptionPane.INFORMATION_MESSAGE);
			    } else {
			        JOptionPane.showMessageDialog(null, "Sarakstā nav neviens varonis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			    }
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
			                
			                
			                //UZBRŪGT
			            case "Uzbrukt":
			                int bojajums = 0;
			                
			                // Izvēlamies mērķu varoni
			                ArrayList<Object> dziviVaroni = new ArrayList<>();
			                for (Object varonis : varoni) {
			                    if (((Supervaronis) varonis).vaiIrDzivs() && varonis != tagadVaronis) {
			                        dziviVaroni.add(varonis);
			                    }
			                }
			                
			                if (dziviVaroni.isEmpty()) {
			                    JOptionPane.showMessageDialog(null, "Nav neviena mērķa uzbrukumam!", "Kļūda", JOptionPane.WARNING_MESSAGE);
			                    break;
			                }
			                
			                int merkaID = Metodes.varonaIzvele(dziviVaroni);
			                Supervaronis merkis = (Supervaronis) dziviVaroni.get(merkaID);
			                
			                // Pārbauda, vai mērķis ir Džokers un vai viņš izvairās
			                if (merkis instanceof Dzokers) {
			                    Dzokers dzokersMerka = (Dzokers) merkis;
			                    if (dzokersMerka.izvairities()) {
			                        // Izvairījās - bojājums netiek nodarīts
			                        break;
			                    }
			                }
			                
			                // Aprēķina bojājumu atkarībā no uzbrucēja
			                String uzbrukumaTeksts = "";
			                if (tagadVaronis instanceof Dzokers) {
			                    bojajums = ((Dzokers) tagadVaronis).uzbrukt();
			                    uzbrukumaTeksts = "Džokers uzbruk!";
			                } else if (tagadVaronis instanceof Betmens) {
			                    Betmens betmens = (Betmens) tagadVaronis;
			                    bojajums = betmens.noteiktKopegoBojajumu();
			                    String ierocaInfo = betmens.vaiIrIerocis() ? 
			                            " (ieskaitot ieroča bonusu: " + betmens.noteiktIerocaBonusu() + " ATK)" : "";
			                    uzbrukumaTeksts = "Betmens uzbruk! \nBojājums: " + bojajums + " ATK" + ierocaInfo;
			                    JOptionPane.showMessageDialog(null, uzbrukumaTeksts, "Uzbrukums", JOptionPane.INFORMATION_MESSAGE);
			                } else {
			                    bojajums = ((Supervaronis) tagadVaronis).noteiktSPEKS() / 2; // Samazināts no 100% uz 50%
			                    uzbrukumaTeksts = "Varonis uzbruk! \nBojājums: " + bojajums + " ATK";
			                    JOptionPane.showMessageDialog(null, uzbrukumaTeksts, "Uzbrukums", JOptionPane.INFORMATION_MESSAGE);
			                }
			                
			                // Aprēķina faktisko bojājumu, ņemot vērā aizsardzību
			                int aizsardziba = merkis.noteiktAIZS() * 5; // 5% par katru aizsardzības līmeni
			                int faktiskaisBojajums = Math.max(1, (int) (bojajums * (100 - aizsardziba) / 100.0));
			                
			                // Nodara bojājumu
			                int vecaisHP = merkis.noteiktHP();
			                merkis.sanemtBojajumu(faktiskaisBojajums);
			                
			                // Parāda cik daudz bojājuma tika nodarīts
			                JOptionPane.showMessageDialog(null, 
			                    uzbrukumaTeksts + "\n" +
			                    merkis.noteiktVARDS() + " saņēma " + faktiskaisBojajums + " bojājuma!\n" +
			                    "HP pirms: " + vecaisHP + " | HP pēc: " + merkis.noteiktHP(),
			                    "Bojājuma rezultāts", JOptionPane.INFORMATION_MESSAGE);
			                
			                // Pārbauda, vai mērķis ir miris
			                if (!merkis.vaiIrDzivs()) {
			                    // Atskaņo victory sound
			                    atskaņotSkanu("./audio/victory.wav");
			                    
			                    JOptionPane.showMessageDialog(null, 
			                        ((Supervaronis)tagadVaronis).noteiktVARDS() + " UZVARĒJA!\n" +
			                        merkis.noteiktVARDS() + " ir zaudējis cīņu!\n\n" +
			                        "Uzvarētājs: " + ((Supervaronis)tagadVaronis).noteiktVARDS(),
			                        "Cīņas Rezultāts", JOptionPane.WARNING_MESSAGE);
			                    
			                    varoni.remove(merkis);
			                }
			                break;
			                
			            case "Trenēties":
			                ((Betmens) tagadVaronis).treneties();
			                break;
			                
			            case "Pārbaudīt ieroci":
			                boolean irIerocis = ((Betmens) tagadVaronis).vaiIrIerocis();
			                if(irIerocis) {
			                    int bonuss = ((Betmens) tagadVaronis).noteiktIerocaBonusu();
			                    JOptionPane.showMessageDialog(null, "Ierocis: IR \nBonuss: " + bonuss + " ATK", 
			                            "Ieroča pārbaude", JOptionPane.INFORMATION_MESSAGE);
			                } else {
			                    JOptionPane.showMessageDialog(null, "Ierocis: NAV ", 
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
			                JOptionPane.showMessageDialog(null, "Gadžets: " + (irGadzets ? "IR " : "NAV "), 
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
			                    JOptionPane.showMessageDialog(null, "Džokers neizvairījās! ", 
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
