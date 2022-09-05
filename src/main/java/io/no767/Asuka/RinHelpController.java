package io.no767.Asuka;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping(path="/commands")
public class RinHelpController {
    @Autowired
    private RinHelpRepo rinHelpRepo;


    @GetMapping(path = "/all")
    public @ResponseBody JSONResponse getAllCommands() {
        Iterable<RinHelp> data = rinHelpRepo.findAll();
        List<RinHelp> list = Lists.newArrayList(data);
        if (list.size() == 0) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "No commands found"
            );
        }
        else {
            return new JSONResponse(new ResponseEntity(HttpStatus.OK).getStatusCodeValue(), list.size(), rinHelpRepo.findAll());
        }
    }

    @GetMapping(path = "/{module}")
    public @ResponseBody JSONResponse getCommandsByModule(@PathVariable String module) {
        Iterable<RinHelp> data = rinHelpRepo.findByModuleContains(module);
        List<RinHelp> list = Lists.newArrayList(data);

        if (list.size() == 0) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "No commands found"
            );
        }
        else {
            return new JSONResponse(new ResponseEntity(HttpStatus.OK).getStatusCodeValue(), list.size(), data);
        }
    }
}
