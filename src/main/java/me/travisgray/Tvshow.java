package me.travisgray;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ${TravisGray} on 11/7/2017.
 */
public class Tvshow {

    @NotNull
//    @Min(18) won’t allow if the age is less than 1
    @Min(1)
    private long id;



//    @NotNull won’t allow a null value, which is what Spring MVC generates if the entry is empty
    @NotNull
//    @Size(min=2, max=20) will only allow names between 2 and 20 characters long
    @Size(min=3, max=20)
    private String name;

    @NotNull
    @Size(min=3, max=10)
    private String type;

    @NotNull
    @Size(min=3, max=10)
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
