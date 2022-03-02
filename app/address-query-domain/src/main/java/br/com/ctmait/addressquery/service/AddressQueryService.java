package br.com.ctmait.addressquery.service;

@FunctionalInterface
public interface AddressQueryService<R> {
    R start(final R domainObject);
}
