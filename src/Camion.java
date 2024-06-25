import java.util.Collections;
import java.util.Scanner;

public class Camion extends Vehiculo{
    int carga;
     public void setMarca(){
         System.out.println("Ingrese la marca del camion: ");
        Scanner sc = new Scanner(System.in);
        marca = sc.nextLine();
     }
     public void setCarga(){
         this.carga = carga;
         System.out.println("Ingrese la carga: ");
         Scanner sc = new Scanner(System.in);
         carga = sc.nextInt();
     }

     public void setPatente(){
         System.out.println("Ingrese la patente del camion: ");
         Scanner sc = new Scanner(System.in);
         patente = sc.nextLine();
     }
}
