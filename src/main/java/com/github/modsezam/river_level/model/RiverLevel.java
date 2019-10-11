package com.github.modsezam.river_level.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_stacji",
    "stacja",
    "rzeka",
    "stan_wody",
    "stan_wody_data_pomiaru",
    "temperatura_wody",
    "temperatura_wody_data_pomiaru",
    "zjawisko_lodowe",
    "zjawisko_lodowe_data_pomiaru",
    "zjawisko_zarastania",
    "zjawisko_zarastania_data_pomiaru"
})
public class RiverLevel {

    @JsonProperty("id_stacji")
    private String idStacji;
    @JsonProperty("stacja")
    private String stacja;
    @JsonProperty("rzeka")
    private String rzeka;
    @JsonProperty("stan_wody")
    private String stanWody;
    @JsonProperty("stan_wody_data_pomiaru")
    private String stanWodyDataPomiaru;
    @JsonProperty("temperatura_wody")
    private String temperaturaWody;
    @JsonProperty("temperatura_wody_data_pomiaru")
    private String temperaturaWodyDataPomiaru;
    @JsonProperty("zjawisko_lodowe")
    private String zjawiskoLodowe;
    @JsonProperty("zjawisko_lodowe_data_pomiaru")
    private String zjawiskoLodoweDataPomiaru;
    @JsonProperty("zjawisko_zarastania")
    private Object zjawiskoZarastania;
    @JsonProperty("zjawisko_zarastania_data_pomiaru")
    private Object zjawiskoZarastaniaDataPomiaru;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id_stacji")
    public String getIdStacji() {
        return idStacji;
    }

    @JsonProperty("id_stacji")
    public void setIdStacji(String idStacji) {
        this.idStacji = idStacji;
    }

    @JsonProperty("stacja")
    public String getStacja() {
        return stacja;
    }

    @JsonProperty("stacja")
    public void setStacja(String stacja) {
        this.stacja = stacja;
    }

    @JsonProperty("rzeka")
    public String getRzeka() {
        return rzeka;
    }

    @JsonProperty("rzeka")
    public void setRzeka(String rzeka) {
        this.rzeka = rzeka;
    }

    @JsonProperty("stan_wody")
    public String getStanWody() {
        return stanWody;
    }

    @JsonProperty("stan_wody")
    public void setStanWody(String stanWody) {
        this.stanWody = stanWody;
    }

    @JsonProperty("stan_wody_data_pomiaru")
    public String getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    @JsonProperty("stan_wody_data_pomiaru")
    public void setStanWodyDataPomiaru(String stanWodyDataPomiaru) {
        this.stanWodyDataPomiaru = stanWodyDataPomiaru;
    }

    @JsonProperty("temperatura_wody")
    public String getTemperaturaWody() {
        return temperaturaWody;
    }

    @JsonProperty("temperatura_wody")
    public void setTemperaturaWody(String temperaturaWody) {
        this.temperaturaWody = temperaturaWody;
    }

    @JsonProperty("temperatura_wody_data_pomiaru")
    public String getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    @JsonProperty("temperatura_wody_data_pomiaru")
    public void setTemperaturaWodyDataPomiaru(String temperaturaWodyDataPomiaru) {
        this.temperaturaWodyDataPomiaru = temperaturaWodyDataPomiaru;
    }

    @JsonProperty("zjawisko_lodowe")
    public String getZjawiskoLodowe() {
        return zjawiskoLodowe;
    }

    @JsonProperty("zjawisko_lodowe")
    public void setZjawiskoLodowe(String zjawiskoLodowe) {
        this.zjawiskoLodowe = zjawiskoLodowe;
    }

    @JsonProperty("zjawisko_lodowe_data_pomiaru")
    public String getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    @JsonProperty("zjawisko_lodowe_data_pomiaru")
    public void setZjawiskoLodoweDataPomiaru(String zjawiskoLodoweDataPomiaru) {
        this.zjawiskoLodoweDataPomiaru = zjawiskoLodoweDataPomiaru;
    }

    @JsonProperty("zjawisko_zarastania")
    public Object getZjawiskoZarastania() {
        return zjawiskoZarastania;
    }

    @JsonProperty("zjawisko_zarastania")
    public void setZjawiskoZarastania(Object zjawiskoZarastania) {
        this.zjawiskoZarastania = zjawiskoZarastania;
    }

    @JsonProperty("zjawisko_zarastania_data_pomiaru")
    public Object getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    @JsonProperty("zjawisko_zarastania_data_pomiaru")
    public void setZjawiskoZarastaniaDataPomiaru(Object zjawiskoZarastaniaDataPomiaru) {
        this.zjawiskoZarastaniaDataPomiaru = zjawiskoZarastaniaDataPomiaru;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
