package com.example.biprom.widgettest.widgettest.client.mycomponent;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface MyComponentServerRpc extends ServerRpc {

	// TODO example API
	public void clicked(MouseEventDetails mouseDetails);
	public void mouseDown(MouseEventDetails mouseDetails);
	public void mouseUp(MouseEventDetails mouseDetails);

}
