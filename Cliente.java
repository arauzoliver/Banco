package Bank.core;

/**
 * Created by user on 07/19/2016.
 */
public abstract class Cliente {
        private String Nom;
        private int NumCta;

        public void setNom(String Nom) {
            this.Nom = Nom;
        }
        public String getNom() {
            return Nom;
        }
        public void setNumCta(int NumCta) {
            this.NumCta = NumCta;
        }
        public int getNumCta() {
            return NumCta;
        }

}
