/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;


/**
 *
 * @author ASUS
 */
public class UserID {

    private static String ID;
    private static String nama_admin;
    
    public static String getUserLogin() {
        return ID;
    }
    
    public static void setUserLogin(String kode){
        ID=kode;
    }
    
        public static String getNamaLogin() {
        return nama_admin;
    }

    public static void setNamaLogin(String nama_admin) {
        UserID.nama_admin = nama_admin;
    }
   
}
