package bank.core;

/**
 * Created by DESARROLLO on 21/07/16.
 */

import java.util.ArrayList;

public class Cuenta {

        private double saldo;
        private String nombre;
        private ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();

    public Cuenta(double saldo,String nombre) {
            this.saldo = saldo;
            this.nombre= nombre;
        }
        public double Deposito(double t){
            this.saldo=this.saldo+t;
            return this.saldo;
        }

        public double Retiro(double t){
            if(this.saldo>=t){
                this.saldo=this.saldo-t;
                return this.saldo; }
            else {System.out.println("Su saldo actual no le permite realizar esta transaccion");
                return this.saldo;}
        }
        public void consulta (){
            System.out.println("Su saldo es "+this.saldo);
        }


}
