package org.lkb.template_method_pattern.core;

public abstract class AbstractMethodTemplate {

  // 设置为protected 保证实现类不能访问。
  protected abstract void printlnA();

  // 设置为protected 保证实现类不能访问。
  protected abstract void printlnB();

  // 设置为protected 保证实现类不能访问。
  protected abstract void printlnC();

  // 设置为final，避免被改动
  public final void toPrintln() {
    printlnA();
    printlnB();
    printlnC();
  }
}
