    class Student(val name: String, val classCode: String, val meanGrade: Float) 
 
    val students = listOf( 
       Student("Homer", "1", 1.1F), 
       Student("Carl", "2", 1.5F), 
       Student("Donald", "2", 3.5F), 
       Student("Alex", "3", 4.5F), 
       Student("Marcin", "3", 5.0F), 
       Student("Max", "1", 3.2F) 
    ) 
 
    val bestInClass = students 
       .groupBy { it.classCode } 
       .map { (_, students) -> students.maxBy { it.meanGrade }!! } 
       .map { it.name }
fun main(args: Array<String>) {
	print(bestInClass)
}