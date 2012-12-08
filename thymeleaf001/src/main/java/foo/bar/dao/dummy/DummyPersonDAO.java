package foo.bar.dao.dummy;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import foo.bar.dao.IPersonDAO;
import foo.bar.domain.PersonD;

public class DummyPersonDAO implements IPersonDAO{
	private final static Logger logger = LoggerFactory.getLogger(DummyPersonDAO.class);

	@Override
	public Collection<PersonD> getAll() {
		Collection<PersonD> dummyPersonList = new ArrayList<PersonD>();
		dummyPersonList.add(new PersonD("Partha")); 
		dummyPersonList.add(new PersonD("Pratim")); 
		dummyPersonList.add(new PersonD("Narottam")); 
		
		logger.debug("Created and sending a dummy person list.");

		return dummyPersonList;
	}

}
