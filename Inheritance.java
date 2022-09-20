class animal
{
    void eat()
    {
        System.out.println("i am eating");
    }
}
class Dog extends animal
{
    void Dog()
    {
        System.out.println("i am a Parent Dog");
    }
}
class Puppy extends animal
{
    void Puppy()
    {
        System.out.println("i am Child of dog");

    }
    
    public static void main(String [] args)
    {
        
        
    // System.out.println("");
         
    //     animal A = new animal();
    //     A.eat();
    
    
    
    // System.out.println(""); //single inheritance
        
    //     Dog D = new Dog();
    //     D.eat();
    //     D.Dog();
        
        
        
    // System.out.println("");  //multilevel inheritance
      
    //     Puppy P = new Puppy();
    //     P.eat();
    //     P.Dog();
    //     P.Puppy();
        
    
    Puppy P = new Puppy();
    P.eat();
   // P.Dog(); // it wont Access due to Hierarchal Inheritance
   
    Dog D = new Dog();
    D.eat();
       
    // D.eat(); // it wont Access due to Hierarchal Inheritance    


    }
}
