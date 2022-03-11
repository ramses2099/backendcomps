package com.jprograming.backendcomps.repositories;

import com.jprograming.backendcomps.models.ContactDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailRepository extends JpaRepository<ContactDetail,Long> {

}
