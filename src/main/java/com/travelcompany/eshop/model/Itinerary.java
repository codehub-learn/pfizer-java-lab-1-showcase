package com.travelcompany.eshop.model;

import java.math.BigDecimal;
import java.util.Date;

public class Itinerary extends BaseEntity {
    private AirportCode departureCode;
    private AirportCode destinationCode;
    private Date departureDate;
    private String airline;
    private BigDecimal basePrice;
}