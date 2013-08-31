package com.devfest.client;

import com.devfest.client.Home.HomeView;
import com.devfest.client.Home.HomeViewImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class ClientFactory {
	private EventBus eventBus;
	private PlaceController placeController;

	// List of views
	private HomeView homeView;
	
	//Construct
	public ClientFactory(){
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
		homeView = new HomeViewImpl();
	}
	
	public EventBus getEventBus() {
		return eventBus;
	}

	public PlaceController getPlaceController() {
		return placeController;
	}

	public HomeView getHomeView() {
		if (homeView == null) {
			homeView = new HomeViewImpl();
		}
		return homeView;
	}
}
