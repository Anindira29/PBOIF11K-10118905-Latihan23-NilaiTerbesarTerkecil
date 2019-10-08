/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Niai Terbesar dan Terkecil
 */
public class PBOIF11K10118905Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @return
     */
    
    private static int cariTerkecil(int[] nilai_mhs){
        int max = 0, min =0, tmp =0;
        for (int i =0; i < nilai_mhs.length; i++){
            for (int j = i; j < nilai_mhs.length; j++){
                if (nilai_mhs[i] > nilai_mhs[j]){
                    if (tmp > nilai_mhs[j]){
                        min = nilai_mhs[j];
                    }
                    tmp = nilai_mhs[j];
                }
            }
        }
        return min;
    }
    
    private static int cariTerbesar(int[] nilai_mhs){
        int max =0, min = 0, tmp =0;
        for (int i =0; i < nilai_mhs.length; i++){
            for (int j =i; j < nilai_mhs.length; j++){
                if (max < nilai_mhs[i]){
                    max = nilai_mhs[i];
                    if (max < nilai_mhs[j]){
                        max = nilai_mhs[j];
                    }
                }
            }
        }
        return max;
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program nilai terbesar nilai terkecil mahasiswa=====");
        System.out.println("Masukkan nama petugas :");
        String petugas = sc.next();
        System.out.println("Masukkan banyak mahasiswa :");
        int jml_mhs = sc.nextInt();
        int [] nilai_mhs = new int [jml_mhs];
        for (int i =0; i < jml_mhs; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+":");
            nilai_mhs[i] = sc.nextInt();
        }
        
        System.out.println("==========Hasil nilai mahasiswa adalah=========");
        for (int i =0; i < jml_mhs; i++){
            System.out.println("Nilai mahasiswa ke-" +nilai_mhs[i]);
        }
        
        System.out.println("\nNilai terbesar adalah "+ cariTerbesar(nilai_mhs));
        System.out.println("Nilai terkecil adalah "+cariTerkecil(nilai_mhs));
        System.out.println("\n petugas "+petugas);
    }
}



