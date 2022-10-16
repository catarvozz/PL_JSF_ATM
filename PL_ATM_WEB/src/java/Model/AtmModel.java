/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Dao.AtmDao;
/**
 *
 * @author ASUS
 */
public class AtmModel implements AtmDao{

    InisialisasiSaldo saldo;
    
    public AtmModel(){
        this.saldo = new InisialisasiSaldo();
    }
    public int limitSaldo(){
        return this.saldo.batassSaldo;
    }
    @Override
    public int getSaldo() {
        return this.saldo.getSaldoAwal();
    }
    @Override
    public int cekTransaksi(int jumlah) {
        if(jumlah % 50000 == 0){
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public void tambahSaldo(int jumlah) {
        saldo.setSaldoAwal(saldo.getSaldoAwal()+jumlah);
    }
    @Override
    public void tarikSaldo(int jumlah) {
        saldo.setSaldoAwal(saldo.getSaldoAwal()-jumlah);
    }
    @Override
    public boolean cekBatasSaldo() {
        if(this.saldo.getSaldoAwal() <= this.saldo.batassSaldo){
            return true;
        } else {
            return false;
        }
    }
}