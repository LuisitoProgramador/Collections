package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        // Aquí tu código
        if(skills.add(skill)){
            return true;
        } else if (!skills.add(skill)) {
            return false; 
        }
        return false; // sustituye este boolean por el return real
    }

    public boolean hasSkill(Skill skill) {
        // Aquí tu código
        if(skills.contains(skill)){
            return true;
        } else {
            return false;
        }
        //
        // sustituye este boolean por el return real
    }
}