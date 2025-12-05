// Online Java - IDE, Code Editor, Compiler

// Online Java is a quick and easy tool that helps you to build, compile, test your programs online.

// Write your Java code here

public class FindTheLengthOfString {
  public static void main(String[] args) {
    System.out.println("Welcome to Online Java!! Happy Coding :)");
    String data = "hello";
    char[] arr = data.toCharArray();
    int i =0;
    int count =0;
    for(char val : arr){
        
       i++;
    }
    
    while(true){
        try{
        data.charAt(count);
        count++;
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Coount :"+count);
            break;
        }
        
    }
    
    

    
  }
}
