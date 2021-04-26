package dao;

import entity.WeatherMeasurements;

import java.util.List;

public interface WeatherMeasurementsDao {

    WeatherMeasurements create(WeatherMeasurements weatherMeasurements);
    WeatherMeasurements update(WeatherMeasurements weatherMeasurements);
    WeatherMeasurements findById(Long id);

    void delete(WeatherMeasurements weatherMeasurements);

    List<WeatherMeasurements> getAll();

}