package com.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CityInfoId implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = -3490132790806562288L;
@Column(name="city_name")
  private String cityName;
  
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getCityCountry() {
    return cityCountry;
  }

  public void setCityCountry(String cityCountry) {
    this.cityCountry = cityCountry;
  }

  @Column(name="city_country")
  private String cityCountry;
  

}
