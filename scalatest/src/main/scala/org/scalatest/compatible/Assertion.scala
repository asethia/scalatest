/*
 * Copyright 2001-2016 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest.compatible

/**
 * Marker trait for ScalaTest-compatible assertion types.
 *
 * <p>
 * This will eventually be released as a module, so that third-party libraries
 * can depend just on a module that has just this one thing in it. Since it
 * compiles down to a simple Java interface, there should be no binary compatibility
 * worries. It allows third party libraries to define things that can appear
 * last in a ScalaTest test body that requires type compatible.Assertion.
 * </p>
 */
trait Assertion
