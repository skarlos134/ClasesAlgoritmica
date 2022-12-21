import java.util.Scanner;

public class EmpleadoA {
    Scanner entrada = new Scanner(System.in);
    String nombre="---";
    double sueldo;
    double auxAlim = 66098;
    double auxTrans= 117172;

    void infoEmpleado(){
        System.out.println("Escriba el Nombre");
        nombre = entrada.next();

        System.out.println("Sueldo:");
        sueldo = entrada.nextInt();

    }

    double parafiscales(){
        return sueldo*0.09;
    }

    double pagoTotal(){
        return sueldo+=auxAlim+auxTrans-parafiscales();
    }


    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: $"+sueldo);
        System.out.println("Auxilio de Alimentacion: $"+auxAlim);
        System.out.println("Auxilio de Transporte: $"+auxTrans);
        System.out.println("Parafiscales 9%: $"+parafiscales());
        System.out.println("Total a Pagar: $"+pagoTotal());
        System.out.println("------------------");


    }

}
