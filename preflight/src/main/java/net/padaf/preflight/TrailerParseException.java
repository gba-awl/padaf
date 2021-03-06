/*******************************************************************************
 * Copyright 2010 Atos Worldline SAS
 * 
 * Licensed by Atos Worldline SAS under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Atos Worldline SAS licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * 
 */
package net.padaf.preflight;

import net.padaf.preflight.javacc.ParseException;

/**
 * This Exception is thrown if an validation error occurs during the javacc
 * validation in the PDF Trailer.
 * 
 * Error codes provided by this exception should start by 1.4 or 1.0.
 */
public class TrailerParseException extends PdfParseException {
  /*
   * (non-Javadoc)
   * 
   * @see
   * net.awl.edoc.pdfa.validation.PdfParseException#PdfParseException(net.awl
   * .edoc.pdfa.validation.ParseException)
   */
  public TrailerParseException(ParseException e) {
    super(e);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * net.awl.edoc.pdfa.validation.PdfParseException#PdfParseException(java.lang
   * .String,java.lang.String)
   */
  public TrailerParseException(String message, String code) {
    super(message, code);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * net.awl.edoc.pdfa.validation.PdfParseException#PdfParseException(java.lang
   * .String)
   */
  public TrailerParseException(String message) {
    super(message);
  }

  /*
   * (non-Javadoc)
   * 
   * @see net.awl.edoc.pdfa.validation.PdfParseException#getErrorCode()
   */
  @Override
  public String getErrorCode() {
    if (!isTokenMgrError) {
      // use token information to know the cause
      System.out.println("## Trailer ParseError");
    }
    // else Token Management Error or Unknown Error during the Trailer
    // Validation
    return ValidationConstants.ERROR_SYNTAX_TRAILER;
  }
}
