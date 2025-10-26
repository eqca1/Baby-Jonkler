package nesekmigs;

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
	  
	  public String Izvadit() {
		  return "\n > Supervaroņa vārds - " + VARDS +
				  "\n | Vecums - " + VECUMS + " gadi" +
				  "\n | Izcelsme - " + IZCELSME +
				  "\n | Motīvs - \" " + MOTIVS + " \" " +
				  "\n | Dzīvību skaits " + DZIVSK +
				  "\n | Veselība - " + HP + " HP"+
				  "\n | Spēks - " + SPEKS + " ATK" +
				  "\n | Aizsardziba - " + AIZS + " DEF" +
				  "\n ";
	  

	  }
}
