package org.xtext.example.tfl.library;

import java.util.*;
import java.util.Map.Entry;

public class TransportScheduler {
	private final Map<String, Integer> capacities = new HashMap<>();
    private final Map<String, Integer> speeds = new HashMap<>();
    private final Map<String, List<Route<String, String, Integer>>> routes = new HashMap<>();
    private final Map<String, Pair<Integer, Integer>> passengers = new HashMap<>();
    private final Map<String, Pair<String, Integer>> disruptions = new HashMap<>();

    public void addTransport(String name, int capacity, double d, List<Route<String, String, Integer>> route, int peak, int nonPeak) {
        capacities.put(name, capacity);
        speeds.put(name, (int) d);
        routes.put(name, route);
        passengers.put(name, new Pair<>(peak, nonPeak));
    }

    public void addDisruption(String transport, String stop, int duration) {
        disruptions.put(transport, new Pair<>(stop, duration)); // Store by transport name
    }

    public void generateSchedule() {
        System.out.println("===== Transport Schedules =====");
        
        for (Entry<String, List<Route<String, String, Integer>>> entry : routes.entrySet()) {
        	
            String transport = entry.getKey();
            List<Route<String, String, Integer>> routeList = entry.getValue();
            System.out.println("\nSchedule for " + transport + ":");
            
            int time = 0;
            for (Route<String, String, Integer> stop : routeList) {
        
                time += stop.getDuration();
                
                // If this route is disrupted, add delayed time to schedule
                if (isDisrupted(transport, stop.getStart())) {
                    System.out.println("  " + stop.getEnd() + "(delayed by " + disruptions.get(transport).getValue() + " min)" + " - Arrival: " + (time+disruptions.get(transport).getValue()) + " min");
                    time += disruptions.get(transport).getValue();
                }
                else {
                    System.out.println("  " + stop.getEnd() + " - Arrival: " + time + " min");
                }
            }
        }
    }
    
    private boolean isDisrupted(String transport, String stop) {
        return disruptions.containsKey(transport) && disruptions.get(transport).getKey().equals(stop);
    }

    // Calculates and prints fare of each transport
    public void calculateFare() {
        System.out.println("\n===== Fare Calculation =====");
        
        for (Map.Entry<String, Pair<Integer, Integer>> entry : passengers.entrySet()) {
        	
            String transport = entry.getKey();
            Pair<Integer, Integer> pax = entry.getValue();
            
            int capacity = capacities.get(transport);
            double peakFare = calculateFareForDemand(capacity, pax.getKey());
            double nonPeakFare = calculateFareForDemand(capacity, pax.getValue());
            
            System.out.println("\nTransport: " + transport);
            System.out.println("  Peak Fare: £" + peakFare);
            System.out.println("  Non-Peak Fare: £" + nonPeakFare);
        }
    }

    // Simple calculation of fare based on capacity of transport and demand
    private double calculateFareForDemand(int capacity, int demand) {
        double baseFare = 5.0;
        double demandFactor = demand > capacity * 0.8 ? 1.5 : demand < capacity * 0.5 ? 0.8 : 1.0;
        return baseFare * demandFactor;
    }
    
    // Helper class to mimic Xtend Pair
    public static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    
 // Helper class for Route
    public static class Route<S, E, D> {
        private final S start;
        private final E end;
        private final D duration;

        public Route(S start, E end, D duration) {
            this.start = start;
            this.end = end;
            this.duration = duration;
        }

        public S getStart() {
            return start;
        }

        public E getEnd() {
            return end;
        }
        
        public D getDuration(){
        	return duration;
        }
    }
}
