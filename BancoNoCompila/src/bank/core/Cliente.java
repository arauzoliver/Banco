package bank.core;

/**
 * Created by DESARROLLO on 20/07/16.
 */
public class Cliente {

        private int numcuenta;
        private int cedula;
        private double saldo;
        private String tipo = "ahorro";
        private String password;

        public Cliente(int numcuenta, int cedula, String tipo, String password) {
            this.numcuenta = numcuenta;
            this.cedula = cedula;
            this.tipo = tipo;
            this.password = password;
        }

        public int getNumcuenta() {
            return numcuenta;
        }

        public void setNumcuenta(int numcuenta) {
            this.numcuenta = numcuenta;
        }

        public int getCedula() {
            return cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }
