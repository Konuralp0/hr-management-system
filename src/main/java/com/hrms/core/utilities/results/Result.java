package com.hrms.core.utilities.results;

public class Result { // bu sinifi business da kullancaz ornek: post metodunda once db erisim eger erisim 200 ise result true dondur yada post ederken hesapta yeterli para yok requestin responsina yaz
  private boolean success;
  private String message;

  public Result(boolean success){
    this.success = success;

  }
  public Result(boolean success,String message){
    this(success);
    this.message = message;

  }

  public boolean isSuccess() {
    return success;
  }

  public String getMessage() {
    return message;
  }
}
