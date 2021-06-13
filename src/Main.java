import java.util.*;
public class Main {
     public static void main(String [] args){
        Institution institution = Institution.getInstance();
        
        System.out.println("Write the desired command");
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while(true){
            String s1 = sc.nextLine();
            String [] m = s1.split(" ");
            
                switch(m[0]){
                    case "exit":
                        System.exit(1);
                        
                    case "add_curse":
                        String type = m[1];
                        String name = m[2];
                        int price = Integer.parseInt(m[3]);
                        if(type.equals("computer")){
                            ComputerCourse c = new ComputerCourse(i,name,price);
                            institution.addCourses(c);
                          
                        }else{
                            ForeignLanguagesCourse c = new ForeignLanguagesCourse(i,name,price);
                            institution.addCourses(c);
                        }
                        i++;
                        break;
                        
                    case "display":
                        institution.displayCourses();
                        break;
                        
                    case "display_computer_courses":
                        institution.displayComputerCourses();
                        break;
                        
                    case "delete_course":
                        int id = Integer.parseInt(m[1]) - 1;
                        institution.deleteCourse(id);
                        
                
                }
            
        
        }


    
    }
        
        
       
        
   
        
      
    

}