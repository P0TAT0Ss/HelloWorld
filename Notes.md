# Exception(Throwable)
***RuntimeException***  
*try-catch by needs*  

**ArithmeticException    
NullPointerException  
IndexOutOfBoundsException**  

***CheckedException***  
*Wont build unless handle(try-catch)*  

**IOException  
EOFException  
FileNotFoundException**  

# Error(Throwable)
***VirtualMachineError***  

**StackOverflowError  
OutOfMemoryError**  

***AWTError***  

# Class_String
**final**  

# Class_StringBuilder();
**dynamic object  
higher performance**  

# Class_SimpleDateFormat(format)
**API:    
.format(date);** *//make date to String_date*  
**.parse(String date);**  *//make String date to date*  
  
# Class Date(date)  *not recommend to handle date*
**set date**  

# Class Calendar()  *//more recommend to handle date*
**static methods: Calendar date= Calendar.methodName（）**  
**date.getTime()**  
  
# Class Math
**static methods**  

**API:  
Math.round(double);  
Math.floor(double);  
Math.ceil(double);  
Math.random();**  *//get 0~1 random double float*  
  
# Collection *based of Iterator*
***List***  
*sort by Collections.sort(list);*  

**ArrayList**  
 
**sequential  
fast iterator, slow add remove replace**  
 
**LinkList**  

**sequential  
fast add remove replace, slow iterator**  

***Set***  

**HashSet**  

**not sequential,can only iterator by Iterator and foreach(simple iterator)  
element can't repeat  
  
# Map

****HashMap***  

**key--velue  
not sequential  
iterator_by_keySet(); : return key, by entrySet(); : return key--velue  
Key can't repeat,Value can repeat**  
  
@Override
**equals(Object obj) {**  
*determine two objects equals*  
**if(this == obj) {  
return true;  
}**  
*determine obj are null or not*  
**if(obj == null) {  
return false;  
}**  
*determine two class equals*   
**if(obj instenceof Class) {  
return true;  
}**  
*type conversion*  
**Class variableName = ()obj;**  
*determine two value equals*  
**if(variableName == null) {  
(this.element == null) {  
return true;  
} else {  
return false;  
} else {  
if(this.element.equals(variableName.element)) {  
return true;  
} else  
return false;  
}  
}  
}**  
  
***if override equals(), must @override hashCode()***  
  
**hashCode() { **  
int result = 1;  
result = prime*result+((element == null)? 0:element.hashCode());  
return result;  
}**  

# Set random numbers

**class Random  
Random random = new Random();  
random.nextInt(bound);**  
# File
**Traverse subfolder by FOREACH and RECURSION**  

# I/O
*try-with-recource: AotoCloseable  
if BufferI/OStream close(), must flush()  
BufferedStream must creat After a stream*  

***byteStream***  

**InputStream  
FileInputStream  
ObjectInputStream  
BufferedInputStream extends FilterInputStream  
DataInputStream extends FilterInputStream**  

**OutputStream  
FileOutputStream  
ObjectOutputStream  
BufferedOutputStream extends FilterOutputStream  
DataOutputStream extends FilterOutputStream**  

***charStream***  

**Reader:
BufferedReader  
FileReader extends InputStreamReader**  

**Writer:  
BufferedWriter  
FileWriter  extends OutputStreamWriter**  



