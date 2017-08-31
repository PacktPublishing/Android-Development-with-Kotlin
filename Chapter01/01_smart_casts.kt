fun main(args: Array<String>) {
    var x = String;
	if (x is String) { 
        print(x.length) // x is automatically casted to String 
    } 
 
    x.length //error, x is not casted to a String outside if block 
 
    if (x !is String) 
        return 
 
    x.length // x is automatically casted to String 
}