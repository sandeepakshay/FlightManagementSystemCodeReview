package com.capgemini.project.entities;

public class Search {

	    
	    public Airport sourceAirport;
	    public String DeparturTime;
	    public Airport destinationAirport;
	    
	    
		public Airport getSourceAirport() {
			return sourceAirport;
		}
		public void setSourceAirport(Airport sourceAirport) {
			this.sourceAirport = sourceAirport;
		}
		public String getDeparturTime() {
			return DeparturTime;
		}
		public void setDeparturTime(String departurTime) {
			DeparturTime = departurTime;
		}
		public Airport getDestinationAirport() {
			return destinationAirport;
		}
		public void setDestinationAirport(Airport destinationAirport) {
			this.destinationAirport = destinationAirport;
		}
	    
	    
}
