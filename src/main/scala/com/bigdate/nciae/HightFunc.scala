package com.bigdate.nciae

/**
 * Created by Rainbow on 2016/11/11.
 *
 * 高阶函数和柯里化
 *
 * 在Scala中，方法和函数是不一样的，最本质的区别是函数可以做为参数传递到方法中
  但是方法可以被转换成函数，神奇的下划线又出场了
 */
object HightFunc {

  def main(args: Array[String]) {

    /**
     * 定义一个普通函数
     */

    val normalFun = (x: Int) => x * x //normal: Int => Int = <function1>

    val normalFun1: (Int) => Int = x => x * x //normalFun1: Int => Int = <function1>
    //调用 普通函数

    println(normalFun(12))
    println(normalFun1(12))

    /**
     * 定义方法 普通方法
     */

    def m(x: Int) = x * x //m: (x: Int)Int
    println(m(12))

    /**
     * method ---> function
     */

    val funM = m _ //funM: Int => Int = <function1>
    /**
     *
     * def method  柯理化 调用 m2 返回一个接收剩下的参数的函数 ：res25: Int => Int = <function1>

     */
    def m2 = (x: Int) => x * x //  m2: Int => Int
    /**
     * @return back a Function to receive last num :m5() res24: Int => Int = <function1>
     */
    def m5() = (x: Int) => x * x //  m5: ()Int => Int

    //m3(2)  : Int => Int = <function1>
    def m3(x: Int) = (y: Int) => x * y // m3: (x: Int)Int => Int  m3(12)(12)=144
    // val m_4=m4(12)(_)   m_4: Int => Int = <function1>  m_4(12)=144
    def m4(x: Int)(y: Int) = x * y //m4: (x: Int)(y: Int)Int  m4(12)(12)=144


    //调用


  }

}
