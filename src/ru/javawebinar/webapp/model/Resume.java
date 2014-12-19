package ru.javawebinar.webapp.model;

import java.util.*;

/**
 * gkislin
 * 12.12.2014.
 */
public class Resume {
    private String fio;
    private String url;
    private String address;
    private String phone;
    private String email;
    private String skype;
    private Objective objective;
    private List<Achievement> achievements = new ArrayList<Achievement>();
    private List<Qualification> qualifications = new ArrayList<Qualification>();
    private List<Experience> experiences = new ArrayList<Experience>();
    private List<Education> educations = new ArrayList<Education>();
    private Map<SectionType, List<Row>> sections  = new HashMap<SectionType, List<Row>>();

    public Resume(String fio, Objective objective) {
        this.fio = fio;
        this.objective = objective;
    }

    public Resume(String fio, Objective objective, String url, String address, String phone, String email, String skype) {
        this(fio, objective);
        this.url = url;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
        this.objective = objective;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public void addSection(SectionType type, Row row)
    {
        if (!sections.containsKey(type))
            sections.put(type, new ArrayList<Row>());
        sections.get(type).add(row);
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void addExperince(Experience experience) {
        this.experiences.add(experience);
    }

    public void addEducation(Education education){
        this.educations.add(education);
    }

    public String getSection(SectionType type)
    {
        StringBuilder sb = new StringBuilder();
        for(Row row : sections.get(type))
            sb.append(row.toString());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Резюме \n " + fio +
                "\n\t" + getSection(SectionType.CONTACT) +
                "\n\n\tЦель: " + objective +
                "\n \n\tДостижения: " + getSection(SectionType.ACHIEVEMENT) +
                "\n \n\tКвалификация: " + getSection(SectionType.QUALIFICATION) +
                " \n\tОпыт работы: " + experiences +
                " \n\tОбразование: " + educations;
    }
}
