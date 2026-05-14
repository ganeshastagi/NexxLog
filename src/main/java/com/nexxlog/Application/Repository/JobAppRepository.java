package com.nexxlog.Application.Repository;

import com.nexxlog.Application.Model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAppRepository extends JpaRepository<JobApplication, Long> {
}
