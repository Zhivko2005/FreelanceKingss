package FreelanceKings.FreelanceKingss.Repostiories;

import FreelanceKings.FreelanceKingss.Models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
