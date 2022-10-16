/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AtmModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author ASUS
 */
@ManagedBean(name="atmController")
@SessionScoped
public class AtmController {
    private AtmModel model;
    private String tampilanSetorTunani;
    private String tampilanTarikTunai;
    private int jumlah;
    
    public AtmController() {
        model = new AtmModel();
    }
    public String getTampilanSetorTunai() {
        if(model.cekTransaksi(jumlah)==1){
            model.tambahSaldo(jumlah);
            return "Setor Tunai Berhasil";
        } else{
            return ("Setor Tunai harus kelipatan 50000");
        }
    }
    public String getTampilanTarikTunai() {         
        if(model.cekBatasSaldo()){
            return "Saldo Anda Mencapai Limit";
        } else if((model.getSaldo()- jumlah)< model.limitSaldo()){
            return "Jumlah Penarikan melebihi limit penarikan";
        } else if((model.getSaldo()> jumlah) && (model.cekTransaksi(jumlah) == 1)){
            model.tarikSaldo(jumlah);
            return "Tarik Tunai Berhasil";
        } else{
            return  "Penarikan harus kelipatan 50000";
        }    
    } 
    public int cekSaldo(){
        return model.getSaldo();
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}