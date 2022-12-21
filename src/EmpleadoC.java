import java.util.Scanner;

public class EmpleadoC{
    Scanner entrada = new Scanner(System.in);

    String nombre ;

    int cantVentas;
    double basico = 500000;
    double tarifaComision = 0.2;
    double comision;

    void infoEmpleado(){
        System.out.println("Escriba el Nombre");
        nombre = entrada.next();

        System.out.println("Cantidad de ventas Comision");
        cantVentas = entrada.nextInt();


    }

    void ventas (double valor){
             comision+=(valor*tarifaComision);
    }

    void calcComision(){
        System.out.println("ingrese el valor de las ventas");
        for (int i = 0; i < cantVentas; i++) {
            System.out.println("venta "+(i+1));
            ventas(entrada.nextDouble());
        }

    }

    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo Basico: "+basico);
        System.out.println("Comision: "+comision);
        System.out.println("Total a pagar: "+(basico+comision));
        System.out.println("------------------");
    }






    }



















