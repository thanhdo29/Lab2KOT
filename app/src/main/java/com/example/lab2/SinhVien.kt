package com.example.lab2

class SinhVien(var tenSv:String, var mssv:String, var diemTb:Float) {
    var daTotNghiep:Boolean?=null
    var tuoi:Int?=null

    constructor( tenSv:String,  mssv:String,  diemTb:Float, datotnghiep:Boolean, tuoi:Int):this(tenSv, mssv, diemTb){
        this.daTotNghiep=datotnghiep
        this.tuoi=tuoi
    }

    fun getThongTin():String{
        var thongtin:String
        if (daTotNghiep!= null && tuoi!= null){
            thongtin="Tên: $tenSv, Mssv: $mssv, Điểm: $diemTb, đã tốt nghiêp: $daTotNghiep, Tuổi: $tuoi"
        }else{
            thongtin="Tên: $tenSv, Mssv: $mssv, Điểm: $diemTb"
        }

        return thongtin
    }
}