package edu.thepower.tema01variablesyoperadores;

public class T01E07_FinalNumeros {
    public static void main(String[] args) {
        int uds = 37;
        int precio = 1299;
        int resultado= uds * precio;
        int descuento = resultado * 15/100
        int iva= (resultado - descuento)* 21/ 100;
        int total= (resultado-descuento)- iva;

        System.out.println("Importe sin descuento: "+ resultado);
        System.out.println("El descuento es: "+ descuento);
        System.out.println("El importe con descuento: " + (resultado-descuento))
        System.out.println("El importe total con iva es: " + total / 100.0);

    }
}
