package org.lkb.Chain_of_Responsibility_Pattern.base.core.all_support;

public class ChainManager {

  private final HandlerChain chain;

  public ChainManager() {
    chain = new HandlerChain();
  }


  public void addHandler(AbstractHandler handler) {
    chain.addHandler(handler);
  }

  public void handle() {
    chain.handle();
  }
}
