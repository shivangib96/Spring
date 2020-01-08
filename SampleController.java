package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController 
{
@RequestMapping(value="/welcome345")
public String welcome()
{
	return "Welcome";
}

}
