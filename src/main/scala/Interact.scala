object Interact  extends App{
  val student=new Student()
  student.setName("A","Cramer")
  student.setAge(1980)
  student.printAge()
  student.printName()
  val all=StudentDB()
  all.addStudent(student)
  all.listStudents()
  all.storeData()
  all.flush()
  all.listStudents()
  all.loadData()
  all.listStudents()


}
