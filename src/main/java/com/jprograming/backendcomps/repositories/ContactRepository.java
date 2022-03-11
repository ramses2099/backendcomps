package com.jprograming.backendcomps.repositories;

import com.jprograming.backendcomps.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
