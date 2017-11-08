package me.travisgray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by ${TravisGray} on 11/7/2017.
 */




//This controller has a GET and a POST method, both mapped to /.
//        The showForm method returns the form template.
// It includes a PersonForm in its method signature so the template can associate form attributes with a PersonForm.
//        The processTvFormmethod accepts two arguments:
//        A TvShow object marked up with @Valid to gather the attributes filled out in the form you’re about to build.
//        A bindingResult object so you can test for and retrieve validation errors.
//        You can retrieve all the attributes from the form bound to the PersonForm object.
// In the code, you test for errors, and if so, send the user back to the original form template.
// In that situation, all the error attributes are displayed.
//        If all of the person’s attribute are valid, then it redirects the browser to the final results template.
@Controller
public class HomeController {
@GetMapping("/tvform")
    public String loadTvForm(Model model){

    model.addAttribute("tvshow" ,new Tvshow());
    return "tvform";
}
    @PostMapping("/tvform")
    public String processTvForm(@Valid Tvshow tvshow, BindingResult result){
        if (result.hasErrors()){
            return "tvform";
        }
        return "tvshowconfirm";
    }

}
