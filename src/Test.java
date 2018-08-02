import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {


        Product[] product = new Product[3];
        product[0] = new Product("Mleko", "Mlekowita", 2.5);
        product[1] = new Product("Woda", "Staropolanka", 1.7);
        product[2] = new Product("Telewizor", "Samsung", 2300);


        FileWriter fw = new FileWriter("product.csv");
        BufferedWriter bfw = new BufferedWriter(fw);
        for (int i = 0; i < 3; i++) {

            bfw.write(product[i].toString());
            bfw.newLine();
        }

        bfw.close();

    }
}
