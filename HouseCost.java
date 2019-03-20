/**
 * 
 */
package house;

/**
 * @author Sriyarsha
 *This program is used to calculate the cost of house for the given materials with string comparision and suitable operators
 */
public class HouseCost {
	/**
	 * This is the method used to compute the cost 
	 */
	public double material(String stan, double area){
		/**
		 * @param output
		 * this is used to store the value of the cost taken for the material for that particular area
		 */
		double output = 0;
		/** 
		 * if the material is standard
		 */
		if(stan.contentEquals("Standard")){
			output = 1200 * area;
		}
		/**
		 *  if the material is above standard
		 */
		if(stan.contentEquals("AboveStandard")){
			output = 1500 * area;
		}
		/**
		 * if the material is high standard
		 */
		if(stan.contentEquals("HighStandard")){
			output = 1800 * area;
		}
		/**
		 * if the material is high standard and automated
		 */
		if(stan.contentEquals("HighStandardFullAutomated")){
			output = 2500 * area;
		}
		return output;
	}

}
