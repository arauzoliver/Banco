package Bank.core;

/**
 * Created by user on 07/19/2016.
 */
public class CrearCuenta extends Cliente{
        private float Saldo;

        public void setSaldo(Float Saldo) {
            this.Saldo = Saldo;
        }
        public float getSaldo() {
            return Saldo;
        }
}
