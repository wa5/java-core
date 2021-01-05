import java.io.*;   
class Demo implements Serializable   
{   
public int i;   
public String s;   
public Demo(int i, String s) //default constructor  
{   
this.i = i;   
this.s = s;   
}     
}   
public class DeserializationExample   
{   
public static void main(String[] args)   
{      
Demo object = new Demo(8, "javatpoint");   
String filename = "Demofile.ser";       //specified file name (must have extension .ser)  
/*-----------------Serialization----------*/  
try  
{      
FileOutputStream file = new FileOutputStream(filename);  //Saving of object in the file   
ObjectOutputStream out = new ObjectOutputStream(file);     
out.writeObject(object);            //serialize object  
out.close();                    //closes the ObjectOutputStream  
file.close();                   //closes the file  
System.out.println("Object serialized");   
}   
catch(IOException e)   
{   
e.printStackTrace();  
}   
Demo obj = null;   
/*-----------------Deserialization--------*/  
try  
{      
FileInputStream file = new FileInputStream(filename); // reading an object from a file   
ObjectInputStream is = new ObjectInputStream(file);   
obj = (Demo)is.readObject();        //deserialize object  
is.close();                     //closes the ObjectInputStream  
file.close();                   //closes the file  
System.out.println("Object deserialized ");   
System.out.println("number = " + obj.i);   
System.out.println("string = " + obj.s);   
}   
catch(IOException e)   
{   
System.out.println("IOException is caught");   
}   
catch(ClassNotFoundException e)   
{   
System.out.println("ClassNotFoundException is caught");   
}  
}   
}  
