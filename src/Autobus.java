import java.util.Collections;
import java.util.Scanner;

public class Autobus extends Vehiculo{
    int cantidadAsientos;
    public void setMarca(){
        System.out.println("Ingrese la marca del autobus: ");
        Scanner sc = new Scanner(System.in);
        marca = sc.nextLine();
    }

    public void setCantidadAsientos() {
        this.cantidadAsientos = cantidadAsientos;
        System.out.println("Ingrese la cantidad de asientos: ");
        Scanner sc = new Scanner(System.in);
        cantidadAsientos = sc.nextInt();
    }

    public void setPatente(){
        System.out.println("Ingrese la patente del autobus: ");
        Scanner sc = new Scanner(System.in);
        patente = sc.nextLine();
    }
}
