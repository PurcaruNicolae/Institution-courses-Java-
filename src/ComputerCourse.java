public class ComputerCourse extends Course{
    
    ComputerCourse(int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
        
    }
    
    @Override
    public String toString(){
        return "Computer Course with id " + this.id + " name " + this.name + " and price " + this.price ;
    }
    
    

}