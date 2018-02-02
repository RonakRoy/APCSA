package net.sduhsd.royr6099.unit0;

public class Lab0b {
	public static void main(String[] args) {
		byte b = 127;
	    short s = -32123;
	    int i = 90877;
	    long l = 999999999;
	    
	    float f = 38.5678f;
	    double d = 923.234;
	    
	    char c = 'A';
	    
	    boolean bool = true;
	    String str = "Hello World";
	    
	    
	    String[] lines = 
	    {
	      "////////////////////////////////",
	      "",
	      "Ronak Roy             02/01/2018",
	      "",
	      "                  integer types",
	      "byte (8 bit):    " + b,
	      "short (16 bit):  " + s,
	      "int (32 bit):    " + i,
	      "long (64 bit)    " + l,
	      "",
	      "           floating point types",
	      "float (32 bit):  " + f,
	      "double (64 bit): " + d,
	      "",
	      "                    other types",
	      "char (16 bit):   " + c,
	      "boolean (1 bit): " + bool,
	      "String ():       " + str,
	      "////////////////////////////////"
	    };
	    
	    for (String line : lines) {
	      System.out.println(line);
	    }
	}
}
