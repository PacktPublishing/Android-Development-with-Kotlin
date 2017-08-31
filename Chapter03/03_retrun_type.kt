fun main(args: Array<String>) {
	val p = sumPositive(2,3)
    print(p)
}
fun sumPositive(a: Int, b: Int): Int { 
	if(a >= 0 && b >= 0) { 
		return a + b 
	} 
	return 0 
} 