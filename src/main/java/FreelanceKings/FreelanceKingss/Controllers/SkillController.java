package FreelanceKings.FreelanceKingss.Controllers;

import FreelanceKings.FreelanceKingss.Models.Skill;
import FreelanceKings.FreelanceKingss.Service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
    private final SkillService skillService;
    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }
    @GetMapping
    public List<Skill> GetAllSkills(){
        return skillService.getAllSkills();
    }
    @GetMapping("{/id")
    public Skill getSkillById(long id){
        return skillService.getSkillById(id);
    }
    @PostMapping
    public Skill createSkill(Skill skill){
        return skillService.createSkill(skill);
    }
    @PutMapping("{/id}")
    public Skill updateSkill(@PathVariable long id,@RequestBody Skill updatedSkill){
        return skillService.updateSkill(id,updatedSkill);
    }
    @DeleteMapping("{/id}")
    public void deleteSkill(long id){
        skillService.deleteSkill(id);
    }
}
