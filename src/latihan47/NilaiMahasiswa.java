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
class NilaiMahasiswa {
    private float nilai_quiz, nilai_uts, nilai_uas, nilai_akhir;
    private String index, keterangan;
    
    public NilaiMahasiswa(float nilai_quiz, float nilai_uts, float nilai_uas){
        this.nilai_quiz = nilai_quiz;
        this.nilai_uts = nilai_uts;
        this.nilai_uas = nilai_uas;
    }

    public float getNilai_quiz() {
        return nilai_quiz;
    }

    public float getNilai_uts() {
        return nilai_uts;
    }

    public float getNilai_uas() {
        return nilai_uas;
    }

    public float getNilai_akhir() {
        return nilai_akhir;
    }

    public void hitungNilaiAkhir() {
        this.nilai_akhir = (float) ((0.20*this.nilai_quiz)+(0.30*this.nilai_uts)+(0.50*this.nilai_uas));
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(float nilai_akhir) {
        if (nilai_akhir > 80 && nilai_akhir <=100) {
            this.index = "A";
        }else if (nilai_akhir > 68 && nilai_akhir <= 80) {
            this.index = "B";
        }else if (nilai_akhir > 56 && nilai_akhir <= 68) {
            this.index = "C";
        }else if (nilai_akhir > 45 && nilai_akhir <= 56) {
            this.index = "D";
        }else if (nilai_akhir > 0 && nilai_akhir <= 45) {
            this.index = "E";
        }
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String index) {
        switch (index) {
            case "A":
                this.keterangan = "Sangat Baik";
                break;
            case "B":
                this.keterangan = "Baik";
                break;
            case "C":
                this.keterangan = "Cukup";
                break;
            case "D":
                this.keterangan = "Kurang";
                break;
            case "E":
                this.keterangan = "Sangat Kurang";
                break;
            default:
                break;
        }
    }
    
}
