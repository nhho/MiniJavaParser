package syntaxtree;

import java.util.Vector;

public class LocalVarDeclList {
   private Vector<LocalVarDecl> list;

   public LocalVarDeclList() {
      list = new Vector<LocalVarDecl>();
   }

   public void addElement(LocalVarDecl n) {
      list.addElement(n);
   }

   public LocalVarDecl elementAt(int i)  { 
      return (LocalVarDecl)list.elementAt(i); 
   }

   public int size() { 
      return list.size(); 
   }
}
