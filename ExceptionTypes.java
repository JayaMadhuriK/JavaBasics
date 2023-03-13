import java.io.*;

public class ExceptionTypes {
    public static void main(String args[]){
        System.out.println("built in exception: checked and unchecked");
        System.out.println("checked exceptions");
        System.out.println("filenotfound exceptions");
        FileInputStream file_data = null;
        try{
        file_data = new FileInputStream("C:/Users/madhu/OneDrive/Desktop/NucleusTeq/week5/hii.txt");
        }
        catch(FileNotFoundException e){                      //filenotfound exception
            System.out.println("file not found");
        }
        int m;
        System.out.println("i/o exceptions");
        try{
        while((m = file_data.read())!=-1){
            System.out.println((char)m);
        
        }
        file_data.close();
        }
        catch(IOException e){                               //io exception
            System.out.println("i/o exception:"+e);
        }

        System.out.println("unchecked exceptions");
        System.out.println("Arithmetic exceptions");
        int a = 2, b = 0, res = 0;
        try{
            res = a/b;
        }
        catch(ArithmeticException ae){
            System.out.println("b is zero");         //ArithmeticException
        }
        
        System.out.println(res);
        
        System.out.println("arrayindexoutof bound exceptions");
        int num[] = {1,2,3,4,5};      
        try{
            System.out.println(num[6]); //arrrayindexoutof bound exceptions
        }     
        catch(ArrayIndexOutOfBoundsException ae)   {
            System.out.println("index out of bound");
        }
                          

        System.out.println("nullpointer exceptions");
        String c ="madhuri";
        try{
        System.out.println(c.charAt(0));   //null pointer exceptions
        }
        catch(NullPointerException ne){
            System.out.println("nullpointer exception");
        }

        System.out.println("classnotfound exceptions");
        try{
            Class.forName("classnew");
        }                                                       //class not found exception
        catch(ClassNotFoundException ce){
            System.out.println("class not found exception");
        }
        
    }
}
