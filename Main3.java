import syntaxtree.*;
import visitor.*;
import myparser.*;

public class Main3 {
   public static void main(String [] args) {
      try {
         Program root = new MiniJavaParser(System.in).Goal();
          root.accept(new Task3Visitor());
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
