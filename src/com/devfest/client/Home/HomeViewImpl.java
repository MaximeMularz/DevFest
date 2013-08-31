package com.devfest.client.Home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HomeViewImpl extends Composite implements HomeView {

	private Presenter presenter;

	private static HomeViewUiBinder uiBinder = GWT
			.create(HomeViewUiBinder.class);

	interface HomeViewUiBinder extends UiBinder<Widget, HomeViewImpl> {
	}

	@UiHandler("home")
	void onClickToHome(ClickEvent clickEvent){
		Window.alert("home");
	}
	
	@UiHandler("inscription")
	void onClickToInscription(ClickEvent clickEvent){
		Window.alert("inscription");
	}
	
	@UiHandler("speakers")
	void onClickToSpeakers(ClickEvent clickEvent){
		Window.alert("Speakers");
	}
	
	@UiHandler("pratique")
	void onClickToPratique(ClickEvent clickEvent){
		Window.alert("pratique");
	}
	
	@UiHandler("presse")
	void onClickToPresse(ClickEvent clickEvent){
		Window.alert("presse");
	}
	
	@UiHandler("sponsors")
	void onClickToSponsors(ClickEvent clickEvent){
		Window.alert("sponsors");
	}
	
	public HomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		setupFacebookScript();
		setUpTwitter();
		setUpPlusScript();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	
	private void setUpPlusScript() {
		Document doc = Document.get();
	    ScriptElement script = doc.createScriptElement();
	    script.setSrc("https://apis.google.com/js/plusone.js");
	    script.setType("text/javascript");
	    script.setLang("javascript");
	    doc.getBody().appendChild(script);
	}
	
	private void setupFacebookScript() {
	    Document doc = Document.get();
	    ScriptElement script = doc.createScriptElement();
	    script.setSrc("http://connect.facebook.net/en_US/all.js#xfbml=1");
	    script.setType("text/javascript");
	    script.setLang("javascript");
	    doc.getBody().appendChild(script);
	  }
	
	private void setUpTwitter(){
		 Document doc = Document.get();
		    ScriptElement script = doc.createScriptElement();
		    script.setSrc("http://platform.twitter.com/widgets.js");
		    script.setType("text/javascript");
		    script.setLang("javascript");
		    doc.getBody().appendChild(script);
	}
}
