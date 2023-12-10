package org.lkb.Chain_of_Responsibility_Pattern.base.core.one_support;

public class ChainManager {
  private final HandleChain chain;

  public ChainManager() {
    this.chain = new HandleChain();
  }

  public void addHandle(AbstractHandler abstractHandler) {
    chain.addHandle(abstractHandler);
  }

  public void handle() {
    chain.handle();
  }
}
