package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class StmtExprInit extends ForInit {
  public StmtExprList se;

  public StmtExprInit(StmtExprList ase) {
    se=ase; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}

