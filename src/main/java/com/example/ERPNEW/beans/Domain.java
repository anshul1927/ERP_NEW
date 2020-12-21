package com.example.ERPNEW.beans;


import javax.persistence.*;

@Entity
@Table
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String domain_id;
    @Column(nullable = false)
    private String program;
    @Column(nullable = false)
    private String batch;
//   @Column(nullable = false)
//    private Integer capacity;


    public Domain(String program, String batch) {
        this.domain_id = program;
        this.batch = batch;
       // this.capacity = capacity;
    }

    public Domain() {

    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

//    public Integer getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(Integer capacity) {
//        this.capacity = capacity;
//    }

//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
