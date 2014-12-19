package ru.javawebinar.webapp.model;

/**
 * rahmetov
 * 19.12.2014.
 */
public class Contact extends Section {
    private String url;
    private String address;
    private String phone;
    private String email;
    private String skype;

    public Contact(String url, String address, String phone, String email, String skype) {
        this.url = url;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
    }

    @Override
    public String toString() {
        return "\n\t\tДомашняя страница: " + url +
                "\n\t\tАдрес проживания: " + address +
                "\n\t\tТел.: " + phone +
                "\n\t\tEmail: " + email +
                "\n\t\tSkype: " + skype;
    }

   /*  resume.addSection(SectionType.CONTACT, new Section("Домашняя страница", "http://gkislin.ru"));
    resume.addSection(SectionType.CONTACT, new Section("Адрес проживания", "Россия, г. Санкт-Петербург"));
    resume.addSection(SectionType.CONTACT, new Section("Тел.", "+7 (921) 855 0482"));
    resume.addSection(SectionType.CONTACT, new Section("Email", "gkislin@yandex.ru"));
    resume.addSection(SectionType.CONTACT, new Section("Skype", "grigory.kislin"));*/
}
