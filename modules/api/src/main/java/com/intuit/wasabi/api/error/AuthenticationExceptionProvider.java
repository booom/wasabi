/*******************************************************************************
 * Copyright 2016 Intuit
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.api.error;

import com.google.inject.Inject;
import com.intuit.wasabi.api.HttpHeader;
import com.intuit.wasabi.exceptions.AuthenticationException;

import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

@Provider
public class AuthenticationExceptionProvider extends ExceptionProvider<AuthenticationException> {

    @Inject
    public AuthenticationExceptionProvider(final HttpHeader httpHeader, final ExceptionJsonifier exceptionJsonifier) {
        super(UNAUTHORIZED, APPLICATION_JSON_TYPE, httpHeader, exceptionJsonifier);
    }
}
