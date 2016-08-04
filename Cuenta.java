/**
 * Created by DESARROLLO on 04/08/16.
 */
public class Cuenta {
    private String Nom;
    private String Ced;
    private String Cta;
    public float Saldo;

    public Cuenta(String A, String B, String C, float D) {
        Nom = A;
        Ced = B;
        Cta = C;
        Saldo = D;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCed() {
        return Ced;
    }

    public void setCed(String ced) {
        Ced = ced;
    }

    public String getCta() {
        return Cta;
    }

    public void setCta(String cta) {
        Cta = cta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }


}
