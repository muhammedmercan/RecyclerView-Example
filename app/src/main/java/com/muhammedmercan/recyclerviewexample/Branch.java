package com.muhammedmercan.recyclerviewexample;

import androidx.annotation.NonNull;

public class Branch {
    private String txtName;
    private String txtPuan;
    private String txtSıralama;
    private int logo;


    public Branch(String txtName, String txtPuan, String txtSıralama, int logo) {
        this.txtName = txtName;
        this.txtPuan = txtPuan;
        this.txtSıralama = txtSıralama;
        this.logo = logo;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtPuan() {
        return txtPuan;
    }

    public void setTxtPuan(String txtPuan) {
        this.txtPuan = txtPuan;
    }

    public String getTxtSıralama() {
        return txtSıralama;
    }

    public void setTxtSıralama(String txtSıralama) {
        this.txtSıralama = txtSıralama;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
