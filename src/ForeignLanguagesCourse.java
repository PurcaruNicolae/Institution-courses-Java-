public class ForeignLanguagesCourse extends Course{

    ForeignLanguagesCourse (int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
        
    }
    
    @Override
    public String toString(){
        return "Foreign Languages course with id " + this.id + " name " + this.name + " and price " + this.price ;
    }

}