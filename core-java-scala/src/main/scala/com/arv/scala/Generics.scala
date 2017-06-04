package com.arv.scala

/**
  * Created by arvind on 7/3/17.
  */


object Generics {

	def main(args:Array[String]) {
		val p1 = new Pair[String, Integer]("arvind", 5)
		val p2 = new Pair("arvind1234", "adsf")
		print(p1)
		print(p2)	
	} 
}

class Pair[T, S](val a: T, val b: S) {
  def smaller = (1)
}