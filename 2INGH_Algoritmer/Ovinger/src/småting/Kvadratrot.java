/**
 * 
 */
package småting;

import java.util.ArrayList;

/**
 * @author Roger
 *
 */
public class Kvadratrot {
	
	public static String getSvar(double[] in){
        ArrayList<String> ut = new ArrayList<String>();
        String svar;
        for (int i = 0; i < in.length; i++) {
            double answer = Math.sqrt(in[i]);
            if (in[i] < 0){
                svar = "<li> Kan ikke ta kvadratrota av " + in[i] + " <strong> Tallet er negativt!</strong> </li>";
            }else {
                svar = "<li> Kvadratrota av " + in[i] + " er " + answer + "</li>";
            }
            ut.add(svar);
        }
        return ut.toString();
	}
	public static void main(String[] args) {
		double[] in = {16, 0, -2};
		String print = Kvadratrot.getSvar(in);
        System.out.println(print);
	}

}
