/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author ASUS
 */
public interface AtmDao {
    int getSaldo();
    
    int cekTransaksi(int jumlah);
    
    void tambahSaldo(int jumlah);
    
    void tarikSaldo(int jumlah);
    
    boolean cekBatasSaldo();
}
