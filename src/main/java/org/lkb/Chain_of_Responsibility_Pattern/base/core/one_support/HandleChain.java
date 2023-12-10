package org.lkb.Chain_of_Responsibility_Pattern.base.core.one_support;

public class HandleChain {

  private AbstractHandler head, tail;

  private boolean isEmpty() {
    return this.head == null && this.tail == null;
  }

  public void addHandle(AbstractHandler handle) {
    if (handle == null) {
      return;
    }
    handle.setSuccessor(null);

    if (isEmpty()) {
      head = tail = handle;
    }
    tail.setSuccessor(handle);
  }

  public final void handle() {
    AbstractHandler node = head;
    while (node != null) {
      if (node.isSupport()) {
        node.handler();
      }
      node = node.getSuccessor();
    }
  }
}
