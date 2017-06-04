package com.arv.scala

/**
  * Created by arvind on 7/3/17.
  */


object LoopMain {

  def main(args: Array[String]) {
    var t1 = System.currentTimeMillis();
    var list = Array(2, 3, 4, 5)
    var result = 0;
    for (n <- list) {
    //  println(n)
      result += n
    }
    for (n <- list.iterator) {
      //println(n)
      result += n
    }

    for (n <- 1 to 10000000) {
      result += n
    }
    var t2 = System.currentTimeMillis();
    print("time = " + (t2 - t1));
    print( result)
  }
}

