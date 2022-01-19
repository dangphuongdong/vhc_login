package com.example.loginsmartw.Models;

import javafx.scene.control.CheckBox;

public class Model {
    private  String severity;
    private  String ne;
    private  String loaiThietBi;
    private  String batDau;
    private  String ngayTao;
    private  String mien;
    private  String canhBao;
    private  String dai;
    private  String to;
    private  String tinh;
    private  String huyen;
    private CheckBox all;

    public CheckBox getAll() {
        return all;
    }

    public void setAll(CheckBox all) {
        this.all = all;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getNe() {
        return ne;
    }

    public void setNe(String ne) {
        this.ne = ne;
    }

    public String getLoaiThietBi() {
        return loaiThietBi;
    }

    public void setLoaiThietBi(String loaiThietBi) {
        this.loaiThietBi = loaiThietBi;
    }

    public String getBatDau() {
        return batDau;
    }

    public void setBatDau(String batDau) {
        this.batDau = batDau;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMien() {
        return mien;
    }

    public void setMien(String mien) {
        this.mien = mien;
    }

    public String getCanhBao() {
        return canhBao;
    }

    public void setCanhBao(String canhBao) {
        this.canhBao = canhBao;
    }

    public String getDai() {
        return dai;
    }

    public void setDai(String dai) {
        this.dai = dai;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public Model(String severity, String nE, String loaiThietBi, String batDau, String ngayTao, String mien, String canhBao, String dai, String to, String tinh, String huyen) {
        this.severity = severity;
        this.ne = nE;
        this.loaiThietBi = loaiThietBi;
        this.batDau = batDau;
        this.ngayTao = ngayTao;
        this.mien = mien;
        this.canhBao = canhBao;
        this.dai = dai;
        this.to = to;
        this.tinh = tinh;
        this.huyen = huyen;
        this.all=new CheckBox();
    }

    public Model() {
    }
}
