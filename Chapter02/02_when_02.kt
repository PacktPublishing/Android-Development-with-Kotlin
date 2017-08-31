fun main(args: Array<String>) {
    val riskAssessment = 47 
 
    val risk = when (riskAssessment) { 
        in 1..20 -> "negligible risk" 
        !in 21..40 -> "minor risk" 
        !in 41..60 -> "major risk" 
        else -> "undefined risk" 
    } 
 
    println(risk)
}