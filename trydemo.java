import java.util.*;
public class trydemo{
  public static void main(String[] args) {
   
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    sb.insert(5," Java");
    sb.delete(6, 11);
    System.out.println(sb);
    
  }
}
