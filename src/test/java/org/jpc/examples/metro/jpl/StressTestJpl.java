package org.jpc.examples.metro.jpl;

import org.jpc.engine.jpl.DefaultJplConfiguration.DefaultJplYapConfiguration;
import org.jpc.examples.metro.StressTest;
import org.jpc.examples.metro.imp.MetroImp;
import org.jpc.util.ThreadLocalLogicEngine;
import org.junit.BeforeClass;
import static junit.framework.Assert.assertTrue;


public class StressTestJpl extends StressTest {

	@BeforeClass
    public static void oneTimeSetUp() {
		ThreadLocalLogicEngine.setLogicEngine(new DefaultJplYapConfiguration().getEngine());
		assertTrue(MetroImp.loadAll());
    }

}