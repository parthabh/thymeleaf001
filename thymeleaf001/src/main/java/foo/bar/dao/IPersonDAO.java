package foo.bar.dao;

import java.util.Collection;

import foo.bar.domain.PersonD;

public interface IPersonDAO {
	public Collection<PersonD> getAll(); 
}
