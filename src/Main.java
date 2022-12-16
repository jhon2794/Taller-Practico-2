import java.util.Scanner;

public class Main {
    public static void main (String [ ] args) {
        boolean parada = true;
        while(parada==true){
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese 1 para crear un cohete autopropulsado, 2 para crear una nave tripulada, 3 para crear una nave no tripulada, 0 para termninar  ");
            String lectura = sc.next();
            int numero = Integer.parseInt(lectura);
            if (numero==0){
                parada = false;
            }
            if (numero == 1) {
                NaveEspacial coheteAutopropulsado = new CoheteAutopropulsado("sol","usa","oxido xing",2344,2222,"1234",23455,22334354);
            }
            if (numero == 2){
                NaveEspacial noTripulada = new NoTripuladas("marte","rusia","nitrilo",23344,23,"1998",233,323);
            }
            if (numero==3){
                NaveEspacial tripuladas = new Tripuladas("pluton","francia","nitrilo sofato",2345,34,"1990",234,4,345);
            }
        }

    }

    }