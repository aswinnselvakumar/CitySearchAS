package com.app.city.exceptions;

import javax.servlet.http.HttpServletResponse;

public class InvalidParametersException extends RuntimeException {
  private static final long serialVersionUID = 4312046993756737113L;

  public InvalidParametersException(String exp, HttpServletResponse response) {
    super(exp);
  }
  public InvalidParametersException(String exp) {
    super(exp);
  }
}
