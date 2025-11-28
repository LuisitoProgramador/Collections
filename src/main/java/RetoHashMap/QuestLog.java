package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        // Aquí tu código
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        // Aquí tu código
        Quest description = quests.get(questId);
        
        return description; // Sustituye null por el valor que sea
    }

    public void completeQuest(String questId) {
        // Aquí tu código
        if (!quests.containsKey(questId)) {
            return;
        }
        quests.get(questId).setCompleted(true);
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}