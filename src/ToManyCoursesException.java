public class  ToManyCoursesException extends RuntimeException{
    ToManyCoursesException(){
        super("You have reached the maximum limit of 5 courses");
    
    }


}