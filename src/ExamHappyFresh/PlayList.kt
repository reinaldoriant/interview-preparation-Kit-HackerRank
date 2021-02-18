package ExamHappyFresh

import java.util.HashMap
import kotlin.collections.*

//Your music player contains N different songs and she wants to listen to L (not necessarily different) songs during your trip.  You create a playlist so that:
//
//Every song is played at least once
//A song can only be played again only if K other songs have been played
//Return the number of possible playlists.

// Complete the minimumBribes function below.
fun playlist(songs: Array<Int>): Long {
    val c = IntArray(60)
    var res:Long = 0
    for (t in songs) {
        res += c[(60 - t % 60) % 60]
        c[t % 60] += 1
    }
    return res
}

fun main(args: Array<String>) {
    val songsCount = readLine()!!.trim().toInt()
    val songs=Array<Int>(songsCount, { 0 })
    for(i in 0 until songsCount){
        val songsItem= readLine()!!.trim().toInt()
        songs[i]=songsItem
    }
    val result=playlist(songs)
    print(result)
}
