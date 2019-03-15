package arquillian.demo.swarm;

import org.eu.ingwar.tools.arquillian.extension.suite.annotations.ArquillianSuiteDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

@ArquillianSuiteDeployment
public class DeploymentManager {
	
	@Deployment
	public static JavaArchive createDeployment() {
		
		return ShrinkWrap.create(JavaArchive.class)
				.addPackages(true, "org.jboss.weld.exceptions")
				.addPackages(true, "org.hibernate.envers")
				.addPackages(true, "org.hibernate.exception")
				.addPackages(true, "org.apache.commons")
				.addPackages(true, "arquillian.demo.swarm")
				.addAsResource("persistence.xml", "META-INF/persistence.xml")
				.addAsResource("beans.xml", "META-INF/beans.xml")
				.addAsResource("myimport.sql", "import.sql");
	}
}