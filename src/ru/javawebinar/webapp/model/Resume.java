package ru.javawebinar.webapp.model;

import java.util.*;

/**
 * gkislin
 * 12.12.2014.
 */
public class Resume {
    private String fio;
    private Objective objective;
    private Map<SectionType, List<Section>> sections  = new HashMap<SectionType, List<Section>>();

    public Resume(String fio, Objective objective) {
        this.fio = fio;
        this.objective = objective;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public void addSection(SectionType type, Section section)
    {
        if (!sections.containsKey(type))
            sections.put(type, new ArrayList<Section>());
        sections.get(type).add(section);
    }

    public String getSection(SectionType type)
    {
        StringBuilder sb = new StringBuilder();
        for(Section section : sections.get(type))
            sb.append(section.toString());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Резюме \n " + fio +
                "\n\t" + getSection(SectionType.CONTACT) +
                "\n\n\tЦель: " + objective +
                "\n \n\tДостижения: " + getSection(SectionType.ACHIEVEMENT) +
                "\n \n\tКвалификация: " + getSection(SectionType.QUALIFICATION) +
                " \n\tОпыт работы: " + getSection(SectionType.EXPERIENCE) +
                " \n\tОбразование: " + getSection(SectionType.EDUCATION);
    }
}
