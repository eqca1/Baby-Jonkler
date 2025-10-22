package nesekmigs;

import java.util.Random;

import javax.swing.JOptionPane;

public class Betmens extends Supervaronis {

		static Random rand = new Random();
		private String ierocis;
		private String gadzets;
	
	public Betmens(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS, String IZCELSME, String MOTIVS, String ierocis, String gadzets) {
		super(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS);
		this.ierocis = ierocis;
		this.gadzets = gadzets;
	}

	
	
	
	public void treneties() {
		if(noteiktSPEKS() < 200) {
		int palielin = rand.nextInt(1, 16);
		palielinatSPEKS(palielin); 
		JOptionPane.showMessageDialog(null, "Spēks palielinās uz "+palielin+" ATK~", "Veiksme", JOptionPane.INFORMATION_MESSAGE);
		}else {
		JOptionPane.showMessageDialog(null, "Supervaroņa(Betmens) spēks pārsniedz max spēku", "Brīdīnājums", JOptionPane.WARNING_MESSAGE);
		}
	}
}
