package yavirac.ProyectoIntegradorSISAAD.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activity")
@CrossOrigin({ "*" })
public class ActivityController {
    
    @Autowired
    ActivityService activityService;

    @GetMapping("/findAll")
    public List<Activity> findAll() {
        return activityService.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Activity findById(@PathVariable long id) {
        return activityService.findById(id);
    }
}
