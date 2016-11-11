package com.bigdate.nciae

import java.io.File

import scala.io.Source
import com.bigdate.nciae.MyPredef._

/**
 * 隐式 转换  装饰模式 增强  demo
 *
 */

class RichFile(f: File) {
  def read() = Source.fromFile(f).mkString
}


object ImplicitValue {

  def main(args: Array[String]) {
    val f = new File("E://pom.xml")
    val context = f.read()
    println(context)
  }

}
