/**
 * Created by DESARROLLO on 04/08/16.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrIte {

        public static void main(String[] args) throws IOException{
            ArrayList<Cuenta> a1 = new ArrayList<Cuenta>();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String A, B, C;
            String A2,B2,C2;
            float D,E;
            float D2,E2;
            int opc;
           // File fichero = new File("@Cuentas.txt");
            Scanner s = null;
            System.out.println("Tamaño del array: " + a1.size());
/** Hola*/
        do {
           System.out.println("\n\t\tBienvenido al Banco NoCompila");
                System.out.print("\nIntroduzca el numero de opcion deseada: \n");
                System.out.println("1) Crear cuenta");
                System.out.println("2) Deposit");
                System.out.println("3) Entrar");
                System.out.println("4) Transferir");
                System.out.println("5) Ver cuenta de ahorro");
                System.out.println("6) Salir\n");
                opc = Integer.parseInt(br.readLine());
                //System.out.println("Seleccion " +opc);

                switch(opc){
                    case 1:
                System.out.println("\nIngrese datos para la cuenta\n");
                System.out.print("Ingrese nombre y apellido: ");
                A=br.readLine();
                System.out.print("Ingrese numero de cedula: ");
                B=br.readLine();
                System.out.print("Ingrese numero de cuenta: ");
                C=br.readLine();
                System.out.print("Ingrese monto a depositar: ");
                D=Float.parseFloat(br.readLine());
                a1.add(new Cuenta (A,B,C,D));

                Iterator<Cuenta> ite = a1.iterator();
                   while(ite.hasNext()) {
                        Cuenta e1 = ite.next();
                System.out.println("\nBienvenido su cuenta ha sido creada! Sr. "+e1.getNom());//+System.lineSeparator()+e1.getCed()+System.lineSeparator()+e1.getCta()+System.lineSeparator()+e1.getSaldo());
            break;
            }

             case 2:
                        //System.exit(0);
                        break;
             case 3:
                        //System.exit(0);
                        break;
             case 4:
                        //System.exit(0);
                        break;
             case 5:
                 System.out.println("Informacion de la cuenta: \n");
                 Iterator<Cuenta> ite1 = a1.iterator();
                 while(ite1.hasNext()) {
                     Cuenta e2 = ite1.next();

                     System.out.println("Nombre: "+e2.getNom()+System.lineSeparator()+
                                        "Cedula: "+e2.getCed()+System.lineSeparator()+
                                        "Cuenta: "+e2.getCta()+System.lineSeparator()+
                                        "Saldo:  "+e2.getSaldo());
                 }
                        break;
                }
         }while(opc!=6);
            System.out.println();
        }

}
