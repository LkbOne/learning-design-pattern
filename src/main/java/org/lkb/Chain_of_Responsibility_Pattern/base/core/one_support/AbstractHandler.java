package org.lkb.Chain_of_Responsibility_Pattern.base.core.one_support;

public abstract class AbstractHandler implements IHandler {
  private AbstractHandler successor = null;

  protected void setSuccessor(AbstractHandler successor) {
    this.successor = successor;
  }

  protected AbstractHandler getSuccessor() {
    return this.successor;
  }
}
