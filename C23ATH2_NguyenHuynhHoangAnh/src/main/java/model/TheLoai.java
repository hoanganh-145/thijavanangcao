/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TheLoai {
    private int macd;
    private String tencd;

    public TheLoai() {
    }

    public TheLoai(int macd) {
        this.macd = macd;
    }

    public TheLoai(int macd, String tencd) {
        this.macd = macd;
        this.tencd = tencd;
    }

    public int getMacd() {
        return macd;
    }

    public void setMacd(int macd) {
        this.macd = macd;
    }

    public String getTencd() {
        return tencd;
    }

    public void setTencd(String tencd) {
        this.tencd = tencd;
    }

    @Override
    public String toString() {
        return "ChuDe{" + "macd=" + macd + ", tencd=" + tencd + '}';
    }    
}
