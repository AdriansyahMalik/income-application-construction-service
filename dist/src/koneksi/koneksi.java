/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek");
        }
        catch( ClassNotFoundException ex ) {
            System.out.println("gagal koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/jasa_kontruksi";
        try{
            koneksi = DriverManager.getConnection(url, "root","");
            System.out.println("berhasil Koneksi database");
        }
        catch(SQLException ex){
            System.out.println("gagal Koneksi database"+ex);
        }
        return koneksi;

    }
}
