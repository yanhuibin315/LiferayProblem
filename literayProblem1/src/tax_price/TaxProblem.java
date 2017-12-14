package tax_price;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * CODING PROBLEM: TAX
 * 1.Basic tax is applied at a rate of 10% on all goods except food and medical products.
 * 2.Import tax is applied at a rate of 5% on all imported goods.
 * 3.It is possible for both basic tax and import tax to be applied on a single product.
 * @author Bingo
 *
 */
public class TaxProblem {
	
	/*
	 * FOOD_MEDICAL:the constant by food's and medical's name
	 * DF:To keep two decimal places
	 */
	private static String[] FOOD_MEDICAL={"chocolate","pills"};
	private static DecimalFormat DF = new DecimalFormat("#0.00");

	/*
	 * Use Junit to Test this main method
	 */
    @Test
	public void calculate_price(String input_filename, String output_filename) {
		
		//the input's filepath and filename
		//String filename = "src//other_files//items2.txt";
		
		List<String> inputs = readInput(input_filename);
		double tax = 0;
		double total = 0;
		try {
			
			//output's filepath and filename
			FileWriter fw = new FileWriter(output_filename);
			// FileWriter fw = new FileWriter("src//other_files//output.txt");

			fw.write("Output:\n");
			for(String input : inputs){
				double food_medical_tax = 0;
				double imported_tax = 0;
				double produc_price;
				
				//dispite the product and it's price
				String[] every_input = input.split(" at ");
				String product = every_input[0];
				float price = Float.parseFloat(every_input[1]);
				
				if(!isFoodOrMedical(product)){
					food_medical_tax = (float) (price*0.1); 
					food_medical_tax = Double.parseDouble(DF.format(food_medical_tax));
				}
				if(isImported(product)){
					imported_tax = price*0.05;
					imported_tax = Double.parseDouble(DF.format(imported_tax));
				}
				tax = tax+food_medical_tax;
				tax = tax+imported_tax;
				tax = Double.parseDouble(DF.format(tax));
				produc_price = food_medical_tax + imported_tax + price;
				fw.write(product+": "+DF.format(produc_price)+"\n");
				total = total+price;
				total = total+food_medical_tax;
				total = total+imported_tax;
				total = Double.parseDouble(DF.format(total));
			}
			fw.write("  TAX: "+tax+"\n");
			fw.write("  TOTAL: "+total);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Failure to load File！");
			e.printStackTrace();
		}
		
	}
	
	/*
	 * readInput:this method for read file and return everyline expect the first line
	 */
	public List<String> readInput(String filename){
		File file = new File(filename);
        BufferedReader reader = null;
        List<String> inputs = new ArrayList();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = reader.readLine();
            while ((tempString = reader.readLine()) != null) {
            	inputs.add(tempString);
            }
            return inputs;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return null;
		
	}
	
	/*
	 * isFoodOrMedical:To judge whether it is food or medicine
	 */
	public boolean isFoodOrMedical(String input){
		for(String food_med : FOOD_MEDICAL){
			if(input.contains(food_med)){
				return true;
			}
		}
		return false;
		
	}
	
	/*
	 * isImported:To determine whether to pay taxes
	 */
	public boolean isImported(String input){
		if(input.contains("imported"))
			return true;
		else
			return false;
	}
	

}
