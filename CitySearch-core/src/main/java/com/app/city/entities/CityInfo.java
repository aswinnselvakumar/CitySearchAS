package com.app.city.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="city_info")
public class CityInfo {
  
  @EmbeddedId
  private CityInfoId cityInfoId;
  
  public CityInfoId getCityInfoId() {
    return cityInfoId;
  }
  public void setCityInfoId(CityInfoId cityInfoId) {
    this.cityInfoId = cityInfoId;
  }
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="city_id")
  private long cityId;
   
  @Column(name="city_short_name")
  private String cityShortName;
  
  @Column(name="city_state")
  private String cityState;
  
  public long getCityId() {
    return cityId;
  }
  public void setCityId(long cityId) {
    this.cityId = cityId;
  }

  public String getCityShortName() {
    return cityShortName;
  }
  public void setCityShortName(String cityShortName) {
    this.cityShortName = cityShortName;
  }
  public String getCityState() {
    return cityState;
  }
  public void setCityState(String cityState) {
    this.cityState = cityState;
  }
}
