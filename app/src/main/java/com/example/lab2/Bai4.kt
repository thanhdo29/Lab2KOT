package com.example.lab2

fun main(){
    var s:String?
    var tensv:String= ""
    var mssv:String=""
    var diem:Float
    var datotnghiep:Boolean?=null
    var tuoi:Int?=null
    var listSv= mutableListOf<SinhVien>()
    var delput:Int=0

    println("Chương trình quản lý sinh viên")

   do {
       println("Chọn chức năng: ")
       println("1. Thêm sinh viên")
       println("2. Sửa sinh viên")
       println("3. Xóa sinh viên")
       println("4.Xem danh sách sinh viên")
       println("5. Tiếp tục")
       println("Chọn chức năng: ")
       s = readLine()

       when (s) {
           "1"->{
               println("Nhập tên sinh viên: ")
               s= readLine()
               if (s!= null){
                   tensv=s
               }

               println("Nhập mã sinh viên: ")
               s= readLine()
               if (s!= null){
                   mssv=s
               }

               do {
                   println("Nhập điểm sinh viên: ")
                   s = readLine()
                   if (s== null) {
                       println("Điểm không được để trống")
                   } else {
                       try {
                           diem = s.toFloat()
                           break
                       } catch (e: NumberFormatException) {
                           println("Điểm phải là một số")
                       }
                   }
               } while (true)


               var sv=SinhVien(tensv, mssv, diem)
               listSv.add(sv)
           }
           "2" -> {
               println("Nhập mã sinh viên sửa: ")
               s= readLine()
               if (s!= null){
                   delput=s.toInt()
               }
               if (delput in listSv.indices) {
                   println("Nhập tên sinh viên: ")
                   s = readLine()
                   if (s != null) {
                       listSv[delput - 1].tenSv = s
                   }

                   println("Nhập mã sinh viên: ")
                   s = readLine()
                   if (s != null) {
                       listSv[delput - 1].mssv = s
                   }

                   do {
                       println("Nhập điểm sinh viên: ")
                       s = readLine()
                       if (s == null) {
                           println("Điểm không được để trống")
                       } else {
                           try {
                               diem = s.toFloat()
                               listSv[delput - 1].diemTb = diem
                               break
                           } catch (e: NumberFormatException) {
                               println("Điểm phải là một số")
                           }
                       }
                   } while (true)
                   println("Thông tin sinh viên đã được cập nhật.")
               } else {
                   println("Sinh viên không tồn tại.")
               }
           }
           "3" -> {
               println("Nhập mã sinh viên cần xóa: ")
                s = readLine()
               if (s!= null){
                   delput=s.toInt()
               }
               if (delput in listSv.indices) {
                   listSv.removeAt(delput - 1)
                   println("Sinh viên đã được xóa khỏi danh sách.")
               } else {
                   println("Sinh viên không tồn tại.")
               }
           }
           "4"->{
               println("Danh sách sinh viên: ")
               for (i in listSv.indices){
                   println("Sinh viên thứ $i: ${listSv.get(i).getThongTin()}")
               }
           }
           "5" -> {
               continue
           }
           else -> {
               println("Chức năng không hợp lệ.")
           }
       }

       println("Bạn có muốn tiếp tục chương trình không(y/n)?")
       s= readLine()
       if (s=="n"){
           break
       }
   }while (true)

}