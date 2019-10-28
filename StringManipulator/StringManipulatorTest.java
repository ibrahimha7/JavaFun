public class StringManipulatorTest{
    public static void main (String[] args){

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" Hello ", " World ");
        System.out.println(str); // result is HelloWorld
    
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Hello", letter);
        Integer b = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // result is 4 [H-0,E-1,L-2,L-3,(O-4)]
        System.out.println(b); // result is null no 'O' in "Hi"

        String word = "Hello";
        String subword = "llo";
        String subword2 = "ang";
        Integer one = manipulator.getIndexOrNull(word, subword); 
        Integer two = manipulator.getIndexOrNull(word,subword2);
        System.out.println(one); // result is 2 
        System.out.println(two); // nu

        String test = manipulator.concatSubstring("Hello",1,2,"world");
        System.out.println(test);
    }   
}