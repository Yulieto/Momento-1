package co.edu.cesde;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner (System.in);

        int platod=0,numper=0, cant=0, , platoigual=0,
        double descu=0, otrodesc=0, totalmenu=0, sipro=0, totaldesc=0;
        String prop= " ";
        System.out.println("Ingrese numero de personas: ");
        numper = inputData.nextInt();
        for (int i=1; i< numper; i++) {
            System.out.println("Ingrese el plato que desea comer:\n" +
                    "1. Hamburguesa\n" +
                    "2.Perros \n" +
                    "3.Salchipapas\n" +
                    "4.Chorizos");
            platod = inputData.nextInt();


            if (platod == 1) {
                cant = 10000;

            } else if (platod == 2) {
                cant = 8000;
            } else if (platod == 3) {
                cant = 6000;

            } else if (platod == 4) {
                cant = 7000;

            }
            totalmenu = totalmenu + cant;
            System.out.println("El total del menu es " + totalmenu);

        }
        if(totalmenu > 20000){
            descu = totalmenu * 0.10;
            System.out.println("Se realizó un descuento por compras mayores a $200000 " + descu);
        }
        else{
            System.out.println("No se realiza un descuento");
        }
        if(prop.equals("si doy propina")){
            sipro = totalmenu *10/100;
            totalmenu = totalmenu + sipro;
        }
        if (platod >=2){
            otrodesc = totalmenu * 0.50;
            totalmenu = totalmenu - otrodesc;
        }
        totaldesc= descu + otrodesc;
        System.out.println("El total que se debe pagar es: $" + totalmenu + " , el descuento total es de $ "+ totaldesc);

    }


}
