package com.devfest.client.Home;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface HomeView extends IsWidget {
	void setPresenter(Presenter presenter);

	public interface Presenter {
		void goTo(Place place);
	}
}
