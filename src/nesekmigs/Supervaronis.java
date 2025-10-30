package nesekmigs;

import javax.swing.JOptionPane;

public class Supervaronis {

	private String VARDS, IZCELSME, MOTIVS;
	private int DZIVSK, HP;
	private int SPEKS;
	private int VECUMS;
	private int AIZS;
     

	
	 // konstruktors
	
    public Supervaronis(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS
    		, String IZCELSME, String MOTIVS) {
        this.VARDS = VARDS; 
        this.VECUMS = VECUMS;
        this.IZCELSME = IZCELSME;
        this.MOTIVS = MOTIVS;
        this.DZIVSK = DZIVSK;
        this.HP = HP;
        this.SPEKS = SPEKS;
        this.AIZS = AIZS;
        
    }
    
    // metodes
    public String noteiktVARDS() {
        return VARDS;
    }
    
    public String noteiktIZCELSME() {
        return IZCELSME;
    }
    
    public String noteiktMOTIVS() {
        return MOTIVS;
    }
    
	  public int noteiktDZIVSK() {
        return DZIVSK;
    }
	  
	  public int noteiktHP() {
	        return HP;
	    }
	  
	  public int noteiktSPEKS() {
	        return SPEKS;
	    }
	  
	  public int noteiktAIZS() {
	        return AIZS;
	    }

	  public int noteiktVECUMS() {
	        return VECUMS;
	    }
	  public void izmainitSPEKU(int n, boolean PalielinVaiSamazin) {
	        if (n > 0) {
	        	if(PalielinVaiSamazin) this.SPEKS += n;
	        	else this.SPEKS -= n;
	        }
	    }
	  
	  public void sanemtBojajumu(int bojajums) {
		    this.HP -= bojajums;
		    if (this.HP <= 0) {
		        this.DZIVSK--; // Zaudē vienu dzīvību
		        if (this.DZIVSK > 0) {
		            this.HP = 100; // Vienkāršs HP atjaunošanas sistēma
		            JOptionPane.showMessageDialog(null, 
		                this.VARDS + " zaudēja vienu dzīvību! \nAtlikušās dzīvības: " + this.DZIVSK + 
		                "\nHP atjaunots uz 100", 
		                "Zaudēta dzīvība", JOptionPane.WARNING_MESSAGE);
		        } else {
		            // Nāves skaņa
		            try {
		                java.io.File f = new java.io.File("./audio/death.wav");
		                javax.sound.sampled.AudioInputStream ais = javax.sound.sampled.AudioSystem.getAudioInputStream(f.toURI().toURL());
		                javax.sound.sampled.Clip c = javax.sound.sampled.AudioSystem.getClip();
		                c.open(ais);
		                c.start();
		            } catch (Exception e) {
		                System.out.println("Nevar atskaņot nāves skaņu");
		            }
		            
		            JOptionPane.showMessageDialog(null, 
		                this.VARDS + " ir miris!", 
		                "Nāve", JOptionPane.WARNING_MESSAGE);
		        }
		    }
		}
	    
	    // Pārbauda, vai varonis ir dzīvs
	    public boolean vaiIrDzivs() {
	        return this.DZIVSK > 0;
	    }
	  
	  public String Izvadit() {
		  return "\n > Supervaroņa vārds - " + VARDS +
				  "\n | Vecums - " + VECUMS + " gadi" +
				  "\n | Izcelsme - " + IZCELSME +
				  "\n | Motīvs - \" " + MOTIVS + " \" " +
				  "\n | Dzīvību skaits - " + DZIVSK +
				  "\n | Veselība - " + HP + " HP"+
				  "\n | Spēks - " + SPEKS + " ATK" +
				  "\n | Aizsardziba - " + AIZS + " DEF("+(AIZS*5)+"%)" +
				  "\n ";
	  

	  }
}
