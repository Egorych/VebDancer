package com.example.web_dancer;

import com.vaadin.annotations.Theme;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class StartPageUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {

		final VerticalLayout verticalLayout = new VerticalLayout();
		final AbstractTextField sequenceField = new TextField("Sequence");
		setContent(verticalLayout);
		sequenceField.setCaption("Add sequence");
		Button button = new Button("Dance");
		Label label = new Label();

		sequenceField.addFocusListener(new FocusListener() {
			@Override
			public void focus(FocusEvent event) {
				sequenceField.clear();
			}
		});

		button.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				int quantityOfSteps = new TournamentOrganizer(sequenceField.getValue()).startTournament();
				verticalLayout.addComponent(label);
				label.setCaption("Number of steps: " + String.valueOf(quantityOfSteps));
			}
		});
		verticalLayout.addComponents(sequenceField, button, label);

	}

}
