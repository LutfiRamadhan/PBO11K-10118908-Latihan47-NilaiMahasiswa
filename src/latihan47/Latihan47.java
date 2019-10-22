/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan47;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nm = new NilaiMahasiswa(75,45,34);
        nm.hitungNilaiAkhir();
        nm.setIndex(nm.getNilai_akhir());
        nm.setKeterangan(nm.getIndex());
        System.out.println("QUIZ\t\t= "+nm.getNilai_quiz());
        System.out.println("UTS\t\t= "+nm.getNilai_uts());
        System.out.println("UAS\t\t= "+nm.getNilai_uas());
        System.out.println("\nNilai Akhir\t= "+nm.getNilai_akhir());
        System.out.println("\nIndex = "+nm.getIndex());
        System.out.println("Keterangan = "+nm.getKeterangan());
    }

}
