package com.jprograming.backendcomps.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contactDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetail {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gender")
    private int gender;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @OneToOne
    @MapsId
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
