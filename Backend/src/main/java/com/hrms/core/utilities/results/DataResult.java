package com.hrms.core.utilities.results;

/**
 * The type Data result.
 *
 * @param <T> the type parameter
 */
public class DataResult<T> extends Result{
  private T data;

  /**
   * Instantiates a new Data result.
   *
   * @param data    the data
   * @param success the success
   */
  public DataResult(T data, boolean success) {
    super(success);
    this.data = data;
  }

  /**
   * Instantiates a new Data result.
   *
   * @param data    the data
   * @param success the success
   * @param message the message
   */
  public DataResult(T data, boolean success, String message) {
    super(success, message);
    this.data = data;
  }

  /**
   * Gets data.
   *
   * @return the data
   */
  public T getData() {
    return data;
  }
}
