package br.com.ctmait.addressquery.context;

import br.com.ctmait.addressquery.exception.ContextViolationException;

import java.io.Serializable;

@FunctionalInterface
public interface DomainObject<R> extends Serializable {

    R getDomainModel();

    default R boundedContextFilter(DomainObject domainObject){
        if (!this.getClass().equals(domainObject.getClass())){
            throw new ContextViolationException(this.getClass().getName());
        }

        return this.getDomainModel();
    }
}