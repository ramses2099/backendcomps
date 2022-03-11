package com.jprograming.backendcomps.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "telephone")
    private String telephone;
    @ManyToMany
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToOne(mappedBy = "contact", cascade = CascadeType.ALL)
    private ContactDetail contactDetail;


}
