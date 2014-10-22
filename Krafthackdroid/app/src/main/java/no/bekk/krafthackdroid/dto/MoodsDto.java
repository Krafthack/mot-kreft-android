package no.bekk.krafthackdroid.dto;

import java.util.List;

import no.bekk.krafthackdroid.domain.Mood;

public class MoodsDto {
    private List<Mood> data;

    public List<Mood> getData() {
        return data;
    }

    public void setData(List<Mood> data) {
        this.data = data;
    }
}
