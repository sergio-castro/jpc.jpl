package org.jpc.test.engine.jpl;

import org.jpc.JpcPreferences;
import org.junit.Test;

public class jpl {
	
	
	@Test
	public void testJplEnvVars() {
		//new JPCPreferences().getVarOrDie(JPCPreferences.);
	}
	
	
	
	/*
	private String JPL_YAP_PATH = "/usr/local/lib/Yap";
	private String JPL_SWI_PATH = "/opt/local/lib/swipl/lib/i386-darwin11.4.0";
	public String prologDialect() {
		String version = null;
		Variable varVersion = new Variable("VVersion");
		Query versionQuery = new Query("current_prolog_flag", new Term[] { new Atom(DIALECT), varVersion });
		versionQuery.open();
		Map solution =  versionQuery.getSolution();
		if(solution != null)
			version = ((Atom)solution.get(varVersion.name())).name();
		versionQuery.close();

		return version;
	}
	
	@Test
	public void test2() {
		
	}
	
	@Test
	public void test1() {
		JPL.setNativeLibraryDir(JPL_SWI_PATH);
		System.out.println(Prolog.thread_self());
		System.out.println(prologDialect());
		JPL.setNativeLibraryDir(JPL_SWI_PATH);
		System.out.println(prologDialect());
		System.out.println(Prolog.thread_self());
		new Thread() {
			@Override
			public void run() {
				System.out.println(Prolog.thread_self());
				System.out.println("thread started ...");
				JPL.setNativeLibraryDir(JPL_YAP_PATH);
				System.out.println(prologDialect());
			}
		}.start();
		
	}
	*/
}
