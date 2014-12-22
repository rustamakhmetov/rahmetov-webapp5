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
        resume.addSection(SectionType.CONTACT, new Contact("http://gkislin.ru", "Россия, г. Санкт-Петербург", "+7 (921) 855 0482", "gkislin@yandex.ru", "grigory.kislin"));

        resume.addSection(SectionType.ACHIEVEMENT, new Section("*", "Разработка и проведение Java тренингов \"Разработка Web приложения\" и вебинаров \"Maven/ Spring/ Security/ JPA(Hibernate)/ Rest(Jackson)/ jQuery\" и \"Веб-сервисы. SOA-based архитектура\""));
        resume.addSection(SectionType.ACHIEVEMENT, new Section("*", "Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, BPMN2, CMIS, LDAP. Разработка небольшого приложения Управления Окружением (вход: login/password) на стеке: Scala/Play 2.1/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера в инфраструктуру River BPM"));
        resume.addSection(SectionType.ACHIEVEMENT, new Section("*", "Реализация c нуля многоуровневого фреймворка для RIA (Rich Internet Application) приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5 c аутентификацией и авторизацией пользователя для алгоритмического трейдинга. Интеграция online клиента с интеррактивным графическим javaScript фреймворком Highstock. Динамическое конфигурирование клиетской и серверной части приложения."));
        resume.addSection(SectionType.ACHIEVEMENT, new Section("*", "Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS ,AS Glassfish). Поддержка статистики сервисов и информации о состоянии в формате TEXT, HTML, JMX. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django), интеграция системы с Nagios.\n"));
        resume.addSection(SectionType.ACHIEVEMENT, new Section("*", "Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа."));


        resume.addSection(SectionType.QUALIFICATION, new Section("*", "JEE AS: GlassFish (v2.1, v3); OC4J; JBoss; Tomcat; Jetty, WebLogic, WSO2"));
        resume.addSection(SectionType.QUALIFICATION, new Section("*", "Version control: Subversion; Mercury; ClearCase; Perforce, Git"));
        resume.addSection(SectionType.QUALIFICATION, new Section("*", "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis java client), Oracle; MySQL; SQLite; MS SQL; HSQLDB"));
        resume.addSection(SectionType.QUALIFICATION, new Section("*", "Languages: Java; Groovy; Python/Jython/PL-Python; JavaScript; Scala; (D)HTML; CSS; XML/XSD/XSL; SQL; C++; Unix shell scripts; Fortran; VB; JSON; regExp"));

        Experience experience = new Experience("RIT Center");
        experience.getWorks().add(new WorkExtended(new Objective("Java архитектор"), "04/2012", null, "Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO.\n" +
                "Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS , BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat, WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python"));
        resume.addSection(SectionType.EXPERIENCE, experience);

        experience = new Experience("LevelUp");
        Objective trainer = new Objective("Автор и ведущий вебинара");
        experience.getWorks().add(new WorkExtended(trainer, "08/2014", "09/2014", "Maven/ Spring/ Security/ JPA(Hibernate)/ Rest(Jackson)/ jQuery"));
        experience.getWorks().add(new WorkExtended(trainer, "01/2014", "08/2014", "Веб-сервисы. SOA-based архитектура"));
        experience.getWorks().add(new WorkExtended(trainer, "10/2013", "08/2014", "Java для программистов. Разработка Web приложения"));
        resume.addSection(SectionType.EXPERIENCE, experience);

        Education education = new Education("Coursera");
        education.getCourses().add(new Work("01/2013", "12/2013", "Курс \"Functional Programming Principles in Scala\" by Martin Odersky\n" +
                "Сертификат с отличием (100.0%). "));
        resume.addSection(SectionType.EDUCATION, education);

        education = new Education("Институт Точной Механики и Оптики (Технический университет)");
        education.getCourses().add(new Work("01/1993", "12/1996", "Аспирантура"));
        education.getCourses().add(new Work("01/1987", "12/1993", "Инженер"));
        resume.addSection(SectionType.EDUCATION, education);

        System.out.println(resume);

    }
}
