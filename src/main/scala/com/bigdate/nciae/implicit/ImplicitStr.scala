package com.bigdate.nciae

/**
 * Created by Rainbow on 2016/11/11.
 */

import com.bigdate.nciae.MyPredef._
object ImplicitStr {

  def sayHi()(implicit name: String = "xiaozhang"): Unit = {
    println(s"Hi~$name")
  }


  def main(args: Array[String]) {

    sayHi()
  }

}
