//import java.util.*
//
//
////Ada tumpukan kaus kaki besar yang harus dipadankan dengan warna.
//// Diberikan serangkaian bilangan bulat yang mewakili warna setiap kaus kaki,
//// tentukan berapa banyak pasang kaus kaki dengan warna yang serasi.
////contoh : 10 tumpukan dan warna disana ada [1,1,2,2,4,5,1,2,1,2]
//// Complete the sockMerchant function below.
//fun sockMerchant(n: Int, ar: Array<Int>): Int {
//    val set = HashSet<Int>()
//    var count = 0
//    for (i in 0 until n) {
//        val element = ar[i]
//        if (set.contains(element)) {
//            set.remove(element)
//            count++
//        } else {
//            set.add(element)
//        }
//    }
//    return count
//
//}
//
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val n = scan.nextLine().trim().toInt()
//
//    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//
//    val result = sockMerchant(n, ar)
//
//    println(result)
//}
