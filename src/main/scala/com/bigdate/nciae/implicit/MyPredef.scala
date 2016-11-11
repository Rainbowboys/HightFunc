package com.bigdate.nciae

import java.io.{File}

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

  //   val GirlComperByOrdering = new Ordering[Girl] {
  //    override def compare(x: Girl, y: Girl): Int = {
  //      x.faceValue - y.faceValue
  //    }
  //  }

  /**
   * 源码 ： trait IntOrdering extends Ordering[Int] {
           def compare(x: Int, y: Int) =
                if (x < y) -1
                else if (x == y) 0
                else 1
  }
      implicit object Int extends IntOrdering
   */


  trait GirlOrdering extends Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }

  implicit object Girl extends GirlOrdering

}
