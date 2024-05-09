package co.edu.escuelaing.cvds.ClothCraft.model.DTO;

import java.sql.Date;

import co.edu.escuelaing.cvds.ClothCraft.model.Calendary;
import co.edu.escuelaing.cvds.ClothCraft.model.Day;
import co.edu.escuelaing.cvds.ClothCraft.model.Outfit;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DayDTO {
    private String id;
    private Date date;
    private String calendaryId;
    private String outfitId;
    public Day toEntity(Calendary calendary, Outfit outfit) {
        Day day = new Day(id, date, calendary, outfit);
        return day;
    }
}
