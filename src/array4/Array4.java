/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array4;

/**
 *
 * @author Mokleters
 */
public class Array4 {

        int nis [][] = {{210650},{210651},{210652}};
        String nama [][] = {{"Alif Akbar"},{"Aisyatush Shofiah"},{"Anggana Duhita"}};
        public void tampil(String n){
        System.out.println("Identitas Siswa Angkatan 24");
        }
        
        public void namanim (int n){
        for (int i=0; i<1; i++){
        for (int j=0; j<1; j++){
        System.out.println(nama[1][j]+":"+nis[1][j]);
        }
        }
        }
        
        public static void main(String[] args){
        Array4 siswa = new Array4();
        siswa.tampil(null);
        siswa.namanim(0);
        }
    }
    