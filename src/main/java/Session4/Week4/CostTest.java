package Session4.Week4;

import org.junit.Test;

import junit.framework.TestCase;

public class CostTest extends TestCase 
{
	@Test
	public void test1() {
		Cost costclass = new Cost();
		double actual = costclass.cost(1,2512);
		assertEquals(3014400.0,actual,0.001);
	}
	@Test
	public void test2() {
		Cost costclass = new Cost();
		double actual = costclass.cost(2,2512);
		assertEquals(3768000.0,actual,0.001);
	}
	@Test
	public void test3() {
		Cost costclass = new Cost();
		double actual = costclass.cost(3,2512);
		assertEquals(4521600.0,actual,0.001);
	}
	@Test
	public void test4() {
		Cost costclass = new Cost();
		double actual = costclass.cost(4,2512);
		assertEquals(6280000.0,actual,0.001);
	}
}
