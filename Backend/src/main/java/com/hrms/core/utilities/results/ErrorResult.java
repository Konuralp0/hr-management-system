package com.hrms.core.utilities.results;

/**
 * The type Error result.
 */
public class ErrorResult extends Result{
  /**
   * Instantiates a new Error result.
   */
  public ErrorResult(){
    super(false);
  }

  /**
   * Instantiates a new Error result.
   *
   * @param message the message
   */
  public ErrorResult(String message){
    super(false,message);
  }
}
