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

    public Pasien peek() { 
        if (IsEmpty()) {
            return null;
        }
        return head.pasien;
    }

    
}
