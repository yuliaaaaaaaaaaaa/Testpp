package org.example;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectPackages("org.example")
//@IncludeTags("param")
@ExcludeTags("param")
public class TestSuite{
}
