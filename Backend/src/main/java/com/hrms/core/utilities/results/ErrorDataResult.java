package com.hrms.core.utilities.results;

/**
 * The type Error data result.
 *
 * @param <T> the type parameter
 */
public class ErrorDataResult<T> extends DataResult<T>{


  /**
   * Instantiates a new Error data result.
   *
   * @param data    the data
   * @param message the message
   */
  public ErrorDataResult(T data, String message) {
    super(data, false,message);
  }

  /**
   * Instantiates a new Error data result.
   *
   * @param data the data
   */
  public ErrorDataResult(T data){
    super(data,false);
  }
}
