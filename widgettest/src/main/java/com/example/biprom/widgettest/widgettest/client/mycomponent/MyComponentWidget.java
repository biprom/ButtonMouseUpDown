package com.example.biprom.widgettest.widgettest.client.mycomponent;

//import java.awt.Button;


import com.google.gwt.user.client.ui.Button;

// TODO extend any GWT Widget
public class MyComponentWidget extends Button {

	public static final String CLASSNAME = "mycomponent";

	public MyComponentWidget() {

		// setText("MyComponent sets the text via MyComponentConnector using MyComponentState");
		setStyleName(CLASSNAME);

	}

}