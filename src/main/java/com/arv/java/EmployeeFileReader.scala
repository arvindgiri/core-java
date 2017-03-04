package com.arv.scala

import scala.io.Source

/**
  * Created by arvind on 4/3/17.
  */
object EmployeeFileReader {
  def main(args: Array[String]): Unit = {
    val inputStream = getClass.getResourceAsStream("/employee.csv")
    val file = Source.fromInputStream(inputStream)
    val lineIterator = file.getLines()

    var lines = file.getLines().toArray
    for (i <- 0 until lines.length) {
      println(lines(i))
    }
    lines = lines.map(a => a.toUpperCase())
    for (i <- 0 until lines.length) {
      println(lines(i))
    }
  }
}
