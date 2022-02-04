package com.drbhagwat.Chapter3;

public interface Sequence <T> {
  public default boolean hasNext() {
	return true;
  }

  public T next();
}
