package com.ceiba.adnparquedero.domain.usecase;

import com.ceiba.adnparquedero.base.di.DaggerAppComponent;
import com.ceiba.adnparquedero.domain.model.ParkingPriceDomainModel;
import com.ceiba.adnparquedero.domain.repository.VehicleRepository;

import java.util.List;

import javax.inject.Inject;

public class ParkingPriceUseCase {

    @Inject
    VehicleRepository vehicleRepository;

    public ParkingPriceUseCase() {
        DaggerAppComponent.builder().build().inject(this);
    }

    public void createPriceTable(List<ParkingPriceDomainModel> priceDomainModels) {
        vehicleRepository.createParkingPriceTable(priceDomainModels);
    }
}