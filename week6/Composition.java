package week6;
import java.util.*;
import java.io.*;

/**
 *
 * @author Berl
 */

class Buku {
    public String title;
    public String writer;
    public String release;
    
    Buku(String title, String writer, String release){
        this.title = title;
        this.writer = writer;
        this.release = release;
    }
}

class jumlahbuku {
    private final List<Buku> bbuku;
    
    jumlahbuku(List<Buku> bbuku){
        this.bbuku = bbuku;
    }

    public List<Buku> getjumlahbuku() {
        return bbuku;
    }
}

public class Composition {
    public static void main(String[] args) {
        Buku b1 = new Buku("Secret of Love", "kth", "13 maret 2021");
        Buku b2 = new Buku("Singgah", "thhv", "2 desember 2021");
        Buku b3 = new Buku("Mahika", "reysecret", "2 April Oktober 2021");
        
        List<Buku> bbuku = new ArrayList<Buku>();
        bbuku.add(b1);
        bbuku.add(b2);
        bbuku.add(b3);
        
        jumlahbuku jbuku = new jumlahbuku(bbuku);
        List<Buku> b = jbuku.getjumlahbuku();
        
        System.out.println("\tList Buku AU");
        for(Buku sg : b){
            System.out.println("Title   : " + sg.title);
            System.out.println("writer  : " + sg.writer);
            System.out.println("Release : " + sg.release);
        }
        
    }
    
}