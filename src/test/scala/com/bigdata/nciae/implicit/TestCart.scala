package com.bigdata.nciae

import com.bigdate.nciae.{MissCart, Cart}


/**
 * Created by Rainbow on 2016/11/11.
 */
object TestCart {

  def main(args: Array[String]) {
    import com.bigdate.nciae.MyPredef._
    val miss = new MissCart[Cart]
    val cart01 = new Cart("Ben", 9999, 90)
    val cart02 = new Cart("AoDi", 9999, 80)
   // val result = miss.choose(cart01, cart02)
    // val result = miss.select(cart01, cart02)
     val result = miss.change(cart01, cart02)
    println(result.name)
  }

}
