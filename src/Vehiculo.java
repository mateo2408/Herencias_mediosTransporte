import java.util.Scanner;

public class Vehiculo {
    String marca;
    String patente;

    public void setMarca() {
        System.out.println("Ingrese la marca: ");
        Scanner sc = new Scanner(System.in);
        marca = sc.nextLine();
    }
    public void setPatente() {
        System.out.println("Ingrese la patente: ");
        Scanner sc = new Scanner(System.in);
        patente = sc.nextLine();
    }


}
