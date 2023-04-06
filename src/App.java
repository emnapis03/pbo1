public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Kucing kucing1 = new Kucing();
        Kucing kucing2 = new Kucing();
        Kucing kucing3 = new Kucing();

        kucing1.id=0;
        kucing1.nama="Dogy";
        kucing1.jenis="Anggora";

        kucing2.id=2;
        kucing2.nama="Dogy";
        kucing2.jenis="Anggora";

        kucing3.id=3;
        kucing3.nama="Dogy";
        kucing3.jenis="Anggora";

        kucing1.keterangan();
        kucing2.keterangan();
        kucing3.keterangan();
    }
}
