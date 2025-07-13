package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
       Matematika jonwar = new Matematika(3,4);
       
       System.out.println("Hasil penjumlahan: "+jonwar.setPenjumlahan());
       System.out.println("Hasil pengurangan: "+jonwar.setPengurangan());
       System.out.println("Hasil perkalian: "+jonwar.setPerkalian());
       System.out.println("Hasil pembagian: "+jonwar.setPembagian());
    }
}
