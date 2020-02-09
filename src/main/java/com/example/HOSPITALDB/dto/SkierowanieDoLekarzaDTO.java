package com.example.HOSPITALDB.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class SkierowanieDoLekarzaDTO {
    Integer id;
    @NotEmpty
    String lekarz;
    @NotEmpty
    String pacjent;
    @FutureOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date termin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLekarz() {
        return lekarz;
    }

    public void setLekarz(String lekarz) {
        this.lekarz = lekarz;
    }

    public String getPacjent() {
        return pacjent;
    }

    public void setPacjent(String pacjent) {
        this.pacjent = pacjent;
    }

    public Date getTermin() {
        return termin;
    }

    public void setTermin(Date termin) {
        this.termin = termin;
    }
}
