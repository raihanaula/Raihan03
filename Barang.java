// ================= Kelas Barang =================
public class Barang {
    // 1. Atribut 
    public String kodeBarang;
    public String namaBarang;
    public int stok;
    public double harga;

    // 2. Constructor dengan 4 parameter
    public Barang(String kode, String nama, int stokAwal, double hargaBarang) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.stok = stokAwal;
        this.harga = hargaBarang;
    }

    // 3. Method Overloading - Versi 1
    public void tambahStok() {
        this.stok = this.stok + 1;
    }

    // 3. Method Overloading - Versi 2
    public void tambahStok(int jumlah) {
        this.stok = this.stok + jumlah;
    }
    
    // 4. Method dengan Return Value (Total Nilai Stok)
    public double hitungTotalNilaiStok() {
        return this.stok * this.harga;
    }

    // 5. [BARU] Method untuk menampilkan informasi Barang (termasuk total nilai stok)
    public void tampilkanInfo() {
        System.out.println("Kode: " + kodeBarang + 
                           " | Nama: " + namaBarang + 
                           " | Stok: " + stok + 
                           " | Harga: " + harga + 
                           " | Total Nilai: " + hitungTotalNilaiStok());
    }
}
