package learningscala

import scala.io.Source

object Random {

  def main(args:Array[String]) {
    
    //Reading from a file; simple
    val filename = "hellow.txt"
    val file = Source.fromFile(filename)
    for (line <- file.getLines) {
      //println(line)
    }
    
    //s means substitution?
    val s1 = "Palo Alto"
    val number = 8
    println(s"I live in $s1 at number ${number+100}") 
    "Character by Character, not word by word\n".filter(_ != 'e').map( _.toUpper).foreach(print)
    
    //maps
    "I, live, in, Palo Alto".split(",").map(_.trim()).foreach(println)
  }
}