/*
 * (C) Copyright IBM Corp. 2001
 */
/**
 * A <code>FilterIterator</code> filters and maps a source
 * <code>Iterator</code> to generate a new one.
 */
public class OPT_FilterIterator
    implements JDK2_Iterator {
  final JDK2_Iterator i;
  final Filter f;
  private Object next = null;
  private boolean done = false;

  /**
   * put your documentation comment here
   * @param   JDK2_Iterator i
   * @param   Filter f
   */
  public OPT_FilterIterator (JDK2_Iterator i, Filter f) {
    this.i = i;
    this.f = f;
    advance();
  }

  /**
   * put your documentation comment here
   */
  private void advance () {
    while (i.hasNext()) {
      next = i.next();
      if (f.isElement(next))
        return;
    }
    done = true;
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public Object next () {
    if (done)
      throw  new JDK2_NoSuchElementException();
    Object o = next;
    advance();
    return  f.map(o);
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public boolean hasNext () {
    return  !done;
  }

  /**
   * put your documentation comment here
   */
  public void remove () {
    throw  new JDK2_UnsupportedOperationException();
  }

  /**
   * put your documentation comment here
   */
  public static class Filter {                  // override with your mapping.

    /**
     * put your documentation comment here
     * @param o
     * @return 
     */
    public boolean isElement (Object o) {
      return  true;
    }

    /**
     * put your documentation comment here
     * @param o
     * @return 
     */
    public Object map (Object o) {
      return  o;
    }
  }
}



