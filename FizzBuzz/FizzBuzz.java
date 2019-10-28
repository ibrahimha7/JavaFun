public class FizzBuzz {
    
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if(number==3){
            System.out.println("Fizz");
        }
        else if(number==5){
            System.out.println("Buzz");
        }
        else if(number==15){
            System.out.println("FizzBuzz");
        }
        else if(number==2){
            System.out.println(number);
        }
        else{
            System.out.println("This isn't divisible by 3 or 5");
			return "Not divisible";
        }
        return "Not divisible";  
    } 
}