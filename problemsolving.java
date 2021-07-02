import java.util.*;

class Student{
   public int id;
   public String name;
   public double cgpa;
   public Student(int id, String name, double cgpa) {
      this.id = id;
      this.name = name;
      this.cgpa = cgpa;
   }
 
}

public class problemsolving
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int inputs = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<>();
      while(inputs>0){
         int id = in.nextInt();
         String name = in.next();
         double cgpa = in.nextDouble();
         
         Student info = new Student(id, name, cgpa);
         studentList.add(info);
         
         inputs--;
      }
       Collections.sort(studentList, new Comparator<Student>() {
             
               @Override
               public int compare(Student s1, Student s2) {
                    if(s2.cgpa>s1.cgpa){
                        return 1;
                    }else if(s2.cgpa<s1.cgpa){
                        return -1;
                    }
                    return s1.name.compareTo(s2.name);
                }
        });
      
         for(Student st: studentList){
         System.out.println(st.name);
      }
   }
}