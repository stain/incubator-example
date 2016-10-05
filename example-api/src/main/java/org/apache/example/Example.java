/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.example;

/**
 * Example.
 * <p>
 * This is an example of an interface.
 * 
 * @since 0.1.0-incubating
 */
public interface Example {

	/**
	 * Produce a greeting
	 * 
	 * @return A greeting
	 */
	public String hello();

	/**
	 * Return the name used by the greeting.
	 * <p>
	 * The default implementation of this interface provide the string
	 * <code>World</code>.
	 * 
	 * @see #hello()
	 * @return Name used by greeting
	 */
	default String name() {
		return "World";
	}

}
