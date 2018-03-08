package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class LocalVar extends ForInit {
  public Type t;
  public LocalVarDeclList v;

  public LocalVar(Type at, LocalVarDeclList av) {
    t=at; v=av; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}

