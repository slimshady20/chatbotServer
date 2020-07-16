package com.chatbot.web.volunteer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
interface VolunteerRepository extends JpaRepository<Volunteer,Long>, VolunteerService{}
interface VolunteerService {}
public class VolunteerRepositoryImpl extends QuerydslRepositorySupport implements VolunteerService {
    public VolunteerRepositoryImpl() {
        super(Volunteer.class);
    }
}
