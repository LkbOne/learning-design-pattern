package org.lkb.template_method_pattern;

import org.lkb.template_method_pattern.core.AbstractMethodTemplate;

public class PrintlnAWordMethodTemplate extends AbstractMethodTemplate {
  @Override
  public void printlnA() {
    System.out.println("A");
  }

  @Override
  public void printlnB() {

    System.out.println("B");
  }

  @Override
  public void printlnC() {
    System.out.println("C");

  }
}
