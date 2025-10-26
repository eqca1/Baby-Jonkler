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
        // Izveidojot Betmenu, ja ir ieroči, piešķiram nejaušu bonusu.
        if(ierocis) {
            this.ierATKBonus = rand.nextInt(15, 51);
        }
    }
    
    public void treneties() {
        if(noteiktSPEKS() < 300) {
            int palielin = rand.nextInt(1, 16);
            izmainitSPEKU(palielin, true); 
            JOptionPane.showMessageDialog(null, "Spēks palielinās uz "+palielin+" ATK~", "Veiksme", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Supervaroņa(Betmens) spēks pārsniedz max spēku", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Metode, lai izmantotu gadžetu (liels nejaušs DMG)
    public void izmantotGadzetu() {
        if(gadzets) {
            int gadzetaBojajums = rand.nextInt(70, 201);
            JOptionPane.showMessageDialog(null, "Betmens izmanto gadžetu! 💥\nBojājums: " + gadzetaBojajums + " ATK", 
                    "Gadžets", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nav pieejamu gadžetu! 😕", 
                    "Kļūda", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Metode ieroču maiņai (jauns nejaušs bonuss)
    public void mainitIeroci() {
        if(ierocis) {
            this.ierATKBonus = rand.nextInt(15, 51);
            JOptionPane.showMessageDialog(null, "Ierocis nomainīts! 🗡️\nJaunais bonuss: " + ierATKBonus + " ATK", 
                    "Ierocis", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nav ieroča! 😕", 
                    "Kļūda", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean vaiIrIerocis() {
        return ierocis;
    }
    
    public boolean noteiktGadzets() {
        return gadzets;
    }
    
    public int noteiktIerocaBonusu() {
        return ierATKBonus;
    }
    
    public void nonemtIerocu() {
        if(ierocis) {
            ierocis = false;
            ierATKBonus = 0;
            JOptionPane.showMessageDialog(null, "Ierocis noņemts! 🗡️", 
                    "Ierocis", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Metode kopējā DMG aprēķināšanai (pamata DMG + ieroča bonuss)
    public int noteiktKopegoBojajumu() {
        int pamatBojajums = noteiktSPEKS();
        if(ierocis) {
            return pamatBojajums + ierATKBonus;
        }
        return pamatBojajums;
    }
}
