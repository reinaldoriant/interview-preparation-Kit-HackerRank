//import java.io.*
//import java.math.*
//import java.security.*
//import java.text.*
//import java.util.*
//import java.util.concurrent.*
//import java.util.function.*
//import java.util.regex.*
//import java.util.stream.*
//import kotlin.collections.*
//import kotlin.comparisons.*
//import kotlin.io.*
//import kotlin.jvm.*
//import kotlin.jvm.functions.*
//import kotlin.jvm.internal.*
//import kotlin.ranges.*
//import kotlin.sequences.*
//import kotlin.text.*
//
///* Ada game seluler baru yang dimulai dengan cloud yang diberi nomor secara berurutan. Beberapa awan adalah petir dan yang lainnya adalah kumulus. Pemain dapat melompat di awan kumulus apa pun yang memiliki angka yang sama dengan jumlah awan saat ini plus atau. Pemain harus menghindari kepala petir. Tentukan jumlah lompatan minimum yang diperlukan untuk melompat dari posisi awal ke awan terakhir. Selalu mungkin untuk memenangkan pertandingan.
//
//Untuk setiap permainan, Anda akan mendapatkan serangkaian awan bernomor jika aman atau harus dihindari.*/
//// Complete the jumpingOnClouds function below.
//fun jumpingOnClouds(c: Array<Int>): Int {
//    var count = 0//12
//    var i =0 //1234
//    while (i < c.size - 1){          //mutating the current element,                                                                        //use a while loop instead.
//        if (c[i] == 0)  i++
//        count++
//        i++
//    }
//    return count
//}
//
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//
//    val result = jumpingOnClouds(c)
//
//    println(result)
//}
