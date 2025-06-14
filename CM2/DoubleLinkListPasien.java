package CM2;

public class DoubleLinkListPasien {
    NodeP head;
    NodeP tail;

    public DoubleLinkListPasien() {
        head = null;
        tail = null;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void tambahPasien(Pasien pasien) {
        NodeP newNode = new NodeP(pasien);
        if (IsEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Pasien layaniPasien() {
        if (IsEmpty()) {
            System.out.println("Antrean kosong, tidak ada pasien untuk dilayani.");
            return null;
        }

        Pasien pasienDilayani = head.pasien;

        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            head = head.next;
            if (head != null) { 
                head.prev = null;
            }
        }
        return pasienDilayani;
    }

    public int getSize() {
        int count = 0;
        NodeP current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void lihatAntrian() {
        int count = 0;
        NodeP current = head;
        System.out.println("-- Antrian Pasien --");
        while (current != null) {
            System.out.println("Antrian ke " + (count + 1));
            System.out.println("Nama pasien : " + current.pasien.nama);
            System.out.println("NIK         : " + current.pasien.nik);
            System.out.println("Keluhan     : " + current.pasien.keluhan);
            current = current.next;
            count++;
        }
    }
}
