import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* Koosta rakendus, kuhu sisestatakse alleeli nimetus ning kummagi vanema alleelide +/- väärtused. Väljastatakse lapsel tekkinud geen ning salvestatakse see faili. */

public class Rakendus {

    public static void otsiGeen() throws IOException {
        FileReader fail = new FileReader("Geenid.txt");
        BufferedReader reader = new BufferedReader(fail);
        Scanner s = new Scanner(System.in);
        // loe sisse
        System.out.println("Otsi geeni nimetuse järgi: ");
        String nimetus = s.nextLine();
        // leia kõik geenid selle nimetusega
        String rida =  reader.readLine();
        System.out.println("Leitud geenid: ");
        while(rida != null) {
            String[] data = rida.split(" ");
            if(data[0].equals(nimetus)) {
                System.out.println(rida);
            }
            data = null;
            rida = reader.readLine();
        }
    }

    public static void jarglaseGeen() throws IOException {
        Scanner s = new Scanner(System.in);
        FileReader fail = new FileReader("Geenid.txt");
        BufferedReader reader = new BufferedReader(fail);
        // vali, millised inimesed järglased omavahel saavad
        System.out.println("Esimese vanema geeni ID: ");
        int geenID1 = s.nextInt();
        System.out.println("Teise vanema geeni ID: ");
        int geenID2 = s.nextInt();
        // leia vanemate geeninimetus ja selle väärtused
        String rida = reader.readLine();
        while(rida != null) {
            String[] data = rida.split(" ");
            if(data[2].equals(String.valueOf(geenID1)) || data[2].equals(String.valueOf(geenID2))) {
                String nimetus = data[0];
                if(data[1].indexOf("+") >= 0) {
                    String vaartus = "Positiivne";
                } else {
                    String vaartus = "Negatiivne";
                }
            }
        }      
    }

    


    public static void main(String[] args) throws IOException {
        File fail = new File("Geenid.txt");
        PrintWriter writer = new PrintWriter(fail);
        Scanner s = new Scanner(System.in);
        int id = 1;
        while(true) {
            // loe sisse
            System.out.println("Sisesta alleeli nimetus: ");
            String nimetus = s.nextLine();
            System.out.println("Sisesta ühe vanema alleelide väärtused [+/-]: ");
            String vaartused = s.nextLine();
            if(vaartused.indexOf("+") >= 0) {
                vaartused = "Positiivne";
            } else {
                vaartused = "Negatiivne";
            }
            // väljasta tekkinud geen
            System.out.println("Tekkinud geen: ");
            System.out.println("Nimetus: " + nimetus);
            System.out.println("Väärtus: " + vaartused);
            // salvesta faili
            writer.println(nimetus + " " + vaartused + " " + id);
            System.out.println("Sisesta veel? [j/e] ");
            String veel = s.nextLine();
            // küsi, kas veel
            if(veel.equals("e")) {
                break;
            }
            id++;
        }
        writer.close();
        otsiGeen();
        //jarglaseGeen();
        s.close();
    }
}
