import java.util.Scanner;
public class Studentgrade {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter your marks: ");
 int num = sc.nextInt();

if (num>= 80 && num<=100) 
  { 
  System.out.println("Congratulations! You have achieved an A+ in the Exam."); 
  }
else if (num>=75&& num<80) 
  { 
  System.out.println("You have achieved an A in the Exam."); 
  }
else if (num>=70 && num< 75) 
  { 
  System.out.println("You have achieved an A- in the Exam."); 
  }
else if (num>=65 && num< 70) 
  { 
  System.out.println("You have achieved a B+ in the Exam."); 
  }
else if (num>=60 && num< 65) 
  { 
  System.out.println("You have achieved a B in the Exam."); 
  }
else if (num>=55 && num<60) 
  { 
  System.out.println("You have achieved a B- in the Exam."); 
  }
else if (num>=50 && num<55) 
  { 
  System.out.println("You have achieved a C+ in the Exam."); 
  }
else if (num>=45 && num<50) 
  { 
  System.out.println("You have achieved a C in the Exam."); 
  }
else if (num>=40 && num<45) 
  { 
  System.out.println("You have achieved a D in the Exam."); 
  }
else if (num>100 || num<0) 
  { 
  System.out.println("Invalid Number"); 
  }
else 
  { 
  System.out.println("You have achieved a F in the Exam."); 
  }

sc.close();
  }
}
