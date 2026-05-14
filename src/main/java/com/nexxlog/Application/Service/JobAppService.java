package com.nexxlog.Application.Service;

import com.nexxlog.Application.Model.JobApplication;
import com.nexxlog.Application.Model.User;
import com.nexxlog.Application.Repository.JobAppRepository;
import com.nexxlog.Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAppService {

    @Autowired
    private JobAppRepository jobAppRepo;

    @Autowired
    private UserRepository userRepository;

    public JobApplication addApp(Long userId, JobApplication jobApp) {

        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found:" + userId));

        jobApp.setUser(user);
        return jobAppRepo.save(jobApp);
    }

    public List<JobApplication> getApp() {
        return jobAppRepo.findAll();
    }
}
