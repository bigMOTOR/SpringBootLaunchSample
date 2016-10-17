package SpringBootLaunchSample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 * Nikolay Fiantsev on 18/12/15.
 */

//Creation of the controller which will be handle our requests

@RestController                       //- RestController annotation
@RequestMapping("/hello")

public class HeartBeat {

    //Mapping annotation (all HTTP GET at this method
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD}, produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> checkHeartbeat() {
        return new ResponseEntity<String>("SpringBootLaunchSample: I am fine.", HttpStatus.OK);
    }

}
