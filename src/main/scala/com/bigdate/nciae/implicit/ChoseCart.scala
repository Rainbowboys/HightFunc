package com.bigdate.nciae

import com.bigdate.nciae.MyPredef._

/**
 * Created by Rainbow on 2016/11/11.
 * 不明确指定 界定类型
 */
class MissCart[T] {
  /**
   * 利用柯里化 表明需要一个传入T返回一个Ordered[T] 函数 在上下文中查找比较规则 需要的是
   * 一个隐式转换函数 等同于viewbound 视图界定
   */

  def choose(first: T, second: T)(implicit ord: T => Ordered[T]): T = {
    if (first > second) first else second
  }

  /**
   * 利用柯里化 接收一个 隐式参数 在上下文中查找比较规则 需要的是
   * 等同于contextbound 上下文界定
   */
  def select(first: T, second: T)(implicit ord: Ordering[T]): T = {
    if (ord.gt(first, second)) first else second
  }

  def change(first: T, second: T)(implicit ord: Ordering[T]): T = {
    //可将一个ordering ->ordered
    import Ordered.orderingToOrdered
    if (first > second) first else second
  }


}
