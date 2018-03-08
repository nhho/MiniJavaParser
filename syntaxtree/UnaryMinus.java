package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class UnaryMinus extends Exp {
  public Exp e;
  
  public UnaryMinus(Exp ae) {
    e=ae; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
