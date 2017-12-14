package tax_price;

public class Main {
    public static void main(String[] args){
        String input_file = "src//other_files//items2.txt";
        String output_file = "src//other_files//output.txt";
        TaxProblem tp = new TaxProblem();
        tp.calculate_price(input_file, output_file);
    }
}
