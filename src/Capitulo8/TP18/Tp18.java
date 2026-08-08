package Capitulo8.TP18;

import java.io.*;

public class Tp18 {
    public static void main(String[] args) {
        String[] amigos = {"Paco", "Pepito", "Joselito"};
        File fs = new File("src/Capitulo8/TP18/amigos.txt");
        try{
            FileWriter fw = new FileWriter(fs);
            for (String s : amigos){
                fw.write(s, 0, s.length());
                fw.write("\r\n");
            }
            if (fw != null){
                fw.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        File fe = new File("src/Capitulo8/TP18/amigos.txt");
        if (fe.exists()){
            try{
                FileReader fr = new FileReader(fe);
                BufferedReader br = new BufferedReader(fr);

                String s = "";
                while((s=br.readLine()) != null) {
                    System.out.println(s);
                }
                if (fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
