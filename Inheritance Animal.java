package animal;

/**
 *
 * @author Fauzia Puspita Dewi (0613U042)
 */
public class Animal {
        protected int legs;
        
    protected Animal(){
      
    }
    
    protected void setAnimal(int leg){
        legs = leg;
    }
    
    protected int getAnimal(){
        System.out.println("Animal have " +legs+ " legs");
        return legs;
    }
    
    public void walk(){
        System.out.println("Animal can walk");
    }
    
    public void eat(){
        System.out.println("Animal can eat");
    }

  
    
}
