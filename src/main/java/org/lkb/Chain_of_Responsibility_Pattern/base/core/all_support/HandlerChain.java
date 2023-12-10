package org.lkb.Chain_of_Responsibility_Pattern.base.core.all_support;

public class HandlerChain {

  private AbstractHandler head, tail;

  HandlerChain() {

  }

  private boolean isEmpty() {
    return head == null && tail == null;
  }


  public void addHandler(AbstractHandler handler) {
    if (handler == null) {
      return;
    }
    handler.setSuccessor(null);
    if (isEmpty()) {
      head = tail = handler;
    } else {
      tail.setSuccessor(handler);
      tail = handler;
    }
  }

  public final void handle() {
    AbstractHandler node = head;
    while (node != null) {
      node.handle();
      node = node.getSuccessor();
    }
  }
}
