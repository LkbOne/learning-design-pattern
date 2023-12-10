package org.lkb.Chain_of_Responsibility_Pattern.base.demo.all_support;

import org.lkb.Chain_of_Responsibility_Pattern.base.core.all_support.AbstractHandler;

public class PrintlnAHandler extends AbstractHandler {
  @Override
  public void handle() {
    System.out.println("A");
  }
}
