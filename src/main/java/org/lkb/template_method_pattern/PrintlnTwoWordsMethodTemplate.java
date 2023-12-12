package org.lkb.template_method_pattern;

import org.lkb.template_method_pattern.core.AbstractMethodTemplate;

public class PrintlnTwoWordsMethodTemplate extends AbstractMethodTemplate {
  @Override
  public void printlnA() {
    System.out.println("AA");
  }

  @Override
  public void printlnB() {
    System.out.println("BB");
  }

  @Override
  public void printlnC() {
    System.out.println("CC");
  }
}
