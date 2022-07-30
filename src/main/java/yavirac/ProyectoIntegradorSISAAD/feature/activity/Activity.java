package yavirac.ProyectoIntegradorSISAAD.feature.activity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Activity {
    @Id private long id;
    private String name;
}
