package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    @Override
    public String toString() {
        return "Резюме \n " + fio +
                "\n\tДомашняя страница: " + url +
                "\n\tПроживание: " + address +
                "\n\tТел: " + phone +
                "\n\tEmail: " + email +
                "\n\tSkype: " + skype +
                "\n\n\tЦель: " + objective +
                "\n \n\tДостижения: " + achievements +
                " \n\tКвалификация: " + qualifications +
                " \n\tОпыт работы: " + experiences +
                " \n\tОбразование: " + educations;
    }
}
