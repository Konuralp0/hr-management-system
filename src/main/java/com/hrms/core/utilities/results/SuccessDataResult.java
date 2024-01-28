package com.hrms.core.utilities.results;

/**
 * The type Success data result.
 *
 * @param <T> the type parameter
 */
public class SuccessDataResult<T> extends DataResult{

  /**
   * Instantiates a new Success data result.
   *
   * @param data    the data
   * @param message the message
   */
  public SuccessDataResult(T data, String message) {
    super(data, true,message);
  }

  /**
   * Instantiates a new Success data result.
   *
   * @param data the data
   */
  public SuccessDataResult(T data){
    super(data,true);
  }

}
