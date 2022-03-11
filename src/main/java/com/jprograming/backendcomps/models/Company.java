package com.jprograming.backendcomps.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="version")
    private Date version;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private CompanyStatus companyStatus;
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private CompanyDetail companyDetail;

}
