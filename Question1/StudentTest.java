package studentest;
import java.util.*;
import student.Student;
public class StudentTest{
	public static void main(String args[]){
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
              
		stu1.setName("madhuri");
		stu1.setMarks1(75);
		stu1.setMarks2(85);
		stu1.setMarks3(65);
		stu1.setRollNumber(15);
                stu1.setCourse("msc");
		System.out.println(stu1);
      		System.out.println("total marks of student1 is:"+stu1.calculateTotal(stu1.getMarks1(), stu1.getMarks2(), stu1.getMarks3()));
                System.out.println("average marks of student1 is:" +stu1.calculateAverage(stu1.getMarks1(), stu1.getMarks2(), stu1.getMarks3()));
		System.out.println("grade of student1 is:"+stu1.grade(stu1.getMarks1(), stu1.getMarks2(), stu1.getMarks3()));

                System.out.println();

       		stu2.setName("madhu");
    		stu2.setMarks1(75);
    		stu2.setMarks2(40);
    		stu2.setMarks3(65);
    		stu2.setRollNumber(15);
      		stu2.setCourse("msc");
		System.out.println(stu2);
		System.out.println("total marks of student2 is:"+stu2.calculateTotal(stu2.getMarks1(), stu2.getMarks2(), stu2.getMarks3()));
		System.out.println("average marks of student2 is:" +stu2.calculateAverage(stu2.getMarks1(), stu2.getMarks2(), stu2.getMarks3()));
		System.out.println("grade of student2 is:"+stu2.grade(stu2.getMarks1(), stu2.getMarks2(), stu2.getMarks3()));

                System.out.println();
        
        	stu3.setName("xyz");
    		stu3.setMarks1(95);
    		stu3.setMarks2(80);
    		stu3.setMarks3(85);
    		stu3.setRollNumber(15);
      		stu3.setCourse("msc");
		System.out.println(stu3);
		System.out.println("total marks of student3 is:"+stu3.calculateTotal(stu3.getMarks1(), stu3.getMarks2(), stu3.getMarks3()));
		System.out.println("average marks of student3 is:" +stu3.calculateAverage(stu3.getMarks1(), stu3.getMarks2(), stu3.getMarks3()));
		System.out.println("grade of student3 is:"+stu3.grade(stu3.getMarks1(), stu3.getMarks2(), stu3.getMarks3()));

		 System.out.println();
        
       		stu4.setName("yzx");
    		stu4.setMarks1(75);
    		stu4.setMarks2(90);
    		stu4.setMarks3(65);
    		stu4.setRollNumber(15);
      		stu4.setCourse("msc");
		System.out.println(stu4);
		System.out.println("total marks of student4 is:"+stu4.calculateTotal(stu4.getMarks1(), stu4.getMarks2(), stu4.getMarks3()));
	        System.out.println("average marks of student4 is:" +stu4.calculateAverage(stu4.getMarks1(), stu4.getMarks2(), stu4.getMarks3()));
		System.out.println("grade of student4 is:"+stu4.grade(stu4.getMarks1(), stu4.getMarks2(), stu4.getMarks3()));
        
		System.out.println();
        
        	stu5.setName("zxy");
    		stu5.setMarks1(75);
    		stu5.setMarks2(50);
    		stu5.setMarks3(65);
    		stu5.setRollNumber(15);
      		stu5.setCourse("msc");
		System.out.println(stu5);

		System.out.println("total marks of student5 is:"+stu5.calculateTotal(stu5.getMarks1(), stu5.getMarks2(), stu5.getMarks3()));
		System.out.println("average marks of student5 is:" +stu5.calculateAverage(stu5.getMarks1(), stu5.getMarks2(), stu5.getMarks3()));
 		System.out.println("grade of student5 is:"+stu5.grade(stu5.getMarks1(), stu5.getMarks2(), stu5.getMarks3()));
        
        

	}
}

