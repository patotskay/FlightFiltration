package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class FlightApp {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        flightService.OutPutTreat();

        FlightService1 flightService1 = new FlightService1();
        flightService1.OutPutTreat();
    }
}

// в коде указанном ниже, моя попытка реализовать третье условие задачи

/**
 * List<Flight> flightList = FlightBuilder.createFlights();
 * for(Flight fb: flightList){
 * List<Segment> segmentList= fb.getSegments();
 * for(Segment sg:segmentList){
 * Segment[] s = fb.getSegments().toArray(new Segment[FlightBuilder.createFlights().size()]);
 * LocalDateTime a = sg.getDepartureDate();
 * for(int i=0; i<FlightBuilder.createFlights().size();i++){
 * LocalDateTime b = sg.getArrivalDate();
 * for (int j=0; j<FlightBuilder.createFlights().size();j++)
 * if(i==j);
 * else if (b.compareTo(a)>2){
 * System.out.println(fb);
 * }
 * //if(a(s).isBefore(b()));
 * }
 * }}
 * }
 */







