class Student  {
  private var name: String=""
  private var surname: String=""
  private var yearofbirth: Int=1900
  def setName(n:String,s:String): Unit={
    name=n
    surname=s
  }
  def setAge(num:Int):Unit={
    yearofbirth=num
  }
  def getName(): String={
     s"$name,$surname"
  }
  def getAge(): String ={
    val age=2024-yearofbirth
     age.toString
  }

  def printName(): Unit = {
    println(s"Student is called $name,$surname")
  }

  def printAge(): Unit = {
    val age = 2024 - yearofbirth
    println(s"Age is $age")
  }

}
