import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Autobus a = new Autobus();
        Camion c = new Camion();
        int opcion;
        do {
            System.out.println("1. Ingresar un vehiculo");
            System.out.println("2. Ingresar un autobus");
            System.out.println("3. Ingresar un camion");
            System.out.println("4. Salir");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    v.setMarca();
                    v.setPatente();
                    break;
                case 2:
                    a.setMarca();
                    a.setPatente();
                    a.setCantidadAsientos();
                    break;
                case 3:
                    c.setMarca();
                    c.setPatente();
                    c.setCarga();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}