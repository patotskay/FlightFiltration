package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class FlightService extends FlightBuilder {

    public void OutPutTreat() {

        List<Flight> flightList = FlightBuilder.createFlights();
        for (Flight fb : flightList) {
            List<Segment> segmentList = fb.getSegments();
            for (Segment sg : segmentList) {
                LocalDateTime a = sg.getDepartureDate();
                LocalDateTime b = LocalDateTime.now();
                if (a.isBefore(b) == false) {
                    System.out.println(fb);

                }
            }
        }
    }
}
