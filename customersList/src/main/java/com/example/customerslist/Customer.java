package com.example.customerslist;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="emailAddress")
    private String emailAddress;
    @Column(name="jobTitle")
    private String jobTitle;
    @Column(name="mobilePhone")
    private String mobilePhone;
    @Column(name="city")
    private String city;
    @Column(name="webPage")
    private String webPage;

    public Customer() {
    }

    public Long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getCity() {
        return city;
    }

    public String getWebPage() {
        return webPage;
    }



    public void setId(Long id){
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }
}
