/*
 * (C) Copyright IBM Corp. 2001
 */
/**
 * put your documentation comment here
 */
class OPT_SingletonSet extends JDK2_AbstractSet {
  Object o;

  /**
   * put your documentation comment here
   * @param   Object o
   */
  OPT_SingletonSet (Object o) {
    this.o = o;
  }

  /**
   * put your documentation comment here
   * @param o
   * @return 
   */
  public boolean contains (Object o) {
    return  this.o == o;
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public int hashCode () {
    return  this.o.hashCode();
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public JDK2_Iterator iterator () {
    return  new OPT_SingletonIterator(o);
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public int size () {
    return  1;
  }

  /**
   * put your documentation comment here
   * @return 
   */
  public Object[] toArray () {
    Object[] a = new Object[1];
    a[0] = o;
    return  a;
  }
}



