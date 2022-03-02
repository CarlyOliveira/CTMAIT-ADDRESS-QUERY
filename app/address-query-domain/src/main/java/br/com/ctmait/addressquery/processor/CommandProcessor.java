package br.com.ctmait.addressquery.processor;

@FunctionalInterface
public interface CommandProcessor<DomainObject> {
    DomainObject execute(final DomainObject domainObject);
}