import java.io.{File, FileWriter}
import scala.collection.mutable.ListBuffer
class StudentDB {
  var MyStudents: ListBuffer[Student]=ListBuffer()
  def addStudent(student:Student): Unit={
    MyStudents= MyStudents :+ student
  }

  def remStudent(student: Student): Unit = {
    MyStudents -=  student
  }
  def flush()={
    val MyStudents1:  ListBuffer[Student]=ListBuffer()
    MyStudents=MyStudents1
  }
  def listStudents(): Unit={
    println("students:\n")
    MyStudents.foreach(x=> x.printName())
  }
  def storeData()={
    val filewr=new FileWriter(new File("C:\\Users\\draiz\\IdeaProjects\\StudentManagementSystem\\data.txt"),true)

    MyStudents.foreach(x=> filewr.write(x.getName()+","+x.getAge()+"\n"))
    filewr.close()
  }

  def loadData() = {
    val fileName="C:\\Users\\draiz\\IdeaProjects\\StudentManagementSystem\\data.txt"
    scala.io.Source.fromFile(fileName).getLines().foreach { line =>
      val stud=line.split(',')
      val nm=stud(0)
      val sur=stud(1)
      val age=stud(2)
      val student=new Student()
      student.setName(nm,sur)
      student.setAge(age.toInt)
      addStudent(student)
      
    }


  }
}
