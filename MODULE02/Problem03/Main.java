package MODULE02.Problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        // Pada baris ini terjadi error karena kurangnya titik koma (;)
        // e.name = "Roi"
        e.name = "Roi";

        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");

        // Nilai umur perlu diberikan agar output sesuai dengan yang diminta.
        e.age = 17;

        // Pada baris ini terdapat bug karena teks output tidak sesuai
        // dengan format output yang diminta pada lembar kerja.
        // System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());

        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);

        // Pada baris ini terdapat bug karena output belum menampilkan kata "tahun".
        // System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}