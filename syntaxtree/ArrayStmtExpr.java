package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

// i [ e1 ] = e2
public class ArrayStmtExpr extends StmtExpr {
  public Identifier i;
  public Exp e1,e2;

  public ArrayStmtExpr(Identifier ai, Exp ae1, Exp ae2) {
    i=ai; e1=ae1; e2=ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }

}

