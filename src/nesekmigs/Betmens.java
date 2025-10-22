package nesekmigs;

import java.util.Random;

import javax.swing.JOptionPane;

public class Betmens extends Supervaronis {

		static Random rand = new Random();
		private int ierATKBonus;
		private boolean ierocis;
		private boolean gadzets;
	
	public Betmens(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS, String IZCELSME, String MOTIVS, boolean ierocis, boolean gadzets) {
		super(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS);
		this.ierocis = ierocis;
		this.gadzets = gadzets;
	}

	
	
	
	public void treneties() {
		if(noteiktSPEKS() < 300) {
		int palielin = rand.nextInt(1, 16);
		izmainitSPEKU(palielin, true); 
		JOptionPane.showMessageDialog(null, "Spēks palielinās uz "+palielin+" ATK~", "Veiksme", JOptionPane.INFORMATION_MESSAGE);
		}else {
		JOptionPane.showMessageDialog(null, "Supervaroņa(Betmens) spēks pārsniedz max spēku", "Brīdīnājums", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public boolean vaiIrIerocis() {
		return ierocis;
	}
	public boolean noteiktGadzets() {
		return gadzets;
	}
	public void ierocaSpeks() {
		if(ierocis) {
			ierATKBonus = rand.nextInt(15, 51);
			izmainitSPEKU(ierATKBonus, true);
		}
	}
	public int noteiktIerocaBonusu() {
		return ierATKBonus;
	}
	public void nonemtIerocu() {
		if(ierocis) 	{
			izmainitSPEKU(rand.nextInt(15, 51), false);
			ierocis = false;
		}

		
	}
		
}
