package group1.view;

import org.linkki.framework.ui.component.Headline;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;

import group1.page.pro1Page;


@SpringView(name = MainView.NAME)
public class MainView extends VerticalLayout implements View {

    public static final String NAME = "";

    private static final long serialVersionUID = 1L;

    @Autowired
    public MainView() {
        addComponent(new Headline("linkki Example Web Application"));
        pro1Page page = new pro1Page();
        page.init();
        addComponent(page);

        setSizeFull();
        setExpandRatio(page, 1f);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub
    }


}