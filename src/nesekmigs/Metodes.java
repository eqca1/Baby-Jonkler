package nesekmigs;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Metodes {

	
	
	static int skPar(String teks, int min, int max) {
	    int z;
	    String iev;

	    while (true) {
	        iev = JOptionPane.showInputDialog(null, teks, "Ievade", JOptionPane.QUESTION_MESSAGE);
	        if (iev == null) {
	            return -1;
	        }

	        if (iev.trim().isEmpty()) {
	            continue;
	        }

	        try {
	            z = Integer.parseInt(iev.trim());
	            if (z < min || z > max) {
	                JOptionPane.showMessageDialog(null, teks, "Ievade", JOptionPane.WARNING_MESSAGE);
	            } else {
	                return z;
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Klūda!", "Ievade", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}
    

	
    static JSlider bidjosla(JOptionPane jop, int max) {
    	
    	JSlider js = new JSlider(JSlider.HORIZONTAL, 1, max, 1);
    	js.setMajorTickSpacing(1);
    	js.setPaintTicks(true);
    	js.setPaintLabels(true);
    	jop.setInputValue(js.getValue());
    	
    	ChangeListener cl = new ChangeListener() {
    		public void stateChanged(ChangeEvent ce) {
    			JSlider sl = (JSlider) ce.getSource();
    			
    			if(!sl.getValueIsAdjusting()) {
    				jop.setInputValue(Integer.valueOf(sl.getValue()));
    			}
    		}
    	};
    	
    	js.addChangeListener(cl);
		return js;
    	
    }
    
    static int iestatitArBidjoslu(String txt, String nos, int maks) {
    	
    	JFrame jf = new JFrame();
    	JOptionPane jop = new JOptionPane();
    	JSlider js = bidjosla(jop, maks);
    	jop.setMessage(new Object[] {txt, js});
    	jop.setMessageType(JOptionPane.QUESTION_MESSAGE);
    	jop.setOptionType(JOptionPane.OK_CANCEL_OPTION);
    	JDialog jd = jop.createDialog(jf, nos);
    	jd.setVisible(true);
    	return (int) jop.getInputValue();
    	
    }

	static int varonaIzvele(ArrayList<Object> varoni) {

		String[] varon = new String[varoni.size()];
		for(int i=0; i<varon.length; i++) {
			
			varon[i] = (((Supervaronis)varoni.get(i)).noteiktVARDS())+" "+(((Supervaronis)varoni.get(i)).noteiktVECUMS())+" gadi. "+(((Supervaronis)varoni.get(i)).noteiktIZCELSME());
		}
		
		String x = (String) JOptionPane.showInputDialog(null, "Izvēlēties varoni!", "Izvēle", JOptionPane.QUESTION_MESSAGE, null,
				varon, varon[0]);
		
		int izveID = Arrays.asList(varon).indexOf(x);
		
		return izveID;
	}    	
	static ImageIcon ieladetAttelu(String failaNosaukums, int platums, int augstums) {
	    try {
	        ImageIcon originalaisAttels = new ImageIcon(failaNosaukums);
	        Image mērogotsAttels = originalaisAttels.getImage().getScaledInstance(platums, augstums, Image.SCALE_SMOOTH);
	        return new ImageIcon(mērogotsAttels);
	    } catch (Exception e) {
	        System.out.println("Nevarēja ielādēt attēlu: " + failaNosaukums);
	        return null;
	    }
	}
    	
    	
    
    
}
