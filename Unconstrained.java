package tests.springhibernate;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@InitBinder
public void initBinder(WebDataBinder dataBinder) {
  dataBinder.setDisallowedFields("id");
  dataBinder.setDisallowedFields("activities");
  dataBinder.setDisallowedFields("controllers");
  dataBinder.registerCustomEditor(Activity.class, new ActivityEditor(activityRepository));
  dataBinder.registerCustomEditor(SpaceController.class, new SpaceControllerEditor(
      spaceControllerRepository));
}