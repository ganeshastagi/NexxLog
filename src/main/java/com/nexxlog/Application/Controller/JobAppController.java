package com.nexxlog.Application.Controller;

import com.nexxlog.Application.Model.JobApplication;
import com.nexxlog.Application.Service.JobAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/JobApplication")
@RequiredArgsConstructor
public class JobAppController {

    @Autowired
    private final JobAppService jobAppService;

    @PostMapping("/addApp/{userId}")
    public JobApplication addApp(@PathVariable Long userId, @RequestBody JobApplication jobApplication) {
        return jobAppService.addApp(userId,jobApplication);
    }

    @GetMapping("/getApp/{userId}")
    public List<JobApplication> getApp() {
        return jobAppService.getApp();
    }
}
