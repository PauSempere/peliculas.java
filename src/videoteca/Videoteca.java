package videoteca;

import java.util.Scanner;

/**
 * \
 * \
 *
 * @author alumne\
 */
public class Videoteca {

    /**
     * \
     *
     * @param args the command line arguments\
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Indica el numero de peliculas que deseas archivar: ");

        int num = entrada.nextInt();
        entrada.nextLine();//leemos al entrada
        System.out.print("\n");

        String[] list = ListaPeliculas(num, entrada);//String de peliculas
        BuscarTitulo(num, list, entrada);

        BuscarGenero(num, list, entrada);
    }

    public static String[] ListaPeliculas(int num, Scanner entrada) {

        String[][] cad = new String[num][2];//matriz bidimensional juntando titulo y genero
        String[] lista = new String[num];//array que junta las dos columnas

        for (int i = 0; i < num; i++) {

            System.out.print("Introduce el titulo de la " + (i + 1) + "a pelicula: ");
            cad[i][0] = entrada.nextLine();//lo almacenamos en la primera columna
            System.out.println("\n" + "Introduce el genero de la pelicula " + cad[i][0] + ": ");
            cad[i][1] = Generos(entrada);      //lo almacenamos en la segunda columna
            entrada.nextLine();
            lista[i] = cad[i][0] + "; " + cad[i][1] + ";";//separa por ; las dos columnas
            System.out.println("");
        }
        return lista;
    }

    public static void BuscarTitulo(int num, String[] list, Scanner entrada) {

        String texto;//creamos este estring para que busque texto
        System.out.println("\n" + "Busqueda de peliculas por titulo");
        System.out.print("\n" + "Introduce caracteres: ");
        texto = entrada.nextLine();
        System.out.println("\n" + "Se han hallado las siguientes coincidencias:");

        for (int i = 0; i < num; i++) {

            if (list[i].contains(texto)) {

                System.out.println("\n" + list[i]);//

            }
        }
        System.out.println("\n");
    }

    public static String Generos(Scanner entrada) {

        int op;
        String genero = null;

        System.out.println("\n" + "1 - terror");
        System.out.println("2 - accion");
        System.out.println("3 - drama");
        System.out.println("4 - comedia");
        System.out.println("5 - aventura");
        System.out.println("6 - ciencia ficcion");
        System.out.println("7 - fantasia");
        System.out.println("8 - suspense");
        System.out.print("\n" + "Elige una opcion: ");

        op = entrada.nextInt();

        switch (op) {//escoger el genero que le corresponde a cada peli

            case 1:
                genero = "terror";
                break;
            case 2:
                genero = "accion";
                break;
            case 3:
                genero = "drama";
                break;
            case 4:
                genero = "comedia";
                break;
            case 5:
                genero = "aventura";
                break;
            case 6:
                genero = "ciencia ficcion";
                break;
            case 7:
                genero = "fantasia";
                break;
            case 8:
                genero = "suspense";
                break;
            default:
                System.out.println("Error: Genero no reconocido!");
                break;
        }
        return genero;
    }

    public static void BuscarGenero(int num, String[] list, Scanner entrada) {

        String texto;
        System.out.println("\n" + "Busqueda de peliculas por genero");
        System.out.print("\n" + "Introduce genero: ");
        texto = Generos(entrada);

        for (int i = 0; i < num; i++) {

            if (list[i].contains(texto)) {

                System.out.println("\n" + list[i]);

            }
        }
        System.out.println("\n");

    }

}
