package bnkui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Bank.core.CrearCuenta;
import Bank.core.Deposit;
import com.sun.org.apache.xpath.internal.operations.String;


/**
 * Created by user on 07/19/2016.
 */
public class MenuBanco {
    public static void main(String[] args) throws IOException {
       CrearCuenta CD = new CrearCuenta();
       Deposit DE = new Deposit();
        int opc = 0,NumC = 0,X=0;
        float CantS = 0, Ad = 0;
        java.lang.String NomC;
        String Cta;
        ArrayList<java.lang.String> L1= new ArrayList<java.lang.String>();
        ArrayList<Integer> L2= new ArrayList<>();
        ArrayList<Float> L3= new ArrayList<>();


        do {
            System.out.println("\t\tBienvenido al Banco NoCompils");
            System.out.print("\nIntroduzca el numero de opcion deseada: \n");
            System.out.println("1) Crear cuenta");
            System.out.println("2) Deposit");
            System.out.println("3) Entrar");
            System.out.println("4) Transferir");
            System.out.println("5) Ver cuenta de ahorro");
            System.out.println("6) Salir\n");
            BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
            opc = Integer.parseInt(k.readLine());
            System.out.println("Seleccion " + opc);

            if (opc == 1) {
                System.out.println("Ingrese los datos del cliente para nueva cuenta");

                System.out.print("Ingrese un numero de cuenta: ");
                NumC = Integer.parseInt(k.readLine());
                CD.setNumCta(NumC);
                L2.add(CD.getNumCta());

                System.out.print("Ingrese nombre y apellido: ");
                NomC = k.readLine();
                CD.setNom(NomC);
                L1.add(CD.getNom());

                System.out.print("Ingrese monto a depositar por apertura: ");
                CantS = Float.parseFloat(k.readLine());
                CD.setSaldo(CantS);
                L3.add(CD.getSaldo());

                System.out.println("\nSu cuenta ha sido creada: \nNumero de cuenta: " + NumC + "\nNombre: " + NomC + "\nMonto despositado: " + CantS);
                System.out.println("\n");
                System.out.println("prueba posicion "+L3.indexOf(CD.getSaldo()));

            }
            if(opc == 2) {

                System.out.print("Ingrese numero de cuenta: ");
                X = Integer.parseInt(k.readLine());
                if (X==NumC) {
                    System.out.println("\nBienvenido: " + CD.getNom());

                    System.out.print("\nIngrese monto a depositar: ");
                    Ad = Float.parseFloat(k.readLine());
                    DE.setAdd(Ad);
                    CantS += Ad;
                    CD.setSaldo(CantS);
                    System.out.println("\nNuevo saldo: " + CD.getSaldo());
                    System.out.println("\n");

                } else {
                    System.out.println("La cuenta no existe\n");

                }
            }


/**
 else if (cur[i].opc==3){
 cur[i].acn+=1;
 cur[i].ccost=600;}
 else if  (cur[i].opc==4){
 cout<<"\nSalir Calculo Finalizado \n";
 return EXIT_SUCCESS;}
 else if ((cur[i].opc<=0)||(cur[i].opc>4)){
 cout<<"\nTurno Inexistente Calculo Finalizado \n";
 return EXIT_SUCCESS;}

 */

        }while (opc != 6) ;
    }
}
