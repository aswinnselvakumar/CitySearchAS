package com.app.city.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
  @JsonProperty("city_name")
  String cityName;
  
  @JsonProperty("city_short_name")
  String cityShortName;
  
  public String getCityShortName() {
    return cityShortName;
  }
  public void setCityShortName(String cityShortName) {
    this.cityShortName = cityShortName;
  }
  @JsonProperty("city_state")
  String cityState;
  
  @JsonProperty("city_country")
  String cityCountry;
  
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
  public String getCityState() {
    return cityState;
  }
  public void setCityState(String cityState) {
    this.cityState = cityState;
  }
  public String getCityCountry() {
    return cityCountry;
  }
  public void setCityCountry(String cityCountry) {
    this.cityCountry = cityCountry;
  }
}
