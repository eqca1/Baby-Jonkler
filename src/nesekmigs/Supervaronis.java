package nesekmigs;

public class Supervaronis {

	private String VARDS, IZCELSME, MOTIVS;
	private int DZIVSK, HP, SPEKS, VECUMS, AIZS;
	
	 // konstruktors
	
    public Supervaronis(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS
    		, String IZCELSME, String MOTIVS) {
        this.VARDS = VARDS;
        this.IZCELSME = IZCELSME;
        this.MOTIVS = MOTIVS;
        this.DZIVSK = DZIVSK;
        this.HP = HP;
        this.SPEKS = SPEKS;
        this.VECUMS = VECUMS;
        this.AIZS = AIZS;
        
    }
    
    // metodes
    public String VARDS() {
        return VARDS;
    }
    
    public String IZCELSME() {
        return IZCELSME;
    }
    
    public String MOTIVS() {
        return MOTIVS;
    }
    
	  public int DZIVSK() {
        return DZIVSK;
    }
	  
	  public int HP() {
	        return HP;
	    }
	  
	  public int SPEKS() {
	        return SPEKS;
	    }
	  
	  public int AIZS() {
	        return VECUMS;
	    }

	  public int VECUMS() {
	        return VECUMS;
	    }
}
