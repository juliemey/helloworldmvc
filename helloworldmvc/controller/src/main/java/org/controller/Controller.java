package org.controller;

import org.contract.IModel;
import org.contract.IView;

public class Controller {
	
	private final IView view;
	private final IModel model;
	
	public Controller (IView view, IModel model){
		this.view = view;
		this.model = model;
	}
	
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}

}