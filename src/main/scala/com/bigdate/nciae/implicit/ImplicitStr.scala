package com.bigdate.nciae

/**
 * Created by Rainbow on 2016/11/11.
 */
object ImplicitStr {


  object MyPredef {
    implicit val name = "xiaohan"
    implicit val sex = 0
  }


  def sayHi()(implicit name: String = "xiaozhang"): Unit = {
    println(s"Hi~$name")
  }


  def main(args: Array[String]) {
    import com.bigdate.nciae.ImplicitStr.MyPredef._
    sayHi()
  }

}
