package com.jprograming.backendcomps.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "companyDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDetail {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employeeStrength")
    private int employeeStrength;
    @Column(name="notes")
    private String notes;

}
