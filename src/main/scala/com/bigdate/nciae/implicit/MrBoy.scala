package com.bigdate.nciae

import java.lang.Comparable


/**
 * Created by Rainbow on 2016/11/11.
 */
class MrBoy[T] {

  //对接受的参数限定 [T <: Comparable[T]]  上边界界定
  def choose[T <: Comparable[T]](first: T, second: T): T = {
    if (first.compareTo(second) > 0) first else second
  }

}
