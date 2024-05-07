package com.example.lab2

fun main(){
    var year=0
    var s:String?

    println("Chương trình kiểm tra năm nhuận")
    do {
        println("Nhập 1 năm: ")
        s= readLine()
        while (s==null || s.toInt()<0){
            println("Nhập năm sai, vui lòng nhập lại!")
            s= readLine()
        }

        year=s.toInt()

        if (year%4==0 && year%100!= 0 || year%400==0){
            println("Năm $year là năm nhuận")
        }else{
            println("Năm $year không phải là năm nhuận")
        }
        println("Bạn có muốn thoát chương trình không?(c/k): ")
        s= readLine()
        if (s=="c"){
            break
        }

    }while (true)

    println("Kết thúc chương trình")
}