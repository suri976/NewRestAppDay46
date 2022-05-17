package ai.jobiak.empapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.jobiak.empapi.model.Mobile;
import ai.jobiak.empapi.repository.MobileRepository;
import antlr.collections.List;

@Service
public class MobileService {

	@Autowired
	MobileRepository repo;
	
	public Mobile addMobile(Mobile mobile)
	{
		Mobile ref = repo.save(mobile);
		return ref;
	}
	
	public Mobile modifyMobile(Mobile mobile)
	{
		return repo.save(mobile);
		
	}
	
//	public Mobile removeProduct(Long mobileId)
//	{
//	  repo.save(mobile);
//		
//	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}