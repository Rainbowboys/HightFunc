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


  //  implicit val GirlComperByOrdering = new Ordering[Girl] {
  //    override def compare(x: Girl, y: Girl): Int = {
  //      x.faceValue - y.faceValue
  //    }
  //  }


  //function for T->Ordered[T]
  implicit val CartOrdered = (c: Cart) => new Ordered[Cart] {
    override def compare(that: Cart): Int = {
      if (c.faceValue == that.faceValue) {
        c.size - that.size
      } else {
        c.faceValue - that.faceValue
      }
    }
  }

  //T->Ordering[T]

  //  implicit val CartOrdering = new Ordering[Cart] {
  //    override def compare(x: Cart, y: Cart): Int = {
  //      if (x.faceValue == y.faceValue) {
  //        x.size - y.size
  //      } else {
  //        x.faceValue - y.faceValue
  //      }
  //    }
  //  }

  //T->Ordering[T]
  trait CartByOrdering extends Ordering[Cart] {
    override def compare(x: Cart, y: Cart): Int = {
      if (x.faceValue == y.faceValue) {
        x.size - y.size
      } else {
        x.faceValue - y.faceValue
      }
    }
  }

  implicit object Cart extends CartByOrdering


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
