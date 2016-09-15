import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Game newGame = new Game();
    Super.main(new String[] { "a", "b" });
    TeamA team = new TeamA();



    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("squadRoster",team.all());
      model.put("roster", Super.allRoster());
      if (team.all().size() == 3) {
        model.put("template", "templates/teamForm.vtl");
      } else {
        model.put("template", "templates/index.vtl");
      }

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      team.setTeamName(request.queryParams("teamName"));
      team.setMotto(request.queryParams("teamMotto"));
      team.setObjective(request.queryParams("teamObjective"));
      TeamA enemy = new TeamA();
      enemy.createEnemy(team);
      model.put("enemy", enemy);
      model.put("squadRoster2",enemy.all());
      model.put("team", team);
      model.put("squadRoster",team.all());
      model.put("roster", Super.allRoster());
      model.put("template", "templates/battlefield.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/super/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Super guy = Super.find(Integer.parseInt(request.params(":id")));
      model.put("super", guy);
      model.put("template", "templates/super.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/success/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Super guy = Super.find(Integer.parseInt(request.params(":id")));
      team.addSuper(guy);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/super", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Integer test = Integer.parseInt(request.params(":id"));
      System.out.println(test);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());





  }
}
