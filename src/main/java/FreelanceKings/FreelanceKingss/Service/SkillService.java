package FreelanceKings.FreelanceKingss.Service;

import FreelanceKings.FreelanceKingss.Models.Skill;
import FreelanceKings.FreelanceKingss.Repostiories.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    private final SkillRepository skillRepository;
    public SkillService(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }
    public List<Skill> getAllSkills(){
        return skillRepository.findAll();
    }
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
    }
    public Skill updateSkill(long id,Skill updatedSkill ){
        Skill skill = getSkillById(id);
        skill.setTitle(updatedSkill.getTitle());
        skill.setDescription(updatedSkill.getDescription());
        skill.setUser(updatedSkill.getUser());
        return skillRepository.save(skill);
    }
    public Skill createSkill(Skill skill){
        return skillRepository.save(skill);
    }
    public void deleteSkill(long id){
        skillRepository.deleteById(id);
    }
}
