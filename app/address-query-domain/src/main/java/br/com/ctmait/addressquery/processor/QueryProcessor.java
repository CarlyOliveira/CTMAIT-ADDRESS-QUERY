package br.com.ctmait.addressquery.processor;

@FunctionalInterface
public interface QueryProcessor<DomainObject> {
    DomainObject execute(final DomainObject domainObject);
}