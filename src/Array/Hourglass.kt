package Array
//import java.util.*
//
//Given a 6x6  2D Array, Calculate the hourglass sum for every hourglass in arr , then print the maximum hourglass sum. The array will always be 6x6

//// Complete the hourglassSum function below.
//fun hourglassSum(arr: Array<Array<Int>>): Int {
//    var highest = 0
//    var first = true
//    for (i in 0..3){
//        for (r in 0..3){
//            val firstRow = arr[i][r] + arr[i][r+1] + arr[i][r+2]
//            val secondRow = arr[i+1][r+1]
//            val thirdRow = arr[i+2][r] + arr[i+2][r+1] + arr[i+2][r+2]
//            val totalValue = firstRow + secondRow + thirdRow
//            if (first){
//                highest = totalValue
//                first = false
//            }
//            else {
//                if (totalValue > highest){
//                    highest = totalValue
//                }
//            }
//        }
//
//
//    }
//    return highest
//}
//
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//
//    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })
//
//    for (i in 0 until 6) {
//        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
//    }
//
//    val result = hourglassSum(arr)
//
//    println(result)
//}
