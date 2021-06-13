import java.util.*;

public class Institution {
    private ArrayList<Course> lista = new ArrayList<>();
    private static Institution SINGLETON;
    private int idx = 0;
    
    private Institution(){
    
    }
    
    public static final Institution getInstance(){
        if(SINGLETON == null)
            SINGLETON = new Institution();
            
        return SINGLETON;
    
    }
    
    public void addCourses(Course c) throws ToManyCoursesException{
        if(idx <= 5){
            System.out.println("Was added a course");
            lista.add(c);
            idx++;
        }else{
            ToManyCoursesException e = new ToManyCoursesException();
            throw e;
        }
        
        
    
    
    }
    
    public void displayCourses(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
    }
    
    public void displayComputerCourses(){
        
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) instanceof ComputerCourse)
                System.out.println(lista.get(i));
        }
    
    }
    
    public void deleteCourse(int id){
        lista.remove(id);
    }

}