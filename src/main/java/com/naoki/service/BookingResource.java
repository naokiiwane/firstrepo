package com.naoki.service;

import com.naoki.model.BookingRecord;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

/**
 * This is the resource class
 */
@Path("/itinerary")
public class BookingResource {

    private static final String ITINERARY_ID = "itineraryId";
    private static HashMap<String, BookingRecord> inMemoryRecord;
    static{
        inMemoryRecord = new HashMap<String, BookingRecord>();
        inMemoryRecord.put("1", new BookingRecord("Naoki", "Iwane"));
        inMemoryRecord.put("2", new BookingRecord("N", "I"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BookingRecord getCustomerProfile(@QueryParam(ITINERARY_ID) String itineraryId) {
        if(itineraryId != null){
            return inMemoryRecord.get(itineraryId);
        }
        return null;
    }
}
