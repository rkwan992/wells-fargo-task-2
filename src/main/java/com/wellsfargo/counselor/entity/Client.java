package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    protected Client() {
    }

    public Client(String firstName, String lastName, String email, String phone, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
    }

    // Getters and setters (NO setClientId!)
    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
      return lastName;
    }

    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    public String getEmail(){
      return email;
    }

    public void setEmail(String email){
      this.email = email;
    }

    public String getPhone(){
      return phone;
    }

    public void setPhone(String phone){
      this.phone = phone;
    }

    public Advisor getAdvisor(){
      return advisor;
    }

    public void setAdvisor(Advisor advisor){
      this.Advisor = Advisor;
    }
}
