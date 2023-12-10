package org.lkb.Chain_of_Responsibility_Pattern.base.demo.all_support;

import org.lkb.Chain_of_Responsibility_Pattern.base.core.all_support.ChainManager;

public class Demo {

  public static void main(String[] args) {
    ChainManager chainManager = new ChainManager();
    chainManager.addHandler(new PrintlnAHandler());
    chainManager.addHandler(new PrintlnBHandler());
    chainManager.addHandler(new PrintlnCHandler());
    chainManager.handle();
  }
}
