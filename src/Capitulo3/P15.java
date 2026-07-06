package Capitulo3;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        String[] equipos = new String[8];
        Scanner sc = new Scanner(System.in);
        String[] ganadores1Ronda = new String[4];
        String[] ganadores2Ronda = new String[2];
        int op;

        for (int i = 0; i < equipos.length; i++) {
            System.out.print("Introduce un nombre de equipo para el equipo " + i + " : ");
            equipos[i] = sc.next();
        }

        int cont=0;
        System.out.println("---------Primera ronda:---------");
        for (int j = 0; j < equipos.length; j++) {
            System.out.print("1." + equipos[j] + " -  2." + equipos[j+1] + ":");
            op = sc.nextInt();
            if (op == 1) {
                ganadores1Ronda[cont] = equipos[j];
            } else if (op == 2) {
                ganadores1Ronda[cont] = equipos[j+1];
            }
            j++;
            cont++;
        }
        cont=0;

        System.out.println("---------Segunda ronda:---------");
        for (int k = 0; k < ganadores1Ronda.length; k++) {
            System.out.print("1." + ganadores1Ronda[k] + " -  2." + ganadores1Ronda[k+1] + ":");
            op = sc.nextInt();
            if (op == 1) {
                ganadores2Ronda[cont] = ganadores1Ronda[k];
            } else if (op == 2) {
                ganadores2Ronda[cont] = ganadores1Ronda[k+1];
            }
            cont++;
            k++;
        }

        cont=0;
        System.out.println("---------Tercera ronda:----------");
        for (int l = 0; l < ganadores2Ronda.length; l++) {
            System.out.print("1." + ganadores2Ronda[l] + " -  2." + ganadores2Ronda[l+1] + ":");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("Ganador: " + ganadores2Ronda[l]);
            } else if (op == 2) {
                System.out.println("Ganador: " + ganadores2Ronda[l+1]);
            }
            cont++;
            l++;
        }
    }
}
