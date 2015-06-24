package learningscala

import java.util.ArrayList

//Companion object; is equivalent to Java's singleton concept
class Lists {

}
object Lists {
  def main(args:Array[String]) {
    println("Hello Lists!")
  
    val myList = List[String]()
    val myJavaList = new java.util.ArrayList[String]() // notice [] instead of <>
    myJavaList.add("hello")
  
  }
}