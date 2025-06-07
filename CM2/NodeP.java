package CM2;

public class NodeP {
   
   Pasien pasien; 
   NodeP next;
   NodeP prev;

   NodeP(Pasien pasien) {
    this.pasien = pasien;
    this.next = null;
    this.prev = null;
   }

   public Pasien getPasien() {
        return pasien;
    }
}
