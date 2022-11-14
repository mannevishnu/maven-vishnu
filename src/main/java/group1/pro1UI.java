package group1;

import org.linkki.core.vaadin.component.LinkkiWidgetset;
import org.linkki.framework.ui.application.LinkkiUi;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringNavigator;

@Theme("p1")
@Widgetset(LinkkiWidgetset.NAME)
@SpringUI
public class pro1UI extends LinkkiUi {

    private static final long serialVersionUID = 1L;

    private final SpringNavigator springNavigator;

    @Autowired
    public pro1UI(SpringNavigator springNavigator) {
        super(new pro1ApplicationConfig());
        this.springNavigator = springNavigator;
    }

    @Override
    protected void configureNavigator(ViewDisplay applicationLayout) {
        springNavigator.init(this, applicationLayout);
    }

}
