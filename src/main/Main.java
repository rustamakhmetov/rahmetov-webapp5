package main;

import ru.javawebinar.webapp.model.*;

import java.util.Locale;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    /**
     * First java program
     *
     * @param args : program arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Resume resume = new Resume("Кислин Григорий", new Objective("Архитектор/ Технический лидер/ Старший Scala/Java разработчик", "Интересен технологический стек Typesafe (Scala. Akka. Play.)"));
        resume.getAchievements().add(new Achievement("Разработка и проведение Java тренингов \"Разработка Web приложения\" и вебинаров \"Maven/ Spring/ Security/ JPA(Hibernate)/ Rest(Jackson)/ jQuery\" и \"Веб-сервисы. SOA-based архитектура\""));
        resume.getAchievements().add(new Achievement("Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, BPMN2, CMIS, LDAP. Разработка небольшого приложения Управления Окружением (вход: login/password) на стеке: Scala/Play 2.1/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера в инфраструктуру River BPM"));
        resume.getAchievements().add(new Achievement("Реализация c нуля многоуровневого фреймворка для RIA (Rich Internet Application) приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5 c аутентификацией и авторизацией пользователя для алгоритмического трейдинга. Интеграция online клиента с интеррактивным графическим javaScript фреймворком Highstock. Динамическое конфигурирование клиетской и серверной части приложения."));
        resume.getAchievements().add(new Achievement("Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS ,AS Glassfish). Поддержка статистики сервисов и информации о состоянии в формате TEXT, HTML, JMX. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django), интеграция системы с Nagios.\n"));
        resume.getAchievements().add(new Achievement("Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа."));

        resume.getQualifications().add(new Qualification("JEE AS: GlassFish (v2.1, v3); OC4J; JBoss; Tomcat; Jetty, WebLogic, WSO2"));
        resume.getQualifications().add(new Qualification("Version control: Subversion; Mercury; ClearCase; Perforce, Git"));
        resume.getQualifications().add(new Qualification("DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis java client), Oracle; MySQL; SQLite; MS SQL; HSQLDB"));
        resume.getQualifications().add(new Qualification("Languages: Java; Groovy; Python/Jython/PL-Python; JavaScript; Scala; (D)HTML; CSS; XML/XSD/XSL; SQL; C++; Unix shell scripts; Fortran; VB; JSON; regExp"));

        Experience experience = new Experience("RIT Center");
        experience.getWorks().add(new WorkExtended(new Objective("Java архитектор"), "04/2012- сейчас", "Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO.\n" +
                "Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS , BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat, WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python"));
        resume.addExperince(experience);

        experience = new Experience("LevelUp");
        Objective trainer = new Objective("Автор и ведущий вебинара");
        experience.getWorks().add(new WorkExtended(trainer, "08/2014- 09/2014", "Maven/ Spring/ Security/ JPA(Hibernate)/ Rest(Jackson)/ jQuery"));
        experience.getWorks().add(new WorkExtended(trainer, "01/2014- 08/2014", "Веб-сервисы. SOA-based архитектура"));
        experience.getWorks().add(new WorkExtended(trainer, "10/2013- 08/2014", "Java для программистов. Разработка Web приложения"));
        resume.addExperince(experience);

        Education education = new Education("Coursera");
        education.getCourses().add(new Work("2013", "Курс \"Functional Programming Principles in Scala\" by Martin Odersky\n" +
                "Сертификат с отличием (100.0%). "));
        resume.addEducation(education);

        education = new Education("Институт Точной Механики и Оптики (Технический университет)");
        education.getCourses().add(new Work("1993-1996", "Аспирантура"));
        education.getCourses().add(new Work("1987-1993", "Инженер"));
        resume.addEducation(education);

        System.out.println(resume);

    }
}
