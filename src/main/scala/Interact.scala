object Interact  extends App{
  val student=new Student()
  student.setName("Bob","Vans")
  student.setAge(1980)
  student.getAge()
  student.getName()
  val all=StudentDB()
  all.addStudent(student)
  all.listStudents()
  all.remStudent(student)
  all.listStudents()

}
