package MODULE02.Problem03;
// Pada baris ini terjadi error karena nama class Pegawai tidak sesuai
// dengan nama class Employee yang digunakan pada Main.java.
// public class Pegawai {
public class Employee {

    public String name;

    // Pada baris ini terjadi error karena tipe data char hanya dapat
    // menyimpan satu karakter, sedangkan asal pegawai berupa teks.
//    public char origin;
    public String origin;

    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    // Pada baris ini terjadi error karena method setRole tidak memiliki
    // parameter, padahal Main.java mengirimkan nilai String "Assasin".
//    public void setRole() {
    public void setRole(String r) {

        // Pada baris ini terjadi error karena variabel r belum dideklarasikan
        // sebagai parameter pada method setRole.
//        this.role = r;
        this.role = r;
    }
}