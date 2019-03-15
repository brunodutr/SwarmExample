package arquillian.demo.swarm;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Repository {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Product> listAll() {
		return em.createQuery("from " + Product.class.getName(), Product.class).getResultList();
	}
}