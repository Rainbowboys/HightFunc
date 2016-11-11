package com.bigdata.nciae

import com.bigdate.nciae.{MrBoy, Boy}

object TestBoy {
  // 原始 java 方式
  def main(args: Array[String]) {
    val m = new MrBoy[Boy]
    val b1 = new Boy("xiaozhang", 99)
    val b2 = new Boy("xiaohan", 999)
    val result = m.choose(b1, b2)
    println(b2.compareTo(b1))
    println(result.name)
  }

}
