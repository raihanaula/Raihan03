// ================= Kelas MainInventaris =================
public class MainInventaris {
    public static void main(String[] args) {
        // Membuat objek (instansiasi)
        Barang brg1 = new Barang("B001", "Laptop Dell", 10, 7500000);
        Barang brg2 = new Barang("B002", "Mouse Logitech", 50, 150000);

        // Tampilkan info awal
        System.out.println("--- Info Awal Barang ---");
        brg1.tampilkanInfo();
        brg2.tampilkanInfo();

        System.out.println("\n--- Setelah Penambahan Stok ---");
        // Method Overloading
        brg1.tambahStok();    // Menambah 1 stok (default)
        brg2.tambahStok(20);  // Menambah 20 stok sesuai parameter

        // Update info setelah stok bertambah
        brg1.tampilkanInfo();
        brg2.tampilkanInfo();
    }
}