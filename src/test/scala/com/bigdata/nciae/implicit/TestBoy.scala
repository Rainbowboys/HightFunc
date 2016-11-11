package com.bigdata.nciae

import com.bigdate.nciae.Boy

object TestBoy {

  def main(args: Array[String]) {
    val b1 = new Boy("xiaozhang", 99)
    val b2 = new Boy("xiaohan", 999)
    println(b2.compareTo(b1))
  }

}
