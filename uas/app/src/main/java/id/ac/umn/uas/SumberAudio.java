package id.ac.umn.uas;

import java.io.Serializable;

public class SumberAudio implements Serializable {
    private String judul;
    private String keterangan;
    private String URI;

    public SumberAudio(String judul, String keterangan, String URI){
        this.judul = judul;
        this.keterangan = keterangan;
        this.URI = URI;
    }
    public String getJudul() { return this.judul; }
    public String getKeterangan() { return this.keterangan; }
    public String getURI() { return this.URI; }
    public String toString() { return this.getJudul() + " => " + this.getKeterangan(); }
}
