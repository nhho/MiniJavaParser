package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class StmtExpr {
  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}
