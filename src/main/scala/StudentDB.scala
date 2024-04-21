import scala.collection.mutable.ListBuffer
class StudentDB {
  var MyStudents: ListBuffer[Student]=ListBuffer()
  def addStudent(student:Student): Unit={
    MyStudents= MyStudents :+ student
  }

  def remStudent(student: Student): Unit = {
    MyStudents -=  student
  }
  def listStudents(): Unit={
    MyStudents.foreach(x=> x.getName())
  }
}
