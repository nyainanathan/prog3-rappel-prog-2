package com.nathan;

import java.time.Instant;

public class InstantUtils {
    static Instant getClosestInstant(Instant[] instants, Instant instant) {
        Instant theInstant = null;
        for(int i = 0 ; i < instants.length ; i++){
            if(instants[i].isBefore(instant) && instants[i+1].isAfter(instant)){
                theInstant = instants[i];
            }
            if(i == instants.length - 1 &&  theInstant == null ){
                theInstant = instants[i];
            }
        }
        return theInstant;
    }
}
