package com.hrms.core.utilities.results;

/**
 * The type Success result.
 */
public class SuccessResult extends Result{

  /**
   * Instantiates a new Success result.
   */
  public SuccessResult(){
    super(true);

  }

  /**
   * Instantiates a new Success result.
   *
   * @param message the message
   */
  public SuccessResult(String message) {
    super(true,message);
  }
}
