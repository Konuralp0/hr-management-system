package com.hrms.core.utilities.results;

/**
 * The type Result.
 */
public class Result { // bu sinifi business da kullancaz ornek: post metodunda once db erisim eger erisim 200 ise result true dondur yada post ederken hesapta yeterli para yok requestin responsina yaz
  private boolean success;
  private String message;

  /**
   * Instantiates a new Result.
   *
   * @param success the success
   */
  public Result(boolean success){
    this.success = success;

  }

  /**
   * Instantiates a new Result.
   *
   * @param success the success
   * @param message the message
   */
  public Result(boolean success,String message){
    this(success);
    this.message = message;

  }

  /**
   * Is success boolean.
   *
   * @return the boolean
   */
  public boolean isSuccess() {
    return success;
  }

  /**
   * Gets message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}
