/*

 Copyright: All contributers to the Umple Project
 
 This file is made available subject to the open source license found at:
 https://umple.org/license

*/

package cruise.umple.implementation.py;

import org.junit.*;

import cruise.umple.implementation.ImmutableUnidirectionalMStarTest;

public class PythonImmutableUnidirectionalMStarTest extends ImmutableUnidirectionalMStarTest
{
	  @Before
	  public void setUp()
	  {
	    super.setUp();
	    language = "Python";
	    languagePath = "py";
	  }
}