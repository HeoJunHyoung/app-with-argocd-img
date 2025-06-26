package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {

    @GetMapping(value = "/")
    public String basicTest() {
        return "app-with-argocd";
    }

    @GetMapping(value = "/api/argocd")
    public String actionsTest() {
        return "app-with-argocd version:0.0.1";
    }
}
