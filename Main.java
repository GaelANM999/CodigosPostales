import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String archi = "E:\\HP\\Documents\\UNI\\DS3\\codigos_postales_hmo.txt";
        BufferedReader br = new BufferedReader(new FileReader(archi));
        List<Integer> lista = new ArrayList<>();



        String lee;

        while ((lee= br.readLine()) != null) {
           int CoP= Integer.parseInt(lee.substring(0, 5));
           lista.add(CoP);
        }
        br.close();

        int CoMax = 83357;
        int[] frecuencia = new int[CoMax + 1];

        for (int CoP : lista) {
            frecuencia[CoP]++;
        }

        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > 0) {
                System.out.println("Codigo Postal: " + i + " - Repeticiones: " + frecuencia[i]);
            }
        }

    }
}