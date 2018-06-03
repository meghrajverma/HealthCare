package controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get()
    {
        return "get mapping            " +
                "Welcome to Megh ";
    }

    @RequestMapping(value ="/post" ,method= RequestMethod.POST)
    public String post()
    {
        return "the post mapping" +
                "Welcome to Ram ";
    }


    @RequestMapping(value ="/put" ,method= RequestMethod.PUT)
    public String put()
    {
        return "the put mapping" +
                "Welcome to Rajasthan ";
    }


    @RequestMapping(value ="/delete" ,method= RequestMethod.DELETE)
    public String delete()
    {
        return "the delete mapping" +
                "welcome to Haryana";
    }

    }
