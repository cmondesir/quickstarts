/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.switchyard.quickstarts.jca.inflow;

/**
 * Simple interface for a Greeter Service.
 *
 * @author Daniel Bevenius
 *
 */
public interface GreetingService {
    /**
     * Prints a greeting message in English using the passed in name.
     *
     * @param person Person object
     */
    void english(Person person);
    
    /**
     * Prints a greeting message in Spanish using the passed in name.
     * @param person Person object
     */
    void spanish(Person person);
    
    /**
     * Prints a greeting message in Japanese using the passed in name.
     * @param person Person object
     */
    void japanese(Person person);
}
