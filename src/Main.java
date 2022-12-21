import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------INGRESE CANTIDAD DE EMPLEADOS---------");
        System.out.println("->Asalariados");
        int asalariados=entrada.nextInt();
        System.out.println();

        System.out.println("->Comision");
        int comision=entrada.nextInt();

        System.out.println("----EMPLEADOS ASALARIADOS-----");

        EmpleadoA [] ea = new EmpleadoA[asalariados];{
            for (int i = 0; i < asalariados; i++) {
                ea[i]=new EmpleadoA();
                ea[i].infoEmpleado();
                ea[i].mostrar();
            }

        }

        System.out.println("----EMPLEADOS POR COMISION-----");



        EmpleadoC [] ec = new EmpleadoC[comision];
        for (int i = 0; i < comision; i++) {
            ec[i] = new EmpleadoC();
            ec[i].infoEmpleado();
            ec[i].calcComision();
            ec[i].mostrar();
        }











    }

}
