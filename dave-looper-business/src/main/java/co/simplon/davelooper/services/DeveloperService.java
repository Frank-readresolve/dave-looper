package co.simplon.davelooper.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.davelooper.controllers.errors.ResourceNotFoundException;
import co.simplon.davelooper.dtos.DeveloperView;
import co.simplon.davelooper.repositories.DeveloperRepository;

@Service
@Transactional(readOnly = true)
public class DeveloperService {

    private final DeveloperRepository developers;

    public DeveloperService(DeveloperRepository developers) {
	this.developers = developers;
    }

    public DeveloperView getOne(String number) {
	Optional<DeveloperView> optional = developers
		.findByRegistrationNumber(number);
	DeveloperView view = optional
		.orElseThrow(() -> new ResourceNotFoundException());
	// optional.get(); // DeveloperView or null
	return view;
    }
//    public Developer oneByRegistrationNumber(String number) {
//	Developer entity = developers.findByRegistrationNumber(number);
//	List<Skill> skills = entity.getSkills();
//	System.out.println(skills.size());
//	return entity;
//    }

    @Transactional
    public void deleteOne(Long id) {
	developers.deleteById(id);
    }
}
