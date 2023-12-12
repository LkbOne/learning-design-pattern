package org.lkb.template_method_pattern;

import org.lkb.template_method_pattern.core.AbstractMethodTemplate;

public class Demo {
  public static void main(String[] args) {
    AbstractMethodTemplate printlnAWord = new PrintlnAWordMethodTemplate();
    AbstractMethodTemplate printlnTwoWords = new PrintlnTwoWordsMethodTemplate();

    printlnAWord.toPrintln();
    printlnTwoWords.toPrintln();
  }
}
