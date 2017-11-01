package com.example.biprom.widgettest.widgettest;

import com.example.biprom.widgettest.widgettest.client.mycomponent.MyComponentClientRpc;
import com.example.biprom.widgettest.widgettest.client.mycomponent.MyComponentServerRpc;
import com.vaadin.shared.MouseEventDetails;
import com.example.biprom.widgettest.widgettest.client.mycomponent.MyComponentState;

public class MyComponent extends com.vaadin.ui.AbstractComponent {

	private MyComponentServerRpc rpc = new MyComponentServerRpc() {
		private int clickCount = 0;

		public void clicked(MouseEventDetails mouseDetails) {
//			// nag every 5:th click using RPC
//			if (++clickCount % 5 == 0) {
//				getRpcProxy(MyComponentClientRpc.class).alert(
//						"Ok, that's enough!");
//			}
//			// update shared state
//			getState().text = "You have clicked " + clickCount + " times";
		}

		@Override
		public void mouseDown(MouseEventDetails mouseDetails) {
			getRpcProxy(MyComponentClientRpc.class).alert(
					"Ok, Mouse is down!");
			
		}

		@Override
		public void mouseUp(MouseEventDetails mouseDetails) {
			getRpcProxy(MyComponentClientRpc.class).alert(
					"Ok, Mouse is up!");
			
		}
	};  

	public MyComponent(String text) {
		registerRpc(rpc);
		getState().text = text;
	}

	@Override
	public MyComponentState getState() {
		return (MyComponentState) super.getState();
	}
}
