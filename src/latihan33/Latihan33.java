/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan33 {
private static String uName, passwd;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u = new User();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        uName = sc.next();
        System.out.print("Masukkan Password = ");
        passwd = sc.next();
        System.out.println();
        u.PengecekkanLogin(uName, passwd);
    }
    
}
