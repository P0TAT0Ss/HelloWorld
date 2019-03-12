# Exception
***RuntimeException***  *try_catch-by_needs*  

**ArithmeticException**  
**NullPointerException**  
**IndexOutOfBoundsException**  

***CheckedException***  

**IOException**  *Wont_build_unless_handle(try_catch)*  
**EOFException**  
**FileNotFoundException**  

# Error
***VirtualMachineError***  

**StackOverflowError**  
**OutOfMemoryError**  

***AWTError***  

# Class_String
  **final**  
  
# Class_StringBuilder();
  **dynamic_object**  
  **boots_performance**  
  
  **API:_**  
  **.append();**  
  **.insert();**  
  **.replace();**  
  **.indexOf(String);**  
  **.lastIndexOf(String);**  
  **.delete(int start,int end)**  
  **.deleteCharAt(int index);**  
  **.revarse();**  
  
# Class_SimpleDateFormat(format)
  **API:_**  
  **.format(date);** *//make_date_to_String_date*  
  **.parse(String date);** *//make_String_date_to_date*  
  
# Class_Date(date)  *not_recommend_to_handle_date*
  **set_date**  
  
# Class_Calendar()  *//more_recommend_to handle_date*
**static_methods:_Calendar_date=_Calendar.methodName（）**  
**date.getTime()**  
  
# Class_Math
**static_methods**  

**API:_**  
**Math.round(double);**  
**Math.floor(double);**  
**Math.ceil(double);**  
**Math.random();** *//get_0~1_random_double_float*  
  
# Collection *based_of_Iterator*
***List***  
**sort by Collections.sort(list);**  

**ArrayList**  
 
*sequential*  
*fast_iterator,_slow_add_remove_replace*  
 
**LinkList**  

*sequential*  
*fast_add_remove_replace,_slow_iterator*  

***Set***  

**HashSet**  

*not_sequential,can_only_iterator_by_Iterator_and_foreach(simple iterator)*  
*element_can't_repeat*  
*API:*  
*.add();*  
*.remove();*  
*.replace();*  
*.clear();*          
  
# Map
  ***HashMap***  
  
  *key--velue*  
  *not_sequential*  
  *iterator_by_keySet();_:_return_key,_by_entrySet();_:_return_key--velue*  
  *Key_can't_repeat,Value_can_repeat*  
  
# @Override
  **equals(Object obj) {**  
  ***determine two objects equals***    
  if(this == obj) {  
     return true;  
  }    
  ***determine obj are null or not***   
  if(obj == null) {  
     return false;  
  }  
   ***determine two class equals***   
   if(obj instenceof Class) {  
      return true;  
   }  
   ***type conversion***  
   Class variableName = ()obj;  
   ***determine two value equals***  
   if(variableName == null) {  
      if(this.element == null) {  
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
  **}**  
  
***if_override_equals(),_must_override_hashCode()***  
  
**hashCode() {**  
int result = 1;  
result = prime*result+((element == null)? 0:element.hashCode());  
return result;  
**}**  

# Set random numbers
**class Random**  
   *Random random = new Random();*  
   *random.nextInt(bound);*  
  
