package com.bigdate.nciae

/**
 * java 方式的对象大小比较 继承接口
 */
class Boy(val name: String, val faceValue: Int) extends Comparable[Boy] {
  override def compareTo(o: Boy): Int = {
    if (this.faceValue - o.faceValue > 0) 1 else 0
  }
}
