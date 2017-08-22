package com.mulesoft.training;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort dynamicPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        System.out.print("\n\n======> Dynamic port used in Test case #1 " + dynamicPort.getNumber() + "\n\n");
    	runFlowAndExpect("mavenFlow", "Hello world!!!");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
