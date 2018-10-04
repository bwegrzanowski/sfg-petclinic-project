package guru.springframework.sfgpetclinicproject.service;

import guru.springframework.sfgpetclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
