package yavirac.ProyectoIntegradorSISAAD.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    
    @Autowired
    ActivityRepository activityRepository;

    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    public Activity findById(long id) {
        return activityRepository.findById(id).orElse(new Activity());
    }
}
