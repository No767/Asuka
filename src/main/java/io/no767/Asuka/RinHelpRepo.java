package io.no767.Asuka;

import io.no767.Asuka.RinHelp;
import org.springframework.data.repository.CrudRepository;

public interface RinHelpRepo extends CrudRepository<RinHelp, Integer> {
    Iterable<RinHelp> findByModuleContains(String module);

}
