import syntaxtree.*;
import visitor.*;
import myparser.*;

public class Main2 {
   public static void main(String [] args) {
      try {
         Program root = new MiniJavaParser(System.in).Goal();
          root.accept(new Task2Visitor());
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
