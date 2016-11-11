package com.bigdate.nciae

/**
 * Created by Rainbow on 2016/11/11.
 */
/**
 * 视图界定  viewbound
 */
//class Chooser[T <% Ordered[T]] {
//
//  def choose(first: T, second: T): T = {
//    if (first > second) first else second
//  }
//}

//上下文界定
class Chooser[T: Ordering] {
  def choose(first: T, second: T): T = {
    //使用隐式的implicitly
    val rdd = implicitly[Ordering[T]]
    //
    if (rdd.gt(first, second)) first else second
  }

}
