package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class For extends Statement {
  public ForInit f;
  public Exp e;
  public StmtExprList se;
  public Statement s;

  public For(ForInit af, Exp ae, StmtExprList ase, Statement as) {
    f=af; e=ae; se=ase; s=as;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}

