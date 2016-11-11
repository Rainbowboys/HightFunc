package com.bigdata.nciae


import com.bigdate.nciae.{Chooser, Girl}
import com.bigdate.nciae.MyPredef._

object TestGirl {


  def main(args: Array[String]) {

    val c = new Chooser[Girl]
    val gril1 = new Girl("xiarong", 78)
    val gril2 = new Girl("xiaohui", 80)
    val result = c.choose(gril1, gril2)

    println(result.name)

  }

}
