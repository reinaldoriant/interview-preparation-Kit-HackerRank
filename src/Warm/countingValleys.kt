package Warm//import java.util.*
//
///*
// * Complete the 'countingValleys' function below.
// *
// * The function is expected to return an INTEGER.
// * The function accepts following parameters:
// *  1. INTEGER steps
// *  2. STRING path
// */
//
///*
//Seorang pendaki yang rajin membuat catatan yang cermat tentang pendakian mereka. Selama pendakian terakhir yang mengambil langkah tepat, untuk setiap langkah dicatat apakah itu anak tangga yang menanjak, atau menurun. Pendakian selalu dimulai dan diakhiri di permukaan laut, dan setiap langkah naik atau turun mewakili satuan perubahan ketinggian. Kami mendefinisikan istilah-istilah berikut:
//
//Gunung adalah urutan langkah yang berurutan di atas permukaan laut, dimulai dengan naik dari permukaan laut dan diakhiri dengan turun ke permukaan laut.
//Lembah adalah urutan langkah berurutan di bawah permukaan laut, dimulai dengan turun dari permukaan laut dan diakhiri dengan turun ke permukaan laut.
//Mengingat urutan langkah naik dan turun selama pendakian, temukan dan cetak jumlah lembah yang dilalui.
//*/
//
//fun countingValleys(steps: Int, path: String): Int {
//    // Write your code here
//    var valley=0
//    var altitude =0
//    var path1= path.split(' ').toString()
//    for (i in 1..steps){
//        val ch = path1[i]
//        if (ch == 'U') {
//            altitude++
//            if (altitude == 0) {
//                valley++
//            }
//        } else {
//            altitude--
//        }
//    }
//    return valley
//}
//
//fun main(args: Array<String>) {
//    val steps = readLine()!!.trim().toInt()
//
//    val path = readLine()!!
//
//    val result = countingValleys(steps, path)
//
//    println(result)
//}
//
