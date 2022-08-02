package yavirac.ProyectoIntegradorSISAAD.feature.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    //Create
    public Activity save(Activity activity){
        return activityRepository.save(activity);
    }

    //Read
    public Activity findById(long id){
        return activityRepository.findById(id).orElse(new Activity());
    }

    //Update = Create

    //Delete
    public void deleteById(long id){
        activityRepository.deleteById(id);
    }

    public  List<Activity> findAll(){
        return activityRepository.findAll();
    }
    
}
