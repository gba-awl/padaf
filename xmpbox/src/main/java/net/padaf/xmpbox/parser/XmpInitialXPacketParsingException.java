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
package net.padaf.xmpbox.parser;

/**
 * This exception is thrown when a problem is encountered during the initial
 * Xpacket parsing
 * 
 * @author a183132
 * 
 */
public class XmpInitialXPacketParsingException extends XmpParsingException {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create an instance of InitialXPacketParsingException
	 * 
	 * @param message
	 *            a description of the encountered problem
	 * @param cause
	 *            the cause of the exception
	 */
	public XmpInitialXPacketParsingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Create an instance of InitialXPacketParsingException
	 * 
	 * @param message
	 *            a description of the encountered problem
	 */
	public XmpInitialXPacketParsingException(String message) {
		super(message);
	}

}
