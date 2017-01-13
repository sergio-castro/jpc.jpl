package org.jpc.salt.jpl;


import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.jpc.salt.JpcTermWriter;
import org.jpc.term.Atom;
import org.jpc.term.Compound;
import org.jpc.term.FloatTerm;
import org.jpc.term.IntegerTerm;
import org.jpc.term.Term;
import org.jpc.term.Var;
import org.junit.Test;

public class JplTransformationTest {

	org.jpl7.Term t1Jpl = new org.jpl7.Compound("id", new org.jpl7.Term[] {new org.jpl7.Compound("name2", new org.jpl7.Term[] {new org.jpl7.Atom("atom1"), new org.jpl7.Integer(-10), new org.jpl7.Float(10.5), new org.jpl7.Variable("A"), new org.jpl7.Variable("_A")})});
	Term t1Jpc = new Compound("id", asList(new Compound("name2", asList(new Atom("atom1"), new IntegerTerm(-10), new FloatTerm(10.5), new Var("A"), new Var("_A")))));
	
	@Test
	public void testJplToJpl() {
		JplTermWriter termWriter = new JplTermWriter();
		new JplTermReader(t1Jpl, termWriter).read();
		assertEquals(t1Jpl, termWriter.getFirst());
	}
	
	@Test
	public void testJplToJpc() {
		JpcTermWriter jpcTermWriter = new JpcTermWriter();
		new JplTermReader(t1Jpl, jpcTermWriter).read();
		assertEquals(t1Jpc, jpcTermWriter.getFirst());
	}
	
	@Test
	public void testJpcToJpl() {
		JplTermWriter jplTermWriter = new JplTermWriter();
		t1Jpc.read(jplTermWriter);
		assertEquals(t1Jpl, jplTermWriter.getFirst());
	}
	
}
