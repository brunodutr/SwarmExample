package arquillian.demo.swarm;

import javax.inject.Inject;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(Arquillian.class)
public class AppTest2 {
	
	@Inject
	Repository repository;
	
	@Test
	public void testMethod1() {
		Assert.assertTrue(repository.listAll().size() == 1);
	}
   
	@Test
	public void testMethod2() {
		Assert.assertTrue(repository.listAll().size() == 1);
	}
}