//import java.util.*
//
//
///*// Complete the repeatedString function below.
//fun repeatedString(s: String, n: Long): Long {
//    val numOfS: Long = n / s.length
//    val rest: Long = n % s.length
//
//    if (!s.contains("a")) return 0
//    return if (s.length > n) aCounter(s, rest) else numOfS * aCounter(s, s.length.toLong()) + aCounter(s, rest)
//
//}
//private fun aCounter(s: String, end: Long): Long {
//    var a = 0
//    for (i in 0 until end) {
//        if (s[i.toInt()] == 'a') a++
//    }
//    return a.toLong()
//}*/
//
//fun repeatedString(s: String, n: Long): Long {
//    val fullRepeats = n.div(s.length)
//    val leftOver = (n % s.length).toInt()
//
//    val perString = s.count { it == 'a' }
//    val remainder = s.take(leftOver).count { it == 'a' }
//    return fullRepeats.times(perString).plus(remainder)
//}
//
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val s = scan.nextLine()
//
//    val n = scan.nextLine().trim().toLong()
//
//    val result = repeatedString(s, n)
//
//    println(result)
//}
