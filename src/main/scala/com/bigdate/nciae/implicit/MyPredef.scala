package com.bigdate.nciae

import java.io.File

/**
 * 自定义 的隐式转换 门面 入口
 */
object MyPredef {

  implicit def ReadRichFile(f: File) = new RichFile(f)

  implicit val name = "xiaohan"

  //定义增强的比较规则
//  implicit def GirlComperByOrder(g: Girl) = new Ordered[Girl] {
//    override def compare(that: Girl): Int = {
//      g.faceValue - that.faceValue
//    }
//  }

  implicit val GirlComperByOrdering = new Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }
}
